package Recorded;

  public class P3 {
    String name;
    int roll;
  P3(String name,int roll){
    this.name=name;
    this.roll=roll;
//      System.out.println(name);
//      System.out.println(roll);
}
    public static void main(String[] args) {
        P3 p=new P3("Gold",1);
        System.out.println("p.name");
       System.out.println(p.roll);
    }
}
