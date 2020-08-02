package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }


    @Test
    public void shouldChangeFields() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());
        conditioner.setMinTemperature(10);
        assertEquals(10, conditioner.getMinTemperature());
        conditioner.setCurrentTemperature(31);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(9);
        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
        conditioner.setOn(true);
        assertTrue(conditioner.isOn());

    }

    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(26, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature(conditioner.getCurrentTemperature());
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseTemperature(){
     Conditioner conditioner =new Conditioner();
     conditioner.setMaxTemperature(30);
     conditioner.setMinTemperature(10);
     conditioner.setCurrentTemperature(15);
     conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
     assertEquals(14,conditioner.getCurrentTemperature());
     conditioner.setCurrentTemperature(10);
     conditioner.decreaseCurrentTemperature(conditioner.getCurrentTemperature());
     assertEquals(10,conditioner.getCurrentTemperature());
    }

}