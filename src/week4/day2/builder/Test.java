package week4.day2.builder;

import static week4.day2.builder.Weather.WeatherBuilder;

public class Test {

    public static void main(String[] args) {

        Weather weather = new WeatherBuilder()
                .setPressure(2000)
                .setWindSpeed(5)
                .setTemperature(33)
                .setHumidity(75)
                .build();

    }

}
