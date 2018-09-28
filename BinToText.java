
package csii;


/**
 *Ian Nielsen
 *BinToText class
 *Due Date: December 11th 2013
 */
//Class reads integers from a binary file and stores them into a text file.
import java.io.*;
public class BinToText {
    public static void main(String[] args) throws IOException{
        try{
            InputStream inputStream = new FileInputStream(args[0]); //Creates stream for the binary file. Allows the program to read from the file
            DataInputStream stream = new DataInputStream(inputStream);//Creates a stream that allows you to read bytes from the file.
            PrintWriter out = new PrintWriter(args[1]); //Creates a PrintWriter object that lets you print to the text file.
            int next; //Integer as placement for what is being read from the file.
            do{
                next = stream.read(); //Stores what is being read from the file into next.
                out.print(next); //Stores next in the text file.
            }while(next != -1);
            
            out.close(); //Closes stream
            stream.close(); //Closes stream
        } 
        catch(IOException e){
            System.out.println("IOException"); //Prints error message if exception occurs.
        }
    }
}
  
