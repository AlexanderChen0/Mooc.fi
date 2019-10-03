/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexanderchen
 */
public class Counter {
    private int number;
    private boolean check;

    public Counter() {
        number = 0;
        check = false;
    }
    
    public Counter(int startingValue){
        number = startingValue;
        check = false;
    }
    
    public Counter(boolean check){
        number = 0;
        if(check) this.check = true;
        else this.check = false;
    }

    public Counter(int startingValue, boolean check) {
        number = startingValue;
        if(check == true) this.check = true;
    }

    public int value() {
        return number;
    }
    
    public void increase(){
        number++;
    }
    
    public void decrease(){
        if(check && number > 0) number--;
        if(!check) number--;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0) number += increaseAmount;
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount > 0){
            if(check && (number - decreaseAmount) >= 0) number -= decreaseAmount;
            else if(check && (number - decreaseAmount) < 0) number = 0;
            else if (!check) number -= decreaseAmount;
        }
    }
    
    public String toString(){
        return "The value of number is: " + number;
    }
}
