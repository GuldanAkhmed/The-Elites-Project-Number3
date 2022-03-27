package com.syntax.groupproject3;

//We have to calculate the average of marks obtained in three subjects by student A and by student B.
// Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
// Provide implementation of abstract method in classes 'A' and 'B'.
// The constructor of student A takes the marks in three subjects as its parameters
// and the marks in four subjects as its parameters for student B. Test your code

abstract class Marks {
    //abstract method returns double value
    public abstract double getPercentage();
}
// class extends because "Marks" is also a class even if its abstract
// (class extends to class) (class implements to interfase)
class A extends Marks {
    //3 subject variables
    private double sub1, sub2, sub3;

    // creating a constructor with the above variables
    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    // overriding the method from abstract class and adding logic for implementation
    @Override
    public double getPercentage() {
        //logic for implementation (return type is double so we must add word "return"
        return (sub1 + sub2 + sub3) / 3;
    }
}
// class extends
class B extends Marks {
    // providing 4 variables for this class
    private  double sub1, sub2, sub3, sub4;

    // creating a constructor for the given variables
    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }
    // overriding the abstract method and adding logic for implementation
    @Override
    public double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}
public class Task02 {
    public static void main(String[] args) {
        A obj1 = new A(60, 99, 79);
        System.out.println("Student A's mark " + obj1.getPercentage());
        B obj2 = new B(100, 34, 88, 99);
        System.out.println("Student B's mark " + obj2.getPercentage());

    }
}


