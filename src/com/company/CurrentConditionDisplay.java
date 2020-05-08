package com.company;

public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        subject.resgisterObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        Display();
    }

    @Override
    public void Display() {
        System.out.println("Current condition :"+temperature+"F degree and "+humidity+"%humidity");
    }
}
