package csii;

public class OtherRecursion {
    public static void main(String[] args){
        //problem1(1000000);
        //System.out.println("");
        //problem12(1000000);
        System.out.print(rate(0,1));
    }
    
    public static double startValue=24;
    public static double target = 6.18E11;
    public static int beginYear = 1626;
    public static int endYear = 2113;
    public static double newValue(double oldValue,double rate,int years){
        while(years > 0){
            oldValue *= 1+(1+rate);
            years--;
        }
        return oldValue;
    }
    public static double rate(double low, double high){
        if((high-low) < 0.001)
            return (low+high) / 2;
        double mid = (low+high)/2;
        if(newValue(startValue,mid,(endYear-beginYear))>target){
            return rate(low,mid);
        }
        return rate(mid,high);
    }
    public static void problem1(int x){
        if(x==1){
            System.out.print(1);
            return;
        }
        System.out.print(x + " ");
        if((x%2)==0){
            problem1(x/2);
        }
        else{
            problem1((3*x)+1);
        }
    }
    public static void problem12(int x){
        while(x!=1){
            System.out.print(x + " ");
            
            if(x%2 == 0)
                x/=2;
            else
                x = 3*x+1;
        }
        System.out.print(1);
    }
}
