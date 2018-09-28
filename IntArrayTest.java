package csii;

/******************************************************************************
 *Name: Ian Nielsen
 *Assignment 3
 *Due Date: October 3rd 2013
 *****************************************************************************/


public class IntArrayTest {
    public static void main(String[] args){
        int[] array = {2,7,9,5,0,4,8,1,3,6};//Constructs array with 10 elements.
        IncArray a = new IncArray(array); //Creates new IncArray object with new array.
        a.sort(); //Sorts the array of the object.
        System.out.println(a); //Prints the array.
    }
}
