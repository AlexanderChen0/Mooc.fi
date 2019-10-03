public class Main {
    public static void main(String[] args) {
        // write testcode here
        int startingValue = 5;
        int subtractThree = 3;
        boolean check = true;
        
        Counter one = new Counter(); //Number = 0
        System.out.println(one.value());
        
        one.increase();
        System.out.println(one.value()); //Number = 1
        one.increase(startingValue); 
        System.out.println(one.value()); //Number = 6
        
        one.decrease();
        System.out.println(one.value()); //Number = 6
        one.decrease(subtractThree);
        System.out.println(one.value()); //Number = 6
        
        System.out.println("Test two: ");
        System.out.println();
        
        Counter two = new Counter(2, true); //Number = 0
        two.decrease();
        two.decrease();
        two.decrease();
        
        System.out.println(two);
        
        
        
    }
}
