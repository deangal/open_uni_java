
package pack;
import pack.Flight;

public class FlightDriver {
    public static void main(String[] args) {
    // public Flight (String originParam,String destinationParam,int depHour, int depMinute, int flightDurationParam,int noOfPassengersParam,int priceParam){

        Flight firstFlight = new Flight(new String("London"), new String("Paris"),9,40,200,100,1000);

        Flight secondFlight = new Flight(firstFlight);

        System.out.println("The origin  of the first Flight object is: " + firstFlight.getOrigin());
        System.out.println("The destination of the first Flight object is: " + firstFlight.getDestination());
        System.out.println("The departure time of the first Flight object is: " + firstFlight.getDeparture());
        System.out.println("The duration time of the first Flight object is: " + firstFlight.getFlightDuration());
        System.out.println("The number of passengers of the first Flight object is: " + firstFlight.getNoOfPassengers());
        System.out.println("Is the first Flight object full? " + firstFlight.getIsFull());
        System.out.println("The price of the first Flight object is: " + firstFlight.getPrice());
        System.out.println("The arrival time of the first Flight object is: " + firstFlight.getArrivalTime());
        secondFlight.setOrigin(new String("Tel-Aviv"));
        secondFlight.setDestination(new String("Rome"));
        secondFlight.setDeparture(new Time1(10,40));
        secondFlight.setFlightDuration(300);
        secondFlight.setNoOfPassengers(300);
        secondFlight.setPrice(750);
        System.out.println("Are the first and second Flight objects equal? " + firstFlight.equals(secondFlight));
        System.out.println ("Were 200 passengers added successfully to the first flight? "+firstFlight.addPassengers(200));
        System.out.println ("The total price of the first flight is: "+firstFlight.totalPrice());
        System.out.println ("Does the first flight land before the second flight? "+firstFlight.landsEarlier(secondFlight));
        System.out.println("The string representation of the first Flight object is: " + firstFlight.toString());
        System.out.println("The string representation of the second Flight object is: " + secondFlight.toString());
        System.out.println ("The first flight total price: "+firstFlight.totalPrice());
        System.out.println ("The second flight total price: "+secondFlight.totalPrice());
        System.out.println ("Is the first flight cheaper than the second flight? "+firstFlight.isCheaper(secondFlight));
       
      
    }
}
