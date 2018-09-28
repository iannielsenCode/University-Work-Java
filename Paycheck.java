package csii;

/******************************************************************************
 * Name: Ian Nielsen
 * Paycheck Class
 * Due Date: September 25th 2013
 *****************************************************************************/

/******************************************************************************
 * Class represents a paycheck that can be printed for a group of students.
 *****************************************************************************/

public class Paycheck {
    private static double securityTax = .0765;
    private static double fedTax = .25;
    private static String schoolName = "Framingham State University";
    
    private double wage;
    private double hours;
    private String name;
    private double grossIncome;
    private double netIncome;
    private double tax;
    
    //Default Constructor
    public Paycheck(){
        wage = 0;
        hours = 0;
        name = "";
    }
    
    //Constructs object with paycheck name, numbers of hours worked, and wage.
    public Paycheck(String a, int b, int c){
        name = a;
        hours = b;
        wage = c;
    }
    
    //Method deducts taxes from the gross income by taking the number of hours 
    //multiplied by the wage to equal gross income and calculates the amount 
    //to be deducted by taking the static tax percentages and multiplying them
    //by the gross income. The total tax is then subtracted by the gross income 
    //to obtain the net income.
    public void taxDeduction(){
        double b, c;
        this.grossIncome = (this.hours * this.wage);
        b = (this.grossIncome * securityTax);
        c = (this.grossIncome * fedTax);
        this.tax = b+c;
        this.netIncome = this.grossIncome - this.tax;
    }
    
    //Method prints the paycheck with the students name, school, wage, hours 
    //worked, the gross income, the tax deduction, and the net income.
    public void printCheck(){
        System.out.println("Name:" + this.name + "\nSchool:" +
                Paycheck.schoolName + "\nWage:" + this.wage + "\nHours:" +
                this.hours + "\nGross Income:" + this.grossIncome + "\nTax:" +
                this.tax + "\nNet Income:" + this.netIncome);  
    }
    
    
}
