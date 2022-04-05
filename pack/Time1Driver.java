package pack;
import pack.Time1;
public class Time1Driver {
    public static void main(String[] args) {
       
       
        Time1 firstTime = new Time1(2, 15);
        Time1 secondTime = new Time1(firstTime);

        System.out.println("The hour of the first Time1 object is: " + firstTime.getHour());
        System.out.println("The minute of the first Time1 object is: " + firstTime.getMinute());
      

        secondTime.setHour(23);
        secondTime.setMinute(20);
   

        System.out.println("The hour of the second Time1 object is: " + secondTime.getHour());
        System.out.println("The minute of the second Time1 object is: " + secondTime.getMinute());
      
        System.out.println("The minutes passed since midnight of the second Time1 object is: "+secondTime.minFromMidnight());

        System.out.println("Is the first time equal to the second time? " + firstTime.equals(secondTime));

        System.out.println("Is the first time before the second time? " + firstTime.before(secondTime));

        System.out.println("Is the first time after the second time? " + firstTime.after(secondTime));

        System.out.println("The difference in minutes between the second and first time is: " + secondTime.difference(firstTime));
        Time1 time3 = firstTime.addMinutes(100);
        
        System.out.println("Adding 100 minutes to time: "+ firstTime+" return: "+time3);
        
        System.out.println("The string representation of the first time is: " + firstTime.toString());
    }
}
