package pack;

import pack.Flight;
import pack.Airport;
import pack.Time1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tester for Airport class
 * NOTE: THESE TESTER ISN'T COMPLETE, TESTER WILL BE FULLY FINISHED AFTER COURSE
 * INSTRUCTORS WILL GIVE NEW FURTHER INSTRUCTIONS !!
 * NOTE: TESTER TESTS AIRPORT METHODS, NOT ANY OTHER CLASSES!
 * NOTE: ANY INCORRECT METHODS BUILT IN FLIGHT OR TIME1 CLASSES MAY AND WILL
 * RESULT IN FAILURE ON THIS TEST.
 *
 * @author Leon Piatti
 * @version 5.4.2022
 */

public class AirportTester {

    private Airport flightBoardMilan, flightBoardTelAviv, flightBoardTokyo;
    private Flight flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11,
            flight12, flight13, flight14, flight15;
    private Flight flight16, flight17, flight18, flight19, flight20, flight21, flight22, flight23, flight24, flight25,
            flight26, flight27, flight28, flight29, flight30;

    @BeforeEach
    public void setUp() {
        flight1 = new Flight("Amsterdam", "Tel-aviv", 1, 5, 205, 300, 300);// Tel-aviv1
        flight2 = new Flight("Madrid", "Milan", 8, 20, 105, 128, 60); // Milan1
        flight3 = new Flight("Warsaw", "Lyon", 22, 45, 90, 105, 78);
        flight4 = new Flight("Milan", "Paris", 11, 55, 120, 244, 52);// Milan2
        flight5 = new Flight("Milan", "Tokyo", 7, 80, 700, 250, 999); // Milan3 // Tokyo1 // 7:00
        flight6 = new Flight("New-York", "Tel-aviv", 2, 25, 900, 250, 1300); // Tel-aviv2
        flight7 = new Flight("Toronto", "Manchester", 18, 30, 660, 208, 1190);
        flight8 = new Flight("Madrid", "Milan", 9, 30, 138, 120, 26);// Milan4
        flight9 = new Flight("Tel-aviv", "Bucharest", 15, 15, 145, 260, 105); // Tel-aviv3
        flight10 = new Flight("Tel-aviv", "Barcelona", 6, 35, 265, 174, 240); // Tel-aviv4
        flight11 = new Flight("Seoul", "London", 21, 0, 780, 235, 970);
        flight12 = new Flight("Milan", "London", 5, 45, 350, 250, 285);// Milan5
        flight13 = new Flight("Amsterdam", "Tel-aviv", 14, 30, 420, 142, 420); // Tel-aviv5
        flight14 = new Flight("Tokyo", "Paris", 23, 20, 815, 248, 1124); // Tokyo2
        flight15 = new Flight("Tokyo", "Berlin", 16, 50, 820, 250, 1099); // Tokyo3
        flight16 = new Flight("Prague", "Tel-aviv", 20, 35, 260, 202, 270); // Tel-aviv6
        flight17 = new Flight("Tokyo", "Seoul", 4, 25, 150, 171, 155); // Tokyo4
        flight18 = new Flight("Tokyo", "Madrid", 19, 20, 735, 250, 1122); // Tokyo5
        flight19 = new Flight("Monaco", "Oslo", 11, 40, 210, 95, 540);
        flight20 = new Flight("Stockholm", "Milan", 2, 55, 232, 250, 241); // Milan6
        flight21 = new Flight("Stockholm", "Helsinki", 3, 15, 90, 141, 99);
        flight22 = new Flight("Tel-aviv", "New Delhi", 16, 10, 640, 400, 420); // Tel-aviv7
        flight23 = new Flight("Bangkok", "Tel-aviv", 13, 30, 780, 300, 490); // Tel-aviv8
        flight24 = new Flight("Cape Town", "Milan", 5, 40, 385, 248, 354); // Milan7
        flight25 = new Flight("Los Angeles", "Washington", 15, 25, 170, 167, 109);
        flight26 = new Flight("Milan", "Tel-aviv", 15, 45, 268, 250, 250); // Milan8 // Tel-aviv9
        flight27 = new Flight("Tokyo", "Berlin", 18, 5, 820, 214, 1024); // Tokyo6
        flight28 = new Flight("Moscow", "Tokyo", 14, 0, 690, 198, 864); // Tokyo7
        flight29 = new Flight("Istanbul", "Milan", 6, 50, 162, 250, 140); // Milan9
        flight30 = new Flight("Porto", "Madrid", 8, 25, 105, 300, 186);

        // initializing Airport objects & and filling arrays
        // Milan Airport
        flightBoardMilan = new Airport("Milan");

        flightBoardMilan.addFlight(flight1);
        flightBoardMilan.addFlight(flight2);
        flightBoardMilan.addFlight(flight3);
        flightBoardMilan.addFlight(flight4);
        flightBoardMilan.addFlight(flight5);
        flightBoardMilan.addFlight(flight6);
        flightBoardMilan.addFlight(flight7);
        flightBoardMilan.addFlight(flight8);
        flightBoardMilan.addFlight(flight9);
        flightBoardMilan.addFlight(flight10);
        flightBoardMilan.addFlight(flight11);
        flightBoardMilan.addFlight(flight12);
        flightBoardMilan.addFlight(flight13);
        flightBoardMilan.addFlight(flight14);
        flightBoardMilan.addFlight(flight15);
        flightBoardMilan.addFlight(flight16);
        flightBoardMilan.addFlight(flight17);
        flightBoardMilan.addFlight(flight18);
        flightBoardMilan.addFlight(flight19);
        flightBoardMilan.addFlight(flight20);
        flightBoardMilan.addFlight(flight21);
        flightBoardMilan.addFlight(flight22);
        flightBoardMilan.addFlight(flight23);
        flightBoardMilan.addFlight(flight24);
        flightBoardMilan.addFlight(flight25);
        flightBoardMilan.addFlight(flight26);
        flightBoardMilan.addFlight(flight27);
        flightBoardMilan.addFlight(flight28);
        flightBoardMilan.addFlight(flight29);
        flightBoardMilan.addFlight(flight30);

        // Tel-aviv Airport
        flightBoardTelAviv = new Airport("Tel-aviv");

        flightBoardTelAviv.addFlight(flight1);
        flightBoardTelAviv.addFlight(flight2);
        flightBoardTelAviv.addFlight(flight3);
        flightBoardTelAviv.addFlight(flight4);
        flightBoardTelAviv.addFlight(flight5);
        flightBoardTelAviv.addFlight(flight6);
        flightBoardTelAviv.addFlight(flight7);
        flightBoardTelAviv.addFlight(flight8);
        flightBoardTelAviv.addFlight(flight9);
        flightBoardTelAviv.addFlight(flight10);
        flightBoardTelAviv.addFlight(flight11);
        flightBoardTelAviv.addFlight(flight12);
        flightBoardTelAviv.addFlight(flight13);
        flightBoardTelAviv.addFlight(flight14);
        flightBoardTelAviv.addFlight(flight15);
        flightBoardTelAviv.addFlight(flight16);
        flightBoardTelAviv.addFlight(flight17);
        flightBoardTelAviv.addFlight(flight18);
        flightBoardTelAviv.addFlight(flight19);
        flightBoardTelAviv.addFlight(flight20);
        flightBoardTelAviv.addFlight(flight21);
        flightBoardTelAviv.addFlight(flight22);
        flightBoardTelAviv.addFlight(flight23);
        flightBoardTelAviv.addFlight(flight24);
        flightBoardTelAviv.addFlight(flight25);
        flightBoardTelAviv.addFlight(flight26);
        flightBoardTelAviv.addFlight(flight27);
        flightBoardTelAviv.addFlight(flight28);
        flightBoardTelAviv.addFlight(flight29);
        flightBoardTelAviv.addFlight(flight30);

        // Tokyo Airport
        flightBoardTokyo = new Airport("Tokyo");

        flightBoardTokyo.addFlight(flight1);
        flightBoardTokyo.addFlight(flight2);
        flightBoardTokyo.addFlight(flight3);
        flightBoardTokyo.addFlight(flight4);
        flightBoardTokyo.addFlight(flight5);
        flightBoardTokyo.addFlight(flight6);
        flightBoardTokyo.addFlight(flight7);
        flightBoardTokyo.addFlight(flight8);
        flightBoardTokyo.addFlight(flight9);
        flightBoardTokyo.addFlight(flight10);
        flightBoardTokyo.addFlight(flight11);
        flightBoardTokyo.addFlight(flight12);
        flightBoardTokyo.addFlight(flight13);
        flightBoardTokyo.addFlight(flight14);
        flightBoardTokyo.addFlight(flight15);
        flightBoardTokyo.addFlight(flight16);
        flightBoardTokyo.addFlight(flight17);
        flightBoardTokyo.addFlight(flight18);
        flightBoardTokyo.addFlight(flight19);
        flightBoardTokyo.addFlight(flight20);
        flightBoardTokyo.addFlight(flight21);
        flightBoardTokyo.addFlight(flight22);
        flightBoardTokyo.addFlight(flight23);
        flightBoardTokyo.addFlight(flight24);
        flightBoardTokyo.addFlight(flight25);
        flightBoardTokyo.addFlight(flight26);
        flightBoardTokyo.addFlight(flight27);
        flightBoardTokyo.addFlight(flight28);
        flightBoardTokyo.addFlight(flight29);
        flightBoardTokyo.addFlight(flight30);

    }

    @Test
    @DisplayName("addFlight")
    public void addFlightMethod() {
        // checks if flights added correctly
        // Milan Airport
        assertTrue(flightBoardMilan.addFlight(flight2));
        assertTrue(flightBoardMilan.addFlight(flight5));
        assertTrue(flightBoardMilan.addFlight(flight8));
        assertTrue(flightBoardMilan.addFlight(flight12));
        assertTrue(flightBoardMilan.addFlight(flight24));
        assertTrue(flightBoardMilan.addFlight(flight26));
        assertTrue(flightBoardMilan.addFlight(flight29));

        assertFalse(flightBoardMilan.addFlight(flight1));
        assertFalse(flightBoardMilan.addFlight(flight3));
        assertFalse(flightBoardMilan.addFlight(flight9));
        assertFalse(flightBoardMilan.addFlight(flight11));
        assertFalse(flightBoardMilan.addFlight(flight16));
        assertFalse(flightBoardMilan.addFlight(flight17));
        assertFalse(flightBoardMilan.addFlight(flight28));

        // Tel-aviv Airport

        assertTrue(flightBoardTelAviv.addFlight(flight1));
        assertTrue(flightBoardTelAviv.addFlight(flight6));
        assertTrue(flightBoardTelAviv.addFlight(flight10));
        assertTrue(flightBoardTelAviv.addFlight(flight13));
        assertTrue(flightBoardTelAviv.addFlight(flight16));
        assertTrue(flightBoardTelAviv.addFlight(flight23));
        assertTrue(flightBoardTelAviv.addFlight(flight26));

        assertFalse(flightBoardTelAviv.addFlight(flight2));
        assertFalse(flightBoardTelAviv.addFlight(flight7));
        assertFalse(flightBoardTelAviv.addFlight(flight11));
        assertFalse(flightBoardTelAviv.addFlight(flight17));
        assertFalse(flightBoardTelAviv.addFlight(flight24));
        assertFalse(flightBoardTelAviv.addFlight(flight27));
        assertFalse(flightBoardTelAviv.addFlight(flight30));

        // Tokyo Airport

        assertTrue(flightBoardTokyo.addFlight(flight5));
        assertTrue(flightBoardTokyo.addFlight(flight14));
        assertTrue(flightBoardTokyo.addFlight(flight15));
        assertTrue(flightBoardTokyo.addFlight(flight17));
        assertTrue(flightBoardTokyo.addFlight(flight28));
        assertTrue(flightBoardTokyo.addFlight(flight27));
        assertTrue(flightBoardTokyo.addFlight(flight28));

        assertFalse(flightBoardTokyo.addFlight(flight4));
        assertFalse(flightBoardTokyo.addFlight(flight7));
        assertFalse(flightBoardTokyo.addFlight(flight9));
        assertFalse(flightBoardTokyo.addFlight(flight16));
        assertFalse(flightBoardTokyo.addFlight(flight20));
        assertFalse(flightBoardTokyo.addFlight(flight22));
        assertFalse(flightBoardTokyo.addFlight(flight25));

    }

    @Test
    @DisplayName("removeFlight")
    public void removeFlightMethod() {
        // checks if flights got removed from the array airport correctly
        // Milan Airport
        assertTrue(flightBoardMilan.removeFlight(flight2));
        assertTrue(flightBoardMilan.removeFlight(flight5));
        assertTrue(flightBoardMilan.removeFlight(flight8));
        assertTrue(flightBoardMilan.removeFlight(flight12));
        assertTrue(flightBoardMilan.removeFlight(flight24));
        assertTrue(flightBoardMilan.removeFlight(flight26));
        assertTrue(flightBoardMilan.removeFlight(flight29));
        assertTrue(flightBoardMilan.removeFlight(flight4));

        // flight4 was just removed therefore it is not on the board resulting in false
        assertFalse(flightBoardMilan.removeFlight(flight4));

        // flight20 last flight to remove
        assertTrue(flightBoardMilan.removeFlight(flight20));

        // flights were removed already, array is empty
        assertFalse(flightBoardMilan.removeFlight(flight8));
        assertFalse(flightBoardMilan.removeFlight(flight24));

        // those flights were never on the board on the first place
        assertFalse(flightBoardMilan.removeFlight(flight1));
        assertFalse(flightBoardMilan.removeFlight(flight3));
        assertFalse(flightBoardMilan.removeFlight(flight9));
        assertFalse(flightBoardMilan.removeFlight(flight11));
        assertFalse(flightBoardMilan.removeFlight(flight16));
        assertFalse(flightBoardMilan.removeFlight(flight17));
        assertFalse(flightBoardMilan.removeFlight(flight28));

        // Tel-aviv Airport

        assertTrue(flightBoardTelAviv.removeFlight(flight1));
        assertTrue(flightBoardTelAviv.removeFlight(flight6));
        assertTrue(flightBoardTelAviv.removeFlight(flight10));
        assertTrue(flightBoardTelAviv.removeFlight(flight13));
        assertTrue(flightBoardTelAviv.removeFlight(flight16));

        // those flights just got removed therefore should result in false
        assertFalse(flightBoardTelAviv.removeFlight(flight6));
        assertFalse(flightBoardTelAviv.removeFlight(flight13));

        // last flight to get removed
        assertTrue(flightBoardTelAviv.removeFlight(flight23));
        assertTrue(flightBoardTelAviv.removeFlight(flight26));
        assertTrue(flightBoardTelAviv.removeFlight(flight22));
        assertTrue(flightBoardTelAviv.removeFlight(flight9));

        // flights were removed already, array is empty
        assertFalse(flightBoardTelAviv.removeFlight(flight10));
        assertFalse(flightBoardTelAviv.removeFlight(flight16));
        assertFalse(flightBoardTelAviv.removeFlight(flight22));

        // those flights were never on the board on the first place
        assertFalse(flightBoardTelAviv.removeFlight(flight2));
        assertFalse(flightBoardTelAviv.removeFlight(flight7));
        assertFalse(flightBoardTelAviv.removeFlight(flight11));
        assertFalse(flightBoardTelAviv.removeFlight(flight17));
        assertFalse(flightBoardTelAviv.removeFlight(flight24));
        assertFalse(flightBoardTelAviv.removeFlight(flight27));
        assertFalse(flightBoardTelAviv.removeFlight(flight30));

        // Tokyo Airport

        assertTrue(flightBoardTokyo.removeFlight(flight5));
        // assertTrue(flightBoardTokyo.removeFlight(flight14));
        assertTrue(flightBoardTokyo.removeFlight(flight15));
        assertTrue(flightBoardTokyo.removeFlight(flight17));
        assertTrue(flightBoardTokyo.removeFlight(flight28));

        // those flights just got removed therefore should result in false
        assertFalse(flightBoardTokyo.removeFlight(flight15));
        assertFalse(flightBoardTokyo.removeFlight(flight28));

        // last flights to get removed
        assertTrue(flightBoardTokyo.removeFlight(flight18));
        assertTrue(flightBoardTokyo.removeFlight(flight27));

        // flights were removed already, array is empty
        assertFalse(flightBoardTokyo.removeFlight(flight5));
        // assertFalse(flightBoardTokyo.removeFlight(flight14));
        assertFalse(flightBoardTokyo.removeFlight(flight27));

        // those flights were never on board on the first place
        assertFalse(flightBoardTokyo.removeFlight(flight4));
        assertFalse(flightBoardTokyo.removeFlight(flight7));
        assertFalse(flightBoardTokyo.removeFlight(flight9));
        assertFalse(flightBoardTokyo.removeFlight(flight16));
        assertFalse(flightBoardTokyo.removeFlight(flight20));
        assertFalse(flightBoardTokyo.removeFlight(flight22));
        assertFalse(flightBoardTokyo.removeFlight(flight25));

    }

    @Test
    @DisplayName("firstFlightFromOrigin")
    public void firstFlightFromOriginMethod() {
        // firstFlightFromOrigin Method checks the first flight to departure from the
        // origin given as a parameter sent to method itself, only inside the specific
        // Airport (Array)

        // place is airport
        assertTrue(flight12.getDeparture().equals(flightBoardMilan.firstFlightFromOrigin("Milan")));
        assertTrue(flight10.getDeparture().equals(flightBoardTelAviv.firstFlightFromOrigin("Tel-aviv")));
        assertTrue(flight17.getDeparture().equals(flightBoardTokyo.firstFlightFromOrigin("Tokyo")));

        // place is different places from airport cities
        assertTrue(flight2.getDeparture().equals(flightBoardMilan.firstFlightFromOrigin("Madrid")));
        assertTrue(flight1.getDeparture().equals(flightBoardTelAviv.firstFlightFromOrigin("Amsterdam")));
        assertTrue(flight28.getDeparture().equals(flightBoardTokyo.firstFlightFromOrigin("Moscow")));

        // removing flights for change
        flightBoardMilan.removeFlight(flight12);
        flightBoardTelAviv.removeFlight(flight10);
        flightBoardTokyo.removeFlight(flight17);

        // earliest flight has been changed
        assertTrue(flight5.getDeparture().equals(flightBoardMilan.firstFlightFromOrigin("Milan")));
        assertTrue(flight9.getDeparture().equals(flightBoardTelAviv.firstFlightFromOrigin("Tel-aviv")));
        assertTrue(flight15.getDeparture().equals(flightBoardTokyo.firstFlightFromOrigin("Tokyo")));

        // flights aren't first to departure
        assertFalse(flight4.getDeparture().equals(flightBoardMilan.firstFlightFromOrigin("Milan")));
        assertFalse(flight22.getDeparture().equals(flightBoardTelAviv.firstFlightFromOrigin("Tel-aviv")));
        assertFalse(flight14.getDeparture().equals(flightBoardTokyo.firstFlightFromOrigin("Tokyo")));

        // String parameter is not origin of any of the flights, therefore resulting in
        // null
        assertNull(flightBoardMilan.firstFlightFromOrigin("New-York"));
        assertNull(flightBoardTelAviv.firstFlightFromOrigin("Tokyo"));
        assertNull(flightBoardMilan.firstFlightFromOrigin("Paris"));

    }

    @Test
    @DisplayName("howManyFullFlights")
    public void howManyFullFlightsMethod() {

        assertEquals(5, flightBoardMilan.howManyFullFlights());
        assertEquals(6, flightBoardTelAviv.howManyFullFlights());
        assertEquals(3, flightBoardTokyo.howManyFullFlights());

        flightBoardMilan.removeFlight(flight26);
        flightBoardTelAviv.removeFlight(flight26);
        flightBoardTokyo.removeFlight(flight18);

        // less full flights because of removal
        assertEquals(4, flightBoardMilan.howManyFullFlights());
        assertEquals(5, flightBoardTelAviv.howManyFullFlights());
        assertEquals(2, flightBoardTokyo.howManyFullFlights());

    }

    @Test
    @DisplayName("howManyFlightsBetween")
    public void howManyFlightsBetweenMethod() {

        assertEquals(2, flightBoardMilan.howManyFlightsBetween("Madrid"));
        assertEquals(2, flightBoardTelAviv.howManyFlightsBetween("Amsterdam"));
        assertEquals(1, flightBoardTokyo.howManyFlightsBetween("Paris"));
        assertEquals(2, flightBoardTokyo.howManyFlightsBetween("Berlin"));

    }

    @Test
    @DisplayName("mostPopularDestination")
    public void mostPopularDestinationMethod() {

        assertEquals("Milan", flightBoardMilan.mostPopularDestination());
        assertEquals("Tel-aviv", flightBoardTelAviv.mostPopularDestination());
        assertEquals("Tokyo", flightBoardTokyo.mostPopularDestination());
        // tokyo and berlin share the same number, tokyo is before though
        flightBoardTokyo.removeFlight(flight28);
        assertEquals("Berlin", flightBoardTokyo.mostPopularDestination());

    }

    @Test
    @DisplayName("mostExpensiveTicket")
    public void mostExpensiveTicketMethod() {

        assertEquals(flight5.getPrice(), flightBoardMilan.mostExpensiveTicket().getPrice());
        assertEquals(flight6.getPrice(), flightBoardTelAviv.mostExpensiveTicket().getPrice());
        assertEquals(flight14.getPrice(), flightBoardTokyo.mostExpensiveTicket().getPrice());

    }

    @Test
    @DisplayName("longestFlight")
    public void longestFlightMethod() {

        assertEquals(flight5.getFlightDuration(), flightBoardMilan.longestFlight().getFlightDuration());
        assertEquals(flight6.getFlightDuration(), flightBoardTelAviv.longestFlight().getFlightDuration());
        assertEquals(flight15.getFlightDuration(), flightBoardTokyo.longestFlight().getFlightDuration());

    }

    @Test
    @DisplayName("toString")
    public void toStringMethod() {

        // this toStringMethod check expects another *empty* line to be printed after
        // board shows

        assertEquals(flightBoardMilan.toString(), "The flights for airport Milan today are:\n" +
                "Flight from Madrid to Milan departs at 08:20. Flight is not full.\n" +
                "Flight from Milan to Paris departs at 11:55. Flight is not full.\n" +
                "Flight from Milan to Tokyo departs at 07:00. Flight is full.\n" +
                "Flight from Madrid to Milan departs at 09:30. Flight is not full.\n" +
                "Flight from Milan to London departs at 05:45. Flight is full.\n" +
                "Flight from Stockholm to Milan departs at 02:55. Flight is full.\n" +
                "Flight from Cape Town to Milan departs at 05:40. Flight is not full.\n" +
                "Flight from Milan to Tel-aviv departs at 15:45. Flight is full.\n" +
                "Flight from Istanbul to Milan departs at 06:50. Flight is full.\n");

        assertEquals(flightBoardTelAviv.toString(),
                "The flights for airport Tel-aviv today are:\n" +
                        "Flight from Amsterdam to Tel-aviv departs at 01:05. Flight is full.\n" +
                        "Flight from New-York to Tel-aviv departs at 02:25. Flight is full.\n" +
                        "Flight from Tel-aviv to Bucharest departs at 15:15. Flight is full.\n" +
                        "Flight from Tel-aviv to Barcelona departs at 06:35. Flight is not full.\n" +
                        "Flight from Amsterdam to Tel-aviv departs at 14:30. Flight is not full.\n" +
                        "Flight from Prague to Tel-aviv departs at 20:35. Flight is not full.\n" +
                        "Flight from Tel-aviv to New Delhi departs at 16:10. Flight is full.\n" +
                        "Flight from Bangkok to Tel-aviv departs at 13:30. Flight is full.\n" +
                        "Flight from Milan to Tel-aviv departs at 15:45. Flight is full.\n");

        assertEquals(flightBoardTokyo.toString(), "The flights for airport Tokyo today are:\n" +
                "Flight from Milan to Tokyo departs at 07:00. Flight is full.\n" +
                "Flight from Tokyo to Paris departs at 23:20. Flight is not full.\n" +
                "Flight from Tokyo to Berlin departs at 16:50. Flight is full.\n" +
                "Flight from Tokyo to Seoul departs at 04:25. Flight is not full.\n" +
                "Flight from Tokyo to Madrid departs at 19:20. Flight is full.\n" +
                "Flight from Tokyo to Berlin departs at 18:05. Flight is not full.\n" +
                "Flight from Moscow to Tokyo departs at 14:00. Flight is not full.\n");
    }

}
