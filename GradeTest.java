/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class GradeTest {
    public static void main(String[] args){
        int midterm = 104;
        char letter = ' ';
        try{
            letter = Grade.toLetter(midterm);
        }
        catch(Exception e){
            System.out.println("I got an exception");
        }
        System.out.println("You received an " + letter);
    }
}
