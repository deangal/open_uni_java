package pack;

public class Time2Driver {

    public static void main(String[] args) {
        Time2 firstTime = new Time2(18, 33);
        Time2 secondTime = new Time2(firstTime);

        System.out.println("The hour of the first Time2 object is: " + firstTime.getHour());
        System.out.println("The minute of the first Time2 object is: " + firstTime.getMinute());
     

        secondTime.setHour(16);
        secondTime.setMinute(55);
     
        System.out.println("The hour of the second Time2 object is: " + secondTime.getHour());
        System.out.println("The minute of the second Time2 object is: " + secondTime.getMinute());
      
        
        System.out.println("The minutes passed since midnight of the second Time2 object is: "+secondTime.minFromMidnight());

        System.out.println("Is the first time equal to the second time? " + firstTime.equals(secondTime));

        System.out.println("Is the first time before the second time? " + firstTime.before(secondTime));

        System.out.println("Is the first time after the second time? " + firstTime.after(secondTime));

        System.out.println("The difference in minutes between the first and second time is: " + firstTime.difference(secondTime));

        Time2 time3 = firstTime.addMinutes(100);
        
        System.out.println("Adding 100 minutes to time: "+ firstTime+" return: "+time3);
        
        
        System.out.println("The string representation of the first time is: " + firstTime.toString());
    }
}
