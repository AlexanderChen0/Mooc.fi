import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new MyDate(day, month, year);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        this.name = name;
        birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                          Calendar.getInstance().get(Calendar.MONTH) + 1,
                          Calendar.getInstance().get(Calendar.YEAR));
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
