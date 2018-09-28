package csii;

public class Rect {
    protected double l, w;
    
    public Rect(double l, double w){
        this.l = l;
        this.w = w;
    }
    
    public double perimeter(){
        return 2*l + 2*w;
    }
    
    public double area(){
        return l*w;
    }
    
    public String toString(){
        return l + " x " + w;
    }
}
