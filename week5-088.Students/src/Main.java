
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner input = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.println("name: ");
            String nameIn = input.nextLine();
            if(nameIn.equals(""))break;
            System.out.println("studentnumber: ");
            String studentNumber =  input.nextLine();
            Student student = new Student(nameIn, studentNumber);
            list.add(student);
        }
        
        for(Student out : list){
            System.out.println(out);
        }
        
        System.out.println("Give search term: " + "\nResults: ");
        String search = input.nextLine();
        for(Student stu : list){
            if(stu.getName().contains(search))System.out.println(stu);
        }
    }
}
