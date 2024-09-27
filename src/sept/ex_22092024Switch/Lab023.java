package sept.ex_22092024Switch;

public class Lab023 {
    public static void main(String[] args) {
        //switch condition

        int day=1;
        switch (day) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thur");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
                default:
                    System.out.println("error");
                    break;
        }
        System.out.println("end of the loop");
    }



}
