package csii;

public class ArrayTest {
    public static void main(String[] args){
        int[] data = new int[10];
        int[] a = new int[10];
        for(int i = 0;i<data.length;i++){
            a[i] = data[i];
        }
        System.out.println(data);
        
        /*int[] arr; //base type of the array:int
        arr = new int[6];
        System.out.println(arr);*/
    }
}
