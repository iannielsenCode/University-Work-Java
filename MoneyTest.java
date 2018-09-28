package csii;

public class MoneyTest {
    public static void main(String[] args){
        Money a = new Money(1,4444);
        Money b = new Money(2,75);
        Money c = Money.add(a,b);
        Money.toString(a);
        Money.toString(b);
        Money.toString(c);
    }
}
