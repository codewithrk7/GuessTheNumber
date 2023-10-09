public class cwh33 {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b , int c , int d){
//        return a+b+c+d;
//    }
    static int sum(int  ...arr){
        // available int [] arr;
        int result=0;
        for (int a: arr){
            result  +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to  varargs tutorial");
        System.out.println("the sum of nothing is: "+sum());
        System.out.println("the summ of 4 and 5 is " +sum(4,5));
        System.out.println("the sum of 2,5,4 and 3 is " +sum(5,4,3));
        System.out.println("the sum of 7,8,9 and 4 is " +sum(7,8,9,4));
        System.out.println("the sum of 4,5,6,8,7,9 and is " +sum(4,5,6,8,7,9));
    }
}
