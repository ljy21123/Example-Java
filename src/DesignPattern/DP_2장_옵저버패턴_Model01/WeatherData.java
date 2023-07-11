package DesignPattern.DP_2장_옵저버패턴_Model01;

public class WeatherData {

    private CurrentConditionsDisplay currentConditions;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    private float temperature = 0.0f;
    private float humidity = 0.0f;
    private float pressure = 0.0f;

    /** 날씨 정보 */
    public WeatherData(CurrentConditionsDisplay currentConditions, StatisticsDisplay statisticsDisplay, ForecastDisplay forecastDisplay) {
        this.currentConditions = currentConditions;
        this.statisticsDisplay = statisticsDisplay;
        this.forecastDisplay = forecastDisplay;
    }

    /** 측정값 설정 */
    public void setMeasurements(float temp, float humidity, float pressure) {
        setTemperature(temp);
        setHumidity(humidity);
        setPressure(pressure);

        measurementsChanged();
    }

    /** 측정값 변경 */
    private void measurementsChanged() {    //setMeasurements()에서 호출하므로 public > private로 변경
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditions.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
