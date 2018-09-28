/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class callByValue {
    private int x;
    private int y;
    
    public static void sum(callByValue b){
        b.x = 2;
        b.y = 3;
    }
    
    public static void main(String[] args){
        callByValue a = new callByValue();
        a.x = 8;
        a.y = 9;
        sum(a);
        System.out.println(a.x + a.y);
        
    }
}
