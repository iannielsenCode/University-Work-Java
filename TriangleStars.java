package csii;

/*****************************************************************************
 *Name: Ian Nielsen
 *TriangleStars class
 * Extra credit assignment.
 ****************************************************************************/

//Class specifies method that prints a triangle of stars that is right justified
public class TriangleStars {
    public static int loops = 0; //Per class integer;number of loops of 
                                 //printStars
    //Method print a triangle with n number of lines, each line with one less
    //star than the previous line;first line has n number of stars. The triangle
    //is right justified. 
    public static void printStars(int n){
        if(n==0)
            return;
        for(int i = n;i>(n-loops);i--){
            System.out.print(" ");
        }
        loops++;
        Recursion.printNStars(n);
        System.out.println("");
        printStars(n-1);
    }
    public static void main(String[] args){
        printStars(20); //Prints triangle with 20 lines.
    }
}
