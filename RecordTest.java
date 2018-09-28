package csii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/******************************************************************************
 * Name:Ian Nielsen
 * Class Record Test
 * Due Date: October 23rd 2013
 *****************************************************************************/

//Class tests the record class by sorting a given array that is read from a file
//and printing the array of records.
public class RecordTest {
    public static void main(String[]args)throws FileNotFoundException{
        Record[] r = new Record[100]; //Creates an array of Record objects.
        readFromFile(r,args[0]); //Reads an array of records from a file.
        Record.sort(r,args[1]); //Sorts the array of records.
        printRecordArray(r); //Prints the array of records.
        
    }
    
    //Prints the array of record objects.
    public static void printRecordArray(Record[] array){
    int i = 0;
    while(array[i] != null){
        System.out.println(array[i++]);
    }
}
    //Reads the records from a file.
    public static void readFromFile(Record[] array, String fileName)throws FileNotFoundException{
        Scanner in = new Scanner(new File(fileName));
        while(in.hasNext()){
            int i = 0;
            array[i++] = new Record(in.next(), in.nextInt(), in.nextInt(), in.nextInt());
        }
    }
}
