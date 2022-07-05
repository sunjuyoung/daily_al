package ch2;

public class WeatheStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        weatherData.setMeasure(345,123,67);
    }
}
