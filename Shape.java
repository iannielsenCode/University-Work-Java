package csii;

public abstract class Shape {
    private double h;
    
    public Shape(double h){
        this.h = h;
    }
    
    abstract double area();
    
    public double volume(){
        return area()*h;    }
}
