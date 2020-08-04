package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStation() {
        Radio radio = new Radio();
        assertEquals(0,radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0,radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(0,radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        assertEquals(0,radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(5);
        assertEquals(5,radio.getCurrentRadioStation());


    }

    @Test
    void getVolumeLevel() {
        Radio radio = new Radio();
        assertEquals(0,radio.getVolumeLevel());
    }

    @Test
    void setVolumeLevel() {
        Radio radio = new Radio();
        radio.setVolumeLevel(11);
        assertEquals(0,radio.getVolumeLevel());
        radio.setVolumeLevel(-1);
        assertEquals(0,radio.getVolumeLevel());
        radio.setVolumeLevel(10);
        assertEquals(10,radio.getVolumeLevel());
        radio.setVolumeLevel(0);
        assertEquals(0,radio.getVolumeLevel());
    }

    @Test
    public void shouldChangeRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation(radio.getCurrentRadioStation());
        assertEquals(9, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation(radio.getCurrentRadioStation());
        assertEquals(4, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation(radio.getCurrentRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation(radio.getCurrentRadioStation());
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        radio.setVolumeLevel(10);
        radio.increaseVolume(radio.getVolumeLevel());
        assertEquals(10, radio.getVolumeLevel());
        radio.decreaseVolume(radio.getVolumeLevel());
        assertEquals(9, radio.getVolumeLevel());
        radio.setVolumeLevel(0);
        radio.increaseVolume(radio.getVolumeLevel());
        assertEquals(1, radio.getVolumeLevel());
        radio.setVolumeLevel(0);
        radio.decreaseVolume(radio.getVolumeLevel());
        assertEquals(0, radio.getVolumeLevel());


    }


}