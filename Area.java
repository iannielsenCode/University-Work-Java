/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

import java.util.Random;

/**
 *
 * @author Ian
 */
public class Area {
    public static void main (String[] args){
        double num = 0.;
        int tally = 1000000;
        while(tally > 1){
            if(Area.success()){
                num++;
            }
            tally--;
        }
        tally = 1000000;
        System.out.println(num/tally);
    }
    public static boolean success(){
        Random r = new Random();
        double x = r.nextDouble();
        double y = r.nextDouble();
        
        if(y < x*x*x){
            return true;
        }
        else{
            return false;
        }
    }
}
