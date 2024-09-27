package Recorded;

public class P2 {
    public static void main(String[] args) {
        Person1 p=new Person1();

        // if child constr defualt construter -> Parent default constrcter will be called by super() automatically in java
    }
}
class Person1 extends Student{
    Person1(){

        System.out.println();
        int a=100;

    System.out.println("Person-DC");

    }

}


class Student extends Employee{
   Student(){
       super("Dhanu");

       int a=100;
        System.out.println("Student-DC");
    }

}
class Employee {
    int s=10;
    Employee(String d){
        System.out.println(d);
    }
}
