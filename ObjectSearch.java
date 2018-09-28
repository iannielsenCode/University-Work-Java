package csii;

/**
 *Ian Nielsen
 * Due Date: November 18th 2013
 * Object Search Class
 */
//Class contains static method search
public class ObjectSearch {
    //Method searches for a target object in the array given, and throws an 
    //exception if the target object is not of the same class as any of the 
    //objects in the array or if the target object does not equal any of the
    //objects in the array. If the target object equals any of the objects in
    //the array the method will return the index of the array where an equal 
    //object is first found.
    public static int search(Object[] array, Object a) throws 
        ClassNotFoundException, ObjectNotFoundException{
        boolean onf = true;
        boolean cnf = true;
        
        for(int i = 0; i < array.length;i++){
            if(!(array[i].getClass().equals(a.getClass()))){
                if(i == array.length-1){
                    cnf = false;
                }
                continue;
            }
            else if(!(array[i].equals(a))){
                onf = false;
            }
            else{
                return i;
            }
        }
        if(!cnf){
            throw new ClassNotFoundException();
        }
        if(!onf){
            throw new ObjectNotFoundException();
        }
        else{
            return 0;
        }
    }
}
