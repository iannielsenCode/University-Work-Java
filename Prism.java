package csii;

public class Prism extends Shape{
    private double l,w;
    
    public Prism(double l, double w, double h){
        super(h);
        this.l = l;
        this.w = w;
    }
    
    public double area(){
        return l*w;
    }
    
}
