package pack;
// package pack;
public class Time2 {
        
        int _minFromMid;  
        
    public Time2(int h, int m) {
        if(h > -1 && h < 24){
            _minFromMid += h * 60;
        }

        if(m > -1 && m < 60){
            _minFromMid += m;
        } 

    }
    
    public Time2 (Time2 other){
        _minFromMid = other._minFromMid;
    }


    void setHour(int num){
        int timeHour = _minFromMid / 60;
        if(num > -1 && num < 24){
            _minFromMid = _minFromMid - (timeHour * 60);
            _minFromMid = _minFromMid + (num * 60);
        }
    }

    void setMinute(int num){
        int timeHour = _minFromMid / 60;
        int timeMinute = _minFromMid - (timeHour*60);
        if(num > -1 && num < 60){
            _minFromMid = _minFromMid - (timeMinute);
            _minFromMid = _minFromMid + (num );
        }
    }

    public String toString(){
        int timeHour = _minFromMid / 60;
        int timeMinute = _minFromMid - (timeHour*60);

        String hourString=String.valueOf(timeHour);
        String minuteString=String.valueOf(timeMinute);

        if( -1 < timeHour && timeHour < 10){
            hourString = "0" + hourString;   
        }
        if( -1 < timeMinute && timeMinute < 10){
            minuteString = "0" + minuteString;   
        } 
        return hourString + ":" + minuteString;
         
    }

    

    int getHour() {
        return _minFromMid / 60;
    }

    int getMinute() {
        int timeHour = _minFromMid / 60;
        int timeMinute = _minFromMid - (timeHour*60);
        return timeMinute;
    }

    public int minFromMidnight(){
        return _minFromMid;
    }

    public boolean equals(Time2 other){
        if(other._minFromMid == _minFromMid){
            return true;
        } else {
            return false;
        }
    }

    public boolean before(Time2 other){
        if(other._minFromMid >  _minFromMid){
            return true;
        } else {
            return false;
        }
    }

    public boolean after(Time2 other){
        if(other._minFromMid < _minFromMid){
            return true;
        } else {
            return false;
        }
    }

    public int difference(Time2 other){
        if(_minFromMid > other._minFromMid){
            return _minFromMid - other._minFromMid;
        } else {
            return -1;
        }
    }

    public Time2 addMinutes(int num){
        int timeHour = _minFromMid / 60;
        int timeMinute = _minFromMid - (timeHour*60);

        int newHour = timeHour;
        int newMinute = timeMinute;

        int addHour = num / 60;
        int addMinute = num - (addHour * 60);

        if( newHour + addHour > 23){
            newHour = newHour + addHour - 24;
        } else

        if( newHour + addHour < 0){
            newHour =  24 + newHour + addHour ;
        } else

        if( newMinute + addMinute < 0){
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
        return new Time2(newHour, newMinute);
    }

    public static void main(String[] args) {
        Time2 myObj = new Time2(7, 30); // Create an object of class Main (This will call the constructor)
        Time2 other = new Time2(myObj); // Create an object of class Main (This will call the constructor)


        // System.out.println( myObj.minFromMidnight());

      }
}
