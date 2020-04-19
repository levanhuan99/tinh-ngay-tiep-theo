import org.junit.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayTest {
    @Test
    public void  testNextDay(){

        int day=29;

        int expected=30;

        int result=NextDay.findNextDay(day);
        assertEquals(expected,result);

    }
    @Test
    public void testNextDay1(){
        int day=31;

        int expected=1;

        int result=NextDay.findNextDay(day);
        assertEquals(expected,result);
    }
    @Test
    public void testNextDay2(){
        int day=-2;

        int expected=0;

        int result=NextDay.findNextDay(day);
        assertEquals(expected,result);
    }

}