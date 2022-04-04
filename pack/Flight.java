package pack;
import pack.Time1;

public class Flight {
    String origin;
    String destination;
    Time1 departure;
    int flightDuration;
    int noOfPassengers;
    boolean isFull;
    int price;
    int MAX_CAPACITY = 250;

    public Flight (String originParam,String destinationParam,int depHour, int depMinute, int flightDurationParam,int noOfPassengersParam,int priceParam){

        origin = originParam;
        destination = destinationParam;
        departure = new Time1(depHour,depMinute);

        if(noOfPassengersParam > MAX_CAPACITY){
            noOfPassengers = MAX_CAPACITY;
        } else
        if(noOfPassengersParam < 0){
            noOfPassengers = 0;
        } else {
            noOfPassengers = noOfPassengersParam;
        }

        isFull = (noOfPassengers == 250) ?  true : false;

        if(flightDurationParam < 0){
            flightDuration = 0;
        } else {
            flightDuration = flightDurationParam;
        } 
        
        if(priceParam < 0){
            price = 0;
        } else {
            price = priceParam;
        } 
    }

    public Flight (Flight other){
        origin = other.origin;
        destination = other.destination;
        departure = other.departure;
        flightDuration = other.flightDuration;
        noOfPassengers = other.noOfPassengers;
        isFull = other.isFull;
        price = other.price;
        MAX_CAPACITY = other.MAX_CAPACITY;
    }

    public boolean addPassengers(int num){
        if(noOfPassengers + num == 250) {
            noOfPassengers += num;
            isFull = true;
            return isFull;
        } else
        if(noOfPassengers + num > 250){
            return isFull;
        } else {
            noOfPassengers += num;
            return isFull;
        }
    }

    public boolean equals(Flight other){
        if(other.origin == origin && other.destination == destination && other.departure == departure && other.flightDuration == flightDuration ){
            return true;
        } else {
            return false;
        }
    }

    public Time1 getArrivalTime(){
        return departure.addMinutes(flightDuration);
    }

    public Time1 getDeparture(){
        return departure;
    }
    
    public String getDestination(){
        return destination;
    }

    public int getFlightDuration(){
        return flightDuration;
    }   

    public boolean getIsFull(){
        return isFull;
    }
    public int getNoOfPassengers(){
        return noOfPassengers;
    }

    public String getOrigin(){
        return origin;
    }

    public int getPrice(){
        return price;
    }

    
    public boolean isCheaper(Flight other){
        if(other.price > price) {
            return true;
        } else{
            return false;
        }
    }
    
    public boolean landsEarlier(Flight other){
        if(getArrivalTime().before(other.getArrivalTime())) {
            return true;
        } else{
            return false;
        }
    }

    void setDeparture(Time1 departureTime){
        departure = departureTime;
    }

    void setDestination(String destinationParam){
        destination = destinationParam;
    }

    void setFlightDuration(int flightDurationParam){
        if(flightDurationParam < 0){
            flightDuration = 0;
        } else {
            flightDuration = flightDurationParam;
        } 
    }

    void setNoOfPassengers(int noOfPassengersParam){
        if( noOfPassengersParam >= 0 && noOfPassengersParam <= 250){
            noOfPassengers = noOfPassengersParam;
            if(noOfPassengers == 250){
                isFull = true;
            } else {
                isFull = false;
            }
        }
    }

    void setOrigin(String originParam){
        origin = originParam;
    }

    void setPrice(int priceParam){
        if(priceParam < 0){
            price = 0;
        } else {
            price = priceParam;
        } 
    }

    public String toString(){
        String isFullString = isFull ? "Flight is full" : "Flight is not Full";
        return "Flight from " + origin + " to " + destination + " departs at " + departure.toString() + ". " + isFullString + ".";
    }
    
    public int totalPrice(){
        return noOfPassengers * price;
    }

    public static void main(String[] args) {

        // System.out.println( myObj.minFromMidnight());

      }
}
