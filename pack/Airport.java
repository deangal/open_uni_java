package pack;

import pack.Flight;

public class Airport {

    // VARIBALES DECLARETION
    int MAX_FLIGHTS = 200;
    int _Index = 0;
    Flight[] _flightsSchedule = new Flight[MAX_FLIGHTS];
    int _noOfFlights;
    String _city;

    public Airport(String city) {
        _noOfFlights = MAX_FLIGHTS;
        _city = city;
    }

    /**
     * this method add flights to the airport only if the flight destination or
     * origin is equal to the airport city
     * 
     * @param f Flight Object
     * @return boolean
     */
    public boolean addFlight(Flight f) {
        boolean isAdd = false;
        if (f.getOrigin().equals(_city) || f.getDestination().equals(_city)) {
            _Index++;
            isAdd = true;
            _flightsSchedule[_Index - 1] = f;

        }

        return isAdd;
    }

    /**
     * this method remove flights from the flights schedule
     * 
     * @param f Flight Object
     * @return boolean
     */
    public boolean removeFlight(Flight f) {
        Flight[] _flightsScheduleCopy = new Flight[MAX_FLIGHTS];
        int _copyIndex = 0;
        boolean isFound = false;

        for (int i = 0; i < _Index; i++) {
            if (f.equals(_flightsSchedule[i])) {
                isFound = true;
            } else {
                _flightsScheduleCopy[_copyIndex] = _flightsSchedule[i];
                _copyIndex++;
            }
        }

        if (isFound) {
            _Index = _copyIndex;
            _flightsSchedule = _flightsScheduleCopy;
        }
        return isFound;
    }

    /**
     * this method gets the first flight from the place(city) paramter that is
     * passed to the method
     * 
     * @param place String
     * @return Time1 Object || null
     */
    public Time1 firstFlightFromOrigin(String place) {
        Time1 foundTime = new Time1(23, 59);
        boolean isFound = false;

        for (int i = 0; i < _Index; i++) {
            Time1 flightTime = _flightsSchedule[i].getDeparture();
            if (_flightsSchedule[i].getOrigin().equals(place) && flightTime.equals(new Time1(23, 59))) {
                isFound = true;
            }

            if (_flightsSchedule[i].getOrigin().equals(place) && foundTime.after(flightTime)) {
                foundTime = flightTime;
                isFound = true;
            }
        }

        if (isFound) {
            return foundTime;
        } else {
            return null;
        }
    }

    /**
     * this method returns the String representation of the Airport Object
     * 
     * @return result String
     */
    public String toString() {
        String result = "The flights for airport " + _city + " today are:\n";
        for (int i = 0; i < _Index; i++) {
            result += _flightsSchedule[i].toString() + "\n";
        }

        return result;
    }

    /**
     * this method returns the number of flight that are in full capacity
     * 
     * @return FullFlights int
     */
    public int howManyFullFlights() {
        int FullFlights = 0;

        for (int i = 0; i < _Index; i++) {
            if (_flightsSchedule[i].getIsFull()) {
                FullFlights++;
            }
        }

        return FullFlights;
    }

    /**
     * this method returns the number of flights that the place(city destanation or
     * city origin) paramater that passed to the method are equal to the airport
     * city
     * 
     * @param place
     * @return foundFlights int
     */
    public int howManyFlightsBetween(String place) {
        int foundFlights = 0;

        for (int i = 0; i < _Index; i++) {
            if (_flightsSchedule[i].getOrigin().equals(place) || _flightsSchedule[i].getDestination().equals(place)) {
                foundFlights++;
            }
        }

        return foundFlights;
    }

    /**
     * this method returns the most popular destination of the airport Object
     * 
     * @return mostPopularDestination String
     */
    public String mostPopularDestination() {
        String mostPopularDestination = null;
        String currentDestination = null;
        int counter = 0;
        int foundFlights = 0;

        for (int j = 0; j < _Index; j++) {
            currentDestination = _flightsSchedule[j].getDestination();

            for (int i = 0; i < _Index; i++) {
                if (_flightsSchedule[i].getDestination().equals(currentDestination)) {
                    foundFlights++;
                }
            }

            if (foundFlights > counter) {
                counter = foundFlights;
                mostPopularDestination = currentDestination;
            }

            foundFlights = 0;
        }

        return mostPopularDestination;
    }

    /**
     * this method return the most expensive flight ticket of the airpot Object
     * 
     * @return mostExpensiveFlight int
     */
    public Flight mostExpensiveTicket() {
        Flight mostExpensiveFlight = null;
        int mostExpensiveTicket = 0;

        for (int i = 0; i < _Index; i++) {
            if (_flightsSchedule[i].getPrice() > mostExpensiveTicket) {
                mostExpensiveTicket = _flightsSchedule[i].getPrice();
                mostExpensiveFlight = _flightsSchedule[i];
            }
        }

        return mostExpensiveFlight;
    }

    /**
     * this method returns the longest flight of the Airport Object
     * 
     * @return longestFlight Flight Object
     */
    public Flight longestFlight() {
        Flight longestFlight = null;
        int longestFlightDuration = 0;

        for (int i = 0; i < _Index; i++) {
            if (_flightsSchedule[i].getFlightDuration() > longestFlightDuration) {
                longestFlightDuration = _flightsSchedule[i].getFlightDuration();
                longestFlight = _flightsSchedule[i];
            }
        }

        return longestFlight;
    }

    public static void main(String[] args) {

    }
}
