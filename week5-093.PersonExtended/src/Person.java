import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    
    public int age(){
        MyDate current = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                                    Calendar.getInstance().get(Calendar.MONTH) + 1,
                                    Calendar.getInstance().get(Calendar.YEAR));
        
        return Math.abs(current.differenceInYears(birthday));
                                    
    }
    
    public boolean olderThan(Person compared) {
        return birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
