package Recorded;

public class Lab100 {
    public static void main(String[] args) {
    Vehicle v=new Vehicle();
     int Speed=v.maxSpeed;
        System.out.println(Speed);
     v.display();

    }
}
class Car{
    int maxSpeed=100;
    public void display(){
        System.out.println("This is Parent class");

    }
}
class Vehicle extends Car{
    int maxSpeed=200;
    public void display(){
        System.out.println("This is child class");
        System.out.println(this.maxSpeed); //this keyword will use to call this class means Vehicle my class
        System.out.println(super.maxSpeed); // super keyword will use to call this class means car my parent class
    }

}
