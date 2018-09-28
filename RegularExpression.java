
package csii;

import java.util.Scanner;

public class RegularExpression {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String a = in.next();
    System.out.print(ab(a));
    
  }
  public static boolean ab(String s){
    int k;
    if(s.length() == 0){
        return true;
    }
    for(k = 0; k < s.length(); k++){
      if(s.charAt(k) == 'b'){
          break;
      }
    }
    for(;k < s.length(); k++){
      if(s.charAt(k) != 'b'){
        return false;
      }
    }
    
  return true;
  }
}
