package csii;

/*******************************************************************************
 * Name : Ian Nielsen
 * Class: Record
 * Due Date: October 23rd 2013
 ******************************************************************************/
 
//Record class manipulates a student report card.
public class Record {
    private String name;
    private int mid, fin, sem;
    
    //Constructor for a record object with a name and a final, midterm, and
    //semester grade. 
    public Record(String name, int mid, int fin, int sem){
        this.name = name;
        this.mid = mid;
        this.fin = fin;
        this.sem = sem;
    }
     //Accessor for name field.
    public String getName(){
        return name;
    }
    
    //Accessor for midterm field.
    public int getMid(){
        return mid;
    }
    
    //Accessor for final field.
    public int getFin(){
        return fin;
    }
    
    //Accessor for semester field.
    public int getSem(){
        return sem;
    }
    
    //Method sorts the given array upon the given argument.
    public static void sort(Record[] a, String argument){
        String temp;
        int temp2;
         if("name".equals(argument)){
             for(int i = 0; i < a.length-1; i++){
                 for(int j = 1; j < a.length-1; j++)
                    if(a[i].name.compareTo(a[j].name) < 0){
                     temp = a[i].name;
                     a[i].name = a[j].name.toString();
                     a[j].name = temp;
                 }
             }
         
         }
         if("midterm".equals(argument)){
             for(int i = 0; i < a.length-1; i++){
                 for(int j = i+1; j < a.length-1; j++){
                    if(a[i].mid > a[j].mid){
                        temp2 = a[i].getMid();
                        a[i].mid = a[j].mid;
                        a[j].mid = temp2;
                    }
                 }
             }
         }
         if("final".equals(argument)){
             for(int i = 0; i < a.length-1; i++){
                 for(int j = i+1; j < a.length-1; j++){
                    if(a[i].fin > a[j].fin){
                        temp2 = a[i].fin;
                        a[i].fin = a[j].fin;
                        a[j].fin = temp2;
                    }
                 }
             }
         }
         if("semester".equals(argument)){
             for(int i = 0; i < a.length-1; i++){
                 for(int j = i+1; j < a.length-1; j++){
                    if(a[i].sem > a[j].sem){
                        temp2 = a[i].sem;
                        a[i].sem = a[j].sem;
                        a[j].sem = temp2;
                    }
                 }
             }
         }
    }
}
