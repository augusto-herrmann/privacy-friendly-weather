package org.secuso.privacyfriendlyweather.database;

import java.util.Date;

/**
 * This class is the database model for the forecasts table.
 */
public class Forecast {

    private int id;
    private int city_id;
    private long timestamp;
    private Date forecastFor;
    private int weatherID;
    private float temperature;
    private float humidity;
    private float pressure;

    private String city_name;

    public Forecast() {
    }

    public Forecast(int id, int city_id, long timestamp, Date forecastFor, int weatherID, float temperature, float humidity,
                    float pressure) {
        this.id = id;
        this.city_id = city_id;
        this.timestamp = timestamp;
        this.forecastFor = forecastFor;
        this.weatherID = weatherID;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    /**
     * @return Returns the ID of the record (which uniquely identifies the record).
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setForecastFor(Date forecastFor) {
        this.forecastFor = forecastFor;
    }

    /**
     * @return Returns the date and time for the forecast.
     */
    public Date getForecastTime() {
        return forecastFor;
    }

    /**
     * @param forecastFor The point of time for the forecast.
     */
    public void setForecastTime(Date forecastFor) {
        this.forecastFor = forecastFor;
    }

    /**
     * @return Returns the point of time when the data was inserted into the database in Unix, UTC.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp The point of time to set when the data was inserted into the database in
     *                  Unix, UTC.
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    /**
     * @return Returns the weather condition ID.
     */
    public int getWeatherID() {
        return weatherID;
    }

    /**
     * @param weatherID The weather condition ID to set.
     */
    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }

    /**
     * @return Returns the current temperature in Celsius.
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @param temperature The current temperature to set in Celsius.
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * @return Returns the humidity value in percent.
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * @param humidity The humidity value in percent to set.
     */
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    /**
     * @return Returns the air pressure value in hectopascal (hPa).
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * @param pressure The air pressure value in hectopascal (hPa) to set.
     */
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
}
