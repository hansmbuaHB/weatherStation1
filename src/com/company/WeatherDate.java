package com.company;

import java.util.ArrayList;

public class WeatherDate implements Subject {
    private ArrayList arrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate(){
        arrayList = new ArrayList<String>();

    }

    @Override
    public void resgisterObserver(Observer o) {
        arrayList.add(o);

    }

    @Override
    public void removeObserver(Observer observer) {
     int index = arrayList.indexOf(observer);
     if (index >= 0)
         arrayList.remove(index);
    }

    @Override
    public void notifyObserver() {
       for (int i = 0 ; i < arrayList.size(); i++){
           Observer observer1 = (Observer) arrayList.get(i);
           observer1.update(temperature,humidity,pressure);
       }

    }

    public void MeasurementChanged(){
       notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        MeasurementChanged();
    }
}
