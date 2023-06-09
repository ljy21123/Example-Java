package DesignPattern.DP_2장_옵저버패턴_Model03;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-----------------------------------------------");
        weatherData.setMeasurements(82, 70, 30.4f);
        System.out.println("-----------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
