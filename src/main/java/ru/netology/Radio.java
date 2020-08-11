package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int volumeLevel;
    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;
    private int maxCurrentRadioStation = 10;

    public Radio() {
    }

    public Radio(int maxCurrentRadioStation) {
        this.maxCurrentRadioStation = maxCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxCurrentRadioStation)
            return;
        if (currentRadioStation<0)
            return;
        this.currentRadioStation = currentRadioStation;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel>maxVolumeLevel)
            return;
        if (volumeLevel<minVolumeLevel)
            return;
        this.volumeLevel = volumeLevel;
    }

    public int nextRadioStation() {
        if (currentRadioStation == maxCurrentRadioStation) {
            currentRadioStation = 0;
            return currentRadioStation;
        } else {
            return this.currentRadioStation++;
        }
    }

    public int prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxCurrentRadioStation;
            return currentRadioStation;
        } else {
            return this.currentRadioStation--;
        }
    }


    public void increaseVolume() {
        if (volumeLevel == maxVolumeLevel) {
            return;
        }

        this.volumeLevel++;


    }

    public void decreaseVolume() {
        if (volumeLevel == minVolumeLevel) {
            return;
        }

        this.volumeLevel--;

    }
}
