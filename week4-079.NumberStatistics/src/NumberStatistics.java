
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        amountOfNumbers = 0;
        sum = 0;
    }
    
    public void addNumber(int number){
        amountOfNumbers++;
        sum += number;
    }
    
    public int amountOfNumbers(){
        return amountOfNumbers;
    }
    
    public int sum(){
        if(amountOfNumbers == 0) return 0;
        return sum; 
    }
    
    public double average(){
        if(amountOfNumbers == 0) return 0;
        return (double) sum / amountOfNumbers;
    }
}
