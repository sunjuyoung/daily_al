package ch2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temp,humidity,pressure);
        }
    }

    public void measureChanged(){
        notifyObserver();
    }



    public void setMeasure(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measureChanged();
    }



    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
