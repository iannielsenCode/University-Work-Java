
package csii;

/*****************************************************************************
 * Ian Nielsen
 * Paycheck Tester Class
 * Due Date: September 25th 2013
 ****************************************************************************/

/*****************************************************************************
 * Class tests Paycheck class.
 ****************************************************************************/

public class Assign2 {
    public static void main(String[] args){
        Paycheck p = new Paycheck("Ian Nielsen", 40, 20);
        p.taxDeduction();
        p.printCheck();
    }
}
