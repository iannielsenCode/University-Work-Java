package csii;

/*****************************************************************************
 *Name: Ian Nielsen
 *Assignment 3
 *Due Date: October 3rd 2013
*****************************************************************************/

//IntArray class describes an array of integers, can sort them in the order
//according to the implementation of the outOfOrder method, and can print the
//array.
import java.util.Arrays;
abstract class IntArray {
    private int[] data;
    
    //Default constructor. Initializes all elements of data array to 0.
    public IntArray(){ 
        for(int i = 0; i < data.length;i++){
            data[i] = 0;
        }
    }
    
    //Constructor sets all elements of the parameter array equal to the same 
    //numbered elements of the data array.
    public IntArray(int[] a){
        data = Arrays.copyOf(a,a.length);
    }
    
    //Abstract method outOfOrder defined in subclass.
    public abstract boolean outOfOrder(int one, int two);     

    //Method prints out elements of the array.
    public String toString(){  
        String a = "";
        a += "The elements of the array are ";
        for(int i = 0; i < data.length;i++){
            if(i < data.length - 1){
                a += data[i];
                a += ",";
            }
            else{
                a += data[i];
            }
        }
        return a;
    }     
    
    //Method sorts elements of the array according to the truth or falsity of 
    //the outOfOrder method.
    public void sort(){
        int temp;
    
        for(int i=0;i<data.length-1;i++)
            for(int j=i+1;j<data.length;j++)
            if (outOfOrder(data[i], data[j]) ){
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
            
        
    }

}
