
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        value = 0;
        this.upperLimit = upperLimit;
    }
    
    public void setValue(int value) {
        if(value > upperLimit || value < 0);
        else this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void next(){
        value++;
        if(value > upperLimit){
            value = 0;
        }
    }
    
    public String toString(){
        if(value < 10) return "0" + value;
        return "" + value;
    }
}
