package DP_2장_옵저버패턴_Model01;

public class WeatherStation {

    public static void main(String[] args) {

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        WeatherData weatherData = new WeatherData(currentDisplay, statisticsDisplay, forecastDisplay);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("-----------------------------------------------");
        weatherData.setMeasurements(82, 70, 30.4f);
        System.out.println("-----------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
