/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class banktestr {
    public static void main(String[] args){
        BankAccount iansaccount = new BankAccount();
        BankAccount otheraccount = new BankAccount();
        iansaccount.deposit(2000);
        iansaccount.checkBal();
        
        iansaccount.transfer(otheraccount, 100);
        iansaccount.checkBal();
        }
}
