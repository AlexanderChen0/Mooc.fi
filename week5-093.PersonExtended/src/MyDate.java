
import java.util.Calendar;


public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared){
        int returnYear = (day - compared.day);
        returnYear += (month - compared.month) * 30;
        returnYear += (year - compared.year) * 365;
        System.out.println(returnYear);
        return returnYear / 365;
    }
    
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
