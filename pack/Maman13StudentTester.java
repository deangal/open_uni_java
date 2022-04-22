package pack;

import pack.Flight;
import pack.Airport;
import pack.Time1;

public class Maman13StudentTester {
    public static void main(String[] args) {

        /*******************************
         * Airport CLASS TESTER
         *******************************/
        /***********************************************************************************/
        System.out.println(
                "Starting test. Please note these are very simple tests. \nYou should add lots of your own to test all the cases.\n");
        // Check constructor
        Airport airport1 = new Airport(new String("Tel-Aviv"));

        // AddFlight
        Flight flight1 = new Flight(new String("Tel-Aviv"), new String("London"), 12, 0, 210, 250, 100);
        Flight flight2 = new Flight(new String("New York"), new String("Tel-Aviv"), 10, 50, 210, 250, 150);
        airport1.addFlight(flight1);
        airport1.addFlight(flight2);
        System.out.println("toString after adding 2 flights:");
        System.out.println(airport1);

        // RemoveFlight
        airport1.removeFlight(flight1);
        System.out.println("\nAfter removing the first flight:");
        System.out.println(airport1);

        // First Flight From Origin
        System.out.println("\nTake off time of first flight from origin Tel-Aviv, after adding a new flight:");
        Flight flight3 = new Flight(new String("Tel-Aviv"), new String("Paris"), 11, 35, 210, 100, 50);
        airport1.addFlight(flight3);
        Time1 time1 = airport1.firstFlightFromOrigin(new String("Tel-Aviv"));
        System.out.println(time1);

        // How Many Full Flights
        System.out.println("\nHow many full flights:");
        int howManyFull = airport1.howManyFullFlights();
        System.out.println(howManyFull);

        // HowMany Flights Between
        System.out.println("\nHow many flights between Tel-Aviv and London:");
        Flight flight4 = new Flight(new String("London"), new String("Tel-Aviv"), 12, 1, 210, 249, 100);
        airport1.addFlight(flight4);
        int howManyBetween = airport1.howManyFlightsBetween(new String("London"));
        System.out.println(howManyBetween);

        // Most Popular Destination
        System.out.println("\nMost popular destination:");
        String mostPopular = airport1.mostPopularDestination();
        System.out.println(mostPopular);

        // Most Expensive Ticket
        System.out.println("\nFlight with most expensive ticket:");
        Flight mostExpensive = airport1.mostExpensiveTicket();
        System.out.println(mostExpensive);

        // Longest Flight
        System.out.println("\nLongest flight:");
        Flight longestFlight = airport1.longestFlight();
        System.out.println(longestFlight);

        System.out.println(
                "\nIf you have errors make sure you compared all objects(including Strings) with equals and not ==.");
    }
}