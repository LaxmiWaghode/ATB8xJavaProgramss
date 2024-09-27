package sept.ex_22092024Switch;

public class Lab027 {
    public static void main(String[] args) {

        // -> : this is use for break
        int itemcode=004;
        switch (itemcode){
            case 001,007-> System.out.println("it is laptop");
            case 002 -> System.out.println("it is not  laptop");
            case 003,004,005-> System.out.println("it is actually laptop");
            default -> System.out.println("none");
        }
    }
}
