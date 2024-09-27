package sept.ex_18092024;

public class Lab016 {
    public static void main(String[] args) {
         //Increment ++ and Decrement --
        //Pre and post
        // pre -increment: ++operand
        //value is increments first and then stored in the results
         int a=10;
         int b=++a;    // a=a+1; //11 a=11   int b=++a;  b=a+1 = 11
        System.out.println(a);
        System.out.println(b);

        int c=20;
        System.out.println(++c); // 1st increment the value the ans is 21  and then
        System.out.println(c);   // 2nd print then result  21


        //Post Increment : a++
        // First print the value and then 2nd increment the value
         int d=30;
         System.out.println(d++);  //First print the value  ans is 30
        System.out.println(d);     //then 2nd increment the value


        int e=10;
        System.out.println(e++ + ++e);
       // System.out.println(e);

    }
}
