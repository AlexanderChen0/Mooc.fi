/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexanderchen
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balanceAtStart){
        balance = balanceAtStart;
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical(){
        if(balance >= 2.5) balance -= 2.5;
    }
    
    public void payGourmet(){
        if(balance >= 4) balance -= 4.0;
    }
    
    public void loadMoney(double amount){
        if(amount > 0){
            balance += amount;
        }
        
        if(balance > 150) balance = 150;
    }
}
