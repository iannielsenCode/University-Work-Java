/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class BankAccount {
    private int balance;
    
    public void checkBal(){
        System.out.println("You have $"+ balance);
    }
    
    public void deposit(int amount){
        balance += amount;
        
    }
    
    public void withdraw(int amount){
        balance -= amount;
    }
    
    public void transfer(BankAccount other, int amount){
        this.withdraw(amount);
        other.deposit(amount);
    }
}
