package oop.observer.weather;

public class WeatherData {

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumedity();
        float pressure = getPressure();

        //디스플레이 갱신
        currentConditionDisplay.update
    }

    private float getPressure() {
    }

    private float getHumedity() {
    }

    private float getTemperature() {
    }
}
