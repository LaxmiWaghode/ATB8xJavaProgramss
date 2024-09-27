package sept.ex_20092924IFElse;

public class Lab017 {
    public static void main(String[] args) {
        //Ternary Operater
        //condition ? expression_if_else : expression_if_else

        int a = (30 > 40) ? 10:20;
        System.out.println(a);

        int tushar =4;
        int prabhu=7;
        String result =(tushar > prabhu) ? "tushar won" : "prabhu won";
        System.out.println(result);

        String str= 10 >20 ? "10" : "TWENTY";
        System.out.println(str);

        int tushar_sal =4;
        int prabhu_sal =7;
        String result1 =(tushar_sal > prabhu_sal) ? "tushar won" : "prabhu won";
        System.out.println(result1);

        int a1 =20;
        int b1 =30;
        int max = a1>b1 ? a1:b1;
        int min = a1<b1 ? a1:b1;
        System.out.println(max);
        System.out.println(min);
    }
}
