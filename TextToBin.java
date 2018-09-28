package csii;



/**
 * Name: Ian Nielsen
 * TextToBin Class
 * Due Date: December 12 2013
 */
//Class reads integers from a text file and stores them in a binary file.
import java.io.*;
import java.util.Scanner;
public class TextToBin {
    public static void main(String[] args) throws IOException{
        try{
            File in = new File(args[0]); //Creates a file object.
            OutputStream out = new FileOutputStream((args[1])); //Creates a 
            //stream that allows the program to print to the binary file.
            DataOutputStream out2 = new DataOutputStream(out); //Creates a 
            //stream that allows the program to store the integer in binary form
            Scanner input = new Scanner(in); //Creates scanner object that will 
            //be used to read from the text file.
            
            while(input.hasNextInt()){
                int value = input.nextInt(); //Stores the next value in the text 
                //file in an integer.
                out2.writeInt(value); //Stores the integer in the binary file.
            }
            
            out2.close(); //Closes stream
            out.close(); //Closes stream
        }
        catch (IOException e){
            System.out.println("IOException"); //Prints error message 
            //if exception occurs.
        }
        
    }
}
