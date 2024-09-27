package sept.ex_18092024;

public class Lab014TypeC {
    public static void main(String[] args) {
        //Typecasting
        //1.Widding  2.Norrowing
        // Widding means we can strore data smaller data type to bigger data type
        byte b=10;
        int a=b;  // valid -implict casting -JVM
        int a1=(int)b;  // valid-expilict casting -jvm
        System.out.println(a1);


        // Norrowing
        int val=300;
        // byte b1=val; //invalid-implicit casting-JVM
        byte b2=(byte)val; //Explixit casting
        System.out.println(b2);

        long num=9876543210l;
      //  short s=num;   //Norrowing Invalid -not run
        short s1=(short)num;
        System.out.println(s1);
    }
}
