
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
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
    
    public void advance(){
        if(day >= 30 && month == 12){
            day = 1;
            month = 1;
            year++;
        } else if(day >= 30) {
            month++;
            day = 1;
        } else day++;
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
        return Math.abs(returnYear / 365);
    }  
}
