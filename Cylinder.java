package csii;

public class Cylinder extends Shape{
    private double r;
    
    public Cylinder(double r, double h){
        super(h);
        this.r = r;
    }
    
    public double area(){
        return Math.PI*r*r ;
    }
}
