package csii;

public class Money {
    private int dollars;
    private int cents;
    private static String symbol = "$";
    
    public Money(){
        dollars = 0;
        cents = 0;
    }
    
    public Money(int a, int b){
        dollars = a;
        cents = b;
        justify();
    }
    
    private void justify(){
        dollars += cents/100;
        cents %= 100;
    }
    
    public static Money add(Money a, Money b){
        Money c = new Money();
        c.dollars = a.dollars + b.dollars;
        if((a.cents + b.cents) > 99){
            c.dollars++;
            c.cents = ((a.cents + b.cents) -100);
        }
        else{
            c.cents = a.cents + b.cents;
        }
        return c;
    }
    
    public static void toString(Money a){
        if(a.cents < 10){
            System.out.println(symbol + a.dollars + ".0" + a.cents);
        }
        else{
            System.out.println(symbol + a.dollars + "." + a.cents);
        }
    }
}
