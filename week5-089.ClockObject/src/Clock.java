public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23);
        hours.setValue(hoursAtBeginning);
        minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);
        seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        seconds.next();
        if(seconds.getValue() == 0)minutes.next();
        if(seconds.getValue() == 0 && minutes.getValue() == 0)hours.next();
    }
    
    public String toString() {
        // returns the string representation
        String returnTime = "";
        returnTime += hours.toString() + ":";
        returnTime += minutes.toString() + ":";
        returnTime += seconds.toString();
        
        return returnTime;
    }
}
