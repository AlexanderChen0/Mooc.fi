
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
            //Alternate way: list.add(new Student(nameIn, studentNumber));
        }
        
        for(Student student : list){
            System.out.println(student);
        }
        
        System.out.println("Give search term: " + "\nResults: ");
        String search = input.nextLine();
        for(Student student : list){
            if(student.getName().contains(search))System.out.println(student);
        }
    }
}
