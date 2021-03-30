package ru.netology.radio;

public class Radio {
    private static final int MIN_STATION_NUMBER = 0;
    private static final int MAX_STATION_NUMBER = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 10;

    // Номер текущей (прослушиваемой) радиостанции
    private int stationNumber;
    // Громкость звука
    private int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if(stationNumber > MAX_STATION_NUMBER) {
            stationNumber = MIN_STATION_NUMBER;
        } else if(stationNumber < MIN_STATION_NUMBER) {
            stationNumber = MAX_STATION_NUMBER;
        }

        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
        } else if(volume <MIN_VOLUME) {
            volume = MIN_VOLUME;
        }

        this.volume = volume;
    }
}
