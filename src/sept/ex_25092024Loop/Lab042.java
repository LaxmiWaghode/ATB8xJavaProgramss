package sept.ex_25092024Loop;

public class Lab042 {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i%2==0){
                System.out.println("even" + i);
                continue;
            }
            System.out.println();

            System.out.println(i);
        }
    }
}
