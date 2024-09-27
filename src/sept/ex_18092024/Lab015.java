package sept.ex_18092024;

public class Lab015 {
    public static void main(String[] args) {

        //Norrowing :store small value into bigger

        int course=100;
        float GST=18.45f;
        //int total_price=course+GST;/invalid-implicit casting-JVM
        // float total_price= course+GST; // 118.45   we get output but i want to store value in smaller data type like int
        //System.out.println(total_price);

        int result=course+(int)GST; // Norrowing explicit in that we loss data
        System.out.println(result);
    }
}
