package tdd;


import chapter3.Clock;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {

    Clock clock;


    @Test
    public void TestThatClockExist(){
        Clock clock = new Clock(23,59,59);
        assertNotNull(clock);
    }
    @Test
    public void getHourTest(){
        clock = new Clock(23,59,59);
        int hour =clock.getHour();
        assertEquals(23,hour);
    }

    @Test
    public void setHourTest(){
        clock = new Clock(23,59,59);
        clock.setHour(23);
        assertEquals(23,clock.getHour());
    }
    @Test
    public void getMinuteTest(){
        clock = new Clock(23,59,59);
        assertEquals(59,clock.getMinute());
    }
    @Test
    public void setMinuteTest(){
        clock = new Clock(23,59,59);
        clock.setMinute(59);
        assertEquals(59,clock.getMinute());
    }
    @Test
    public void getSecondsTest(){
        clock = new Clock(23,59,59);
        int seconds = clock.getSecond();
        assertEquals(59,seconds);
    }
    @Test
    public void setSecondsTest(){
        clock = new Clock(23,59,59);
        clock.setSecond(59);
        assertEquals(59,clock.getSecond());
    }

}


