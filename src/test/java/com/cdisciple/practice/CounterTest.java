package com.cdisciple.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CounterTest {
    Counter counter;

    @Test
    public void testCounterIncrement(){
        counter = new Counter("WarCounter");
        counter.increment();
        assertEquals(1, counter.getCurrentValue());
    }

    @Test
    public void testCountertoString(){
        counter = new Counter("TimerCounter");
        assertEquals("The TimerCounter Counter object has a value of 0", counter.toString());
    }
}
