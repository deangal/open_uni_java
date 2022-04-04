package pack;
// package pack;
public class Time1 {
        int _hour;
        int _minute;    
        
    public Time1(int h, int m) {
        if(h > -1 && h < 24){
            _hour = h;
        } else {
            _hour = 0;
        }

        if(m > -1 && m < 60){
            _minute = m;
        } else {
            _minute = 0;
        }
    }
    
    public Time1 (Time1 other){
        _hour = other._hour;
        _minute = other._minute;
        
    }


    public Time1 addMinutes(int num){
        int newHour = _hour;
        int newMinute = _minute;

        int addHour = num / 60;
        int addMinute = num - (addHour * 60);

        if( newHour + addHour > 23){
            newHour = newHour + addHour - 24;
        } else

        if( newHour + addHour < 0){
            newHour =  24 + newHour + addHour ;
        } else

        if( newMinute + addMinute < 0){
            newHour = newHour + addHour;    
            newMinute =  60 + newMinute + addMinute ;
            newHour--;
        } else

        if( newMinute + addMinute > 59){
            newHour = newHour + addHour;    
            newMinute = newMinute + addMinute - 60;
            newHour++;
        } else {
            newHour = newHour + addHour;
            newMinute = newMinute + addMinute; 

        }
        return new Time1(newHour, newMinute);
    }
    
    void setHour(int num){
        if(num > -1 && num < 24){
            _hour = num;
        }
    }

    void setMinute(int num){
        if(num > -1 && num < 60){
            _minute = num;
        }
    }

    public String toString(){

        String hourString=String.valueOf(_hour);
        String minuteString=String.valueOf(_minute);

        if( -1 < _hour && _hour < 10){
            hourString = "0" + hourString;   
        }
        if( -1 < _minute && _minute < 10){
            minuteString = "0" + minuteString;   
        } 
        return hourString + ":" + minuteString;
         
    }

    

    int getHour() {
        return _hour;
    }

    int getMinute() {
        return _minute;
    }

    public int minFromMidnight(){
        return _hour * 60 + _minute;
    }

    public boolean equals(Time1 other){
        if(other.minFromMidnight() == _hour * 60 + _minute){
            return true;
        } else {
            return false;
        }
    }

    public boolean before(Time1 other){
        if(other.minFromMidnight() >  (_hour * 60 + _minute)){
            return true;
        } else {
            return false;
        }
    }

    public boolean after(Time1 other){
        if(other.minFromMidnight() < (_hour * 60 + _minute)){
            return true;
        } else {
            return false;
        }
    }

    public int difference(Time1 other){
        int sum = _hour * 60 + _minute;
        int otherSum = other.getHour()*60 + other.getMinute();
        if(sum > otherSum){
            return sum - otherSum;
        } else {
            return -1;
        }
    }

    

    public static void main(String[] args) {
        Time1 myObj = new Time1(7, 30); // Create an object of class Main (This will call the constructor)
        Time1 other = new Time1(1,30); // Create an object of class Main (This will call the constructor)

        // System.out.println( myObj.equals(other));
        // System.out.println( myObj.minFromMidnight());

      }
}
