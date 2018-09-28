/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */

import java.util.*;

public class Pi {
    public static void main(String[] args){
        double x, y;
        
        Random r = new Random();
        
        int tries = 100000000;
        int success = 0;
        
        for(int i = 0;i<tries;i++){
            x = r.nextDouble();
            y = r.nextDouble();
            
            if(x*x + y*y < 1){
                success++;
            }
        }
        
        System.out.println(success*4.0/tries);
        
    }
}
