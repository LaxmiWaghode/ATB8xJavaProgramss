package Recorded;

public class P9 {
    P9(double a){
        this(10);
        System.out.println("Double Parameter constructor");

    }
    P9(int b){
        this();
        System.out.println("Int Parameter constructor ");
    }
    P9(){
        System.out.println("No Parameter constructor");
    }

    public static void main(String[] args) {
        P9 P1=new P9(10.0);
        P9 P2=new P9(10);
        P9 P3=new P9();

    }
}
