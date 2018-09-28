package csii;

/*****************************************************************************
 * Name: Ian Nielsen
 * Recursion class.
 * Extra credit assignment.
 ****************************************************************************/
 
//Recursion class defines method printNStars that prints a number of stars
//specified by the parameter. 
public class Recursion {
    //Method uses recursion to print the number of stars;loops within itself.
    public static void printNStars(int n){
            if(n==0)
                return;
            printNStars(n-1);
            System.out.print("*");
    }
}
