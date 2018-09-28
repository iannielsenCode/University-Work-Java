
package csii;

import java.util.*;
public class Birthday {
    public static void main(String[] args){
        Random r = new Random();
        int birth,i;
        int trials  = 1000000;
        int success = 0;
        //System.out.println(birth);
        int[] dates = new int[365];
        for(int j=0;j<trials;j++){
            for(i=0;i<50;i++){
                birth = r.nextInt(365);
                dates[birth]++;
            }
        
            if(sameDay(dates)){
                success++;
                dates = new int[365];
        }
        }
        
       System.out.println(success*1.0/trials);
        
    }
    
    public static boolean sameDay(int[] array){
        for(int i = 0; i < array.length;i++){
            if(array[i] > 1){
                return true;
            }
        }
        return false;
    }
}
