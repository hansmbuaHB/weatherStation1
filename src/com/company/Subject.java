package com.company;

public interface Subject {
    public void resgisterObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver( );


}
