package csii;



/******************************************************************************
 *Name: Ian Nielsen
 *Binary Class
 *Due Date: November 4th 2013
 *****************************************************************************/
import java.util.ArrayList;

//Class creates a binary representation of a positive  integer in two ways.
public class Binary {
    
    public static ArrayList<Integer> array = new ArrayList<>();
    public static ArrayList<Integer> array2 = new ArrayList<>();
    
    public static void main(String[]args){
         //int k = (int)(Math.pow(2,4));
        // System.out.print(k);                                   //recursion
         
        print_binary(15);//Print the integer in binary form using interations
    }
    
    //Method recursively generates the binary representation of the integer 
    //given. The method then prints the binary number stored in an arraylist.
    public static void print_recursion(int a){
        if(a<2){
            array.add(a);
            for(int i=1;i<=array.size();i++){
                System.out.print(array.get(array.size()-i));
            }
            System.out.println("");
        }
        else{
            array.add(a%2);
            print_recursion(a/2);
        }
    }
    
    //Method iteratively generates the binary representation of the integer
    //given. The method then prints the binary number stored in an arraylist.
    public static void print_binary(int a){
        while(a != 0){
            array2.add(a%2);
            a=a/2;
        }
        for(int i=1;i<=array2.size();i++){
            System.out.print(array2.get(array2.size()-i));
        }
        System.out.println("");
    }
}
