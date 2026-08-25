public class swapValues {
    public static void main(String args[]){
        int a = 4, b=8;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);

//        a = a^b;   // using bitwise operator
//        b = a^b;
//        a = a^b;
//        System.out.println(a+" "+b);
    }
}