package csii;

import java.util.Scanner;

/**
 *
 * @author Ian
 */
public class CheckingTest{
    public static void main(String[] args){
        Checking a = new Checking(134.0);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while(true){
        try{
            a.withdraw(num);
            break;
        }
        catch(NSFException e){
            System.out.println("NSFException.Please enter new amount");
            num=in.nextInt();
        }
        continue;
    }
  }
}
