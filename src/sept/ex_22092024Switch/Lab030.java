package sept.ex_22092024Switch;

public class Lab030 {
    public static void main(String[] args) {
        // we get out hello and then 65 bcz we not use break in default
        char code='C';
        switch(code){
            default:
                System.out.println("hello");
                //break;
            case 'A':
                System.out.println(65);
                break;
            case 'B':
                System.out.println(66);
                break;
        }
    }
}
