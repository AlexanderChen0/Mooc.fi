
public class CashRegister {

    private double cashInRegister;
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4;
    private int economicalSold;
    private int gourmetSold;


    public CashRegister() {
        cashInRegister = 1000; 
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens 
        if(cashGiven >= PRICE_OF_ECONOMICAL) {
            cashInRegister += PRICE_OF_ECONOMICAL;
            economicalSold++;
        } else return cashGiven;
        return cashGiven - PRICE_OF_ECONOMICAL;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if(cashGiven >= PRICE_OF_GOURMET) {
            cashInRegister += PRICE_OF_GOURMET;
            gourmetSold++;
        } else return cashGiven;
        return cashGiven - PRICE_OF_GOURMET;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance() >= PRICE_OF_ECONOMICAL){
            economicalSold++;
            card.pay(PRICE_OF_ECONOMICAL);
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if(card.balance() >= PRICE_OF_GOURMET){
            gourmetSold++;
            card.pay(PRICE_OF_GOURMET);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum > 0){
            cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
