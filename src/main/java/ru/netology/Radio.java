package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int volumeLevel;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if (volumeLevel>10){
            return;
        }
        if (volumeLevel<0){
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public int nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return currentRadioStation;
        } else {
            return this.currentRadioStation++;
        }
    }

    public int prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return currentRadioStation;
        } else {
            return this.currentRadioStation--;
        }
    }


    public void increaseVolume() {
        if (volumeLevel == 10) {
            return;
        }

        this.volumeLevel++;


    }

    public void decreaseVolume() {
        if (volumeLevel == 0) {
            return;
        }

        this.volumeLevel--;

    }
}
