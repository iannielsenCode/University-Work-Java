/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csii;

/**
 *
 * @author Ian
 */
public class Grade {
    public static char toLetter(int score)throws Exception{
        if(score > 100)
            throw (new ScoreToHighException());
        if(score < 0)
            throw (new ScoreToLowException());
        if(score > 90)
            return 'A';
        if(score > 80)
            return 'B';
        if(score > 70)
            return 'C';
        if(score > 60)
            return 'D';
        return 'F';
    }
}
