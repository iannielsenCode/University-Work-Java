package csii;

/**
 * Ian Nielsen
 * Due Date: November 18th 2013
 * Testing application for ObjectSearch class.
 */

//Class SearchTest tests ObjectSearch.
public class SearchTest {
    public static void main(String[] args){
        Object[] array = new Object[6];//Creates array of objects with length 6.
        array[3] = new Integer(5); //Adds an Integer object to array.
        array[0] = new Integer(42); //Adds another Integer object to array.
        array[2] = new String("hello"); //Adds a String object to array.
        array[1] = new String("there"); //Adds another String object to array.
        array[4] = new Person("Laura", 40); //Adds a Person object to array.
        array[5] = new Person("Peter", 35);//Adds another Person object to array
        
        Object one = new Integer(5); //Creates an Integer object.
        Person two = new Person("steve", 5); //Creates a Person object.
        Double three = new Double(42); //Creates a Double object.
        
        try{
            System.out.print(ObjectSearch.search(array,three));//Trys to use the 
                                        //ObjectSearch method search to search 
                                        //the array for the object one.
        }
        catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException"); //Throws an exception
                                        //if the array does not hold an object
                                        //that is of the same class as the 
                                        //target object.
        }
        catch(ObjectNotFoundException e){
            System.out.println("ObjectNotFoundException"); //Throws an exception
                                        //if the array does not hold an object 
                                        //that is equal to the target object.
        }
        
    }
}
