package sept.ex_18092024;

public class Lab008 {
    public static void main(String[] args) {
        //Unary Operator
        int a=+65;  // Unary Operator
        int b=-1;   // Unary Operator
        System.out.println(a);
        System.out.println(b);
        b=b+1;    //b=-1+1;=0
        System.out.println(b);

        String name="pramod";
        String name1="dutta";
        System.out.println(name+name1);
        System.out.println(name+name1+a+b);
        System.out.println(name+name1+(a+b));
        System.out.println(a+b+name+name1);

    }
}
