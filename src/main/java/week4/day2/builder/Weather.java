package week4.day2.builder;

final public class Weather {

    private final int temperature;
    private final int windSpeed;
    private final int pressure;
    private final int humidity;

    public Weather(int temperature, int windSpeed, int pressure, int humidity) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("temperature=").append(temperature);
        sb.append(", windSpeed=").append(windSpeed);
        sb.append(", pressure=").append(pressure);
        sb.append(", humidity=").append(humidity);
        sb.append('}');
        return sb.toString();
    }
    
    
    public static class WeatherBuilder {

        private int temperature;
        private int windSpeed;
        private int pressure;
        private int humidity;

        public WeatherBuilder setTemperature(int temperature) {
            this.temperature = temperature;
            return this;
        }

        public WeatherBuilder setWindSpeed(int windSpeed) {
            this.windSpeed = windSpeed;
            return this;
        }

        public WeatherBuilder setPressure(int pressure) {
            this.pressure = pressure;
            return this;
        }

        public WeatherBuilder setHumidity(int humidity) {
            this.humidity = humidity;
            return this;
        }

        public Weather build(){
            return new Weather(temperature, windSpeed, pressure, humidity);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("WeatherBuilder{");
            sb.append("temperature=").append(temperature);
            sb.append(", windSpeed=").append(windSpeed);
            sb.append(", pressure=").append(pressure);
            sb.append(", humidity=").append(humidity);
            sb.append('}');
            return sb.toString();
        }
    }
    
}
