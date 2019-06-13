package level02.arrays.bucketingorsorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelBookingsPossibleTest {

    HotelBookingsPossible hotelBookingsPossible;

    @Before
    public void before() {
        hotelBookingsPossible = new HotelBookingsPossible();
    }

    @Test
    public void test1() {
        ArrayList<Integer> arrivals = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> departures = new ArrayList<>(Arrays.asList(2, 6, 8));
        boolean available = hotelBookingsPossible.hotel(arrivals, departures, 1);
        assertFalse(available);
    }

    @Test
    public void test2() {
        ArrayList<Integer> arrivals = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> departures = new ArrayList<>(Arrays.asList(10, 2, 6, 14));
        boolean available = hotelBookingsPossible.hotel(arrivals, departures, 4);
        assertTrue(available);
    }

    @Test
    public void test3() {
        ArrayList<Integer> arrivals = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> departures = new ArrayList<>(Arrays.asList(10, 2, 6, 14, 3));
        boolean available = hotelBookingsPossible.hotel(arrivals, departures, 4);
        assertFalse(available);
    }
}
