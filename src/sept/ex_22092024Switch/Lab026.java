package sept.ex_22092024Switch;

public class Lab026 {
    public static void main(String[] args) {
        int itemcode=006;
        switch (itemcode) {
            case 001,002,003:
                System.out.println("All of them are electronic gadgets");
                break;
            case 004,005,006:
                System.out.println("This is Mech");
                break;
                default:
                    System.out.println("Invalid item code");
                    break;
        }
    }
}
