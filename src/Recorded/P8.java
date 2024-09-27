package Recorded;

class P8 {
    String s = "Parent variable";  // globle area
}
    class L1 extends P8{
        String s="child variable";

        public void K1(){
            System.out.println(s);
            System.out.println(this.s);
            System.out.println(super.s);
        }
    }
class Test {
    public static void main(String[] args) {
        L1 l = new L1();
        l.K1();
    }
}