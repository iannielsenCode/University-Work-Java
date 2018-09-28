/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
import java.util.Random;

public class Parking {
    public static void main(String[] args){
        for(int i =100;i > 0;i--){
            System.out.println(park(20));
        }
        
    }
    public static Random r = new Random();
    public static int park(double l){
        if(l <= 1)
            return 0;
        double frontOfCar = r.nextDouble() * (l-1);
       
        return 1 + park(frontOfCar) + park(l-1-frontOfCar);
    }
}
