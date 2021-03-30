package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setStationNumberInRangeTest(){
        Radio radio = new Radio();
        // Проверяем любой положительный сценарий: номер в диапазоне [0; 9]
        int number = 5;
        radio.setStationNumber(number);

        assertEquals(number, radio.getStationNumber());
    }

    @Test
    void setStationNumberLessMinTest(){
        Radio radio = new Radio();
        // Проверяем, если номер радиостанции < MIN
        int number = -1;
        // Ожидаемый результат
        int expected = 9;

        radio.setStationNumber(number);

        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void setStationNumberMoreMaxTest(){
        Radio radio = new Radio();
        // Проверяем, если номер радиостанции > MAX
        int number = 10;
        // Ожидаемый результат
        int expected = 0;

        radio.setStationNumber(number);

        assertEquals(expected, radio.getStationNumber());
    }

    @Test
    void setVolumeInRangeTest(){
        Radio radio = new Radio();
        // Проверяем любой положительный сценарий: громкость в диапазоне [0; 10]
        int volume = 5;
        radio.setVolume(volume);

        assertEquals(volume, radio.getVolume());
    }

    @Test
    void setVolumeLessMinTest(){
        Radio radio = new Radio();
        // Проверяем, если громкость < MIN
        int volume = -1;
        // Ожидаемый результат
        int expected = 0;

        radio.setVolume(volume);

        assertEquals(expected, radio.getVolume());
    }

    @Test
    void setVolumeMoreMaxTest(){
        Radio radio = new Radio();
        // Проверяем, если громкость > MAX
        int volume = 11;
        // Ожидаемый результат
        int expected = 10;

        radio.setVolume(volume);

        assertEquals(expected, radio.getVolume());
    }
}
