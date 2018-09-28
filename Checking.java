package csii;

import java.util.Scanner;

/**
 *
 * @author Ian
 */
public class Checking{
    private static double balance;
    
    public Checking(){
        balance = 0.;
    }
    
    public Checking(double balance){
        Checking.balance = balance;
    }
    
    public double getBalance(){
        return Checking.balance;
    }
    
    public void deposit(double amount){
        Checking.balance += amount;
    }
    
    public void withdraw(double amount) throws NSFException{
        
        if(amount > Checking.balance){
            throw (new NSFException());
        }
        balance -= amount;
    }
    
    
    
}
