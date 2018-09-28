package csii;

/**
 *Ian Nielsen
 *Due Date: November 18th 2013
 *Class Person
 */
//Objects of class person hold their own name and age.
public class Person {
    public String name;
    public int age;
    
    //Default constructor.
    public Person(){
        name  = "";
        age = 0;
    }
    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Method returns true if the given object has the same name and age as
    //the person object that is calling this method.
    public boolean equals(Person other){
        if((this.name.equals(other.name)) && (this.age == other.age)){
            return true;
        }
        else{
            return false;
        }
    }
}
