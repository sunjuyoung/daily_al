package ch2;

public class CurrentDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.notifyObserver();
    }


    @Override
    public void display() {
        System.out.println("현재 습도"+temp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }


}
