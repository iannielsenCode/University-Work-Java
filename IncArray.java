
package csii;

/*****************************************************************************
 *Name: Ian Nielsen
 *Assignment 3
 * Due Date: October 3rd 2013
 ****************************************************************************/

//Class extends the IntArray class, and makes the increasing order of integers
//the right order.
public class IncArray extends IntArray{
    
    //Default constructor:calls constructor of super class.
    public IncArray(){
        super();
    }
    
    //Constructor: Calls constructor of super class.
    public IncArray(int[] a){
        super(a);
    }
    
    //Method determines whether or not the two integers are out of order
    //depending on the what your definition of "in order" is.
    public boolean outOfOrder(int one, int two){
        if(one <= two){
            return false;
        }
        else{
            return true;
        }
    }
}
