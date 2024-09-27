package Recorded;

public class P4 {
    //if you create 7 constructor then it will excute 7 time
    // void P4(){} -> if i write like this then it is method not constructor and i call this method
    // P4 p=new P4(); and then
    //p.P4(); to call this method like this

    P4()
    {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        P4 p1=new P4();
        P4 p2=new P4();
        P4 p3=new P4();
        P4 p5=new P4();
        P4 p6=new P4();
        P4 p7=new P4();
      //  p1.P4();
    }
}
