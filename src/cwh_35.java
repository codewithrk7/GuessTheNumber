public class cwh_35 {
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumrec(int n){
        if (n==1){
            return 1;
        }
        return n +sumrec(n-1);
    }
    static void pattern1_rect(int n){
        if (n>0){
            pattern1_rect(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    static int celcius(int c){
//        if (c ==1)  {
//            return 33.8;
//        }
//        return n  C x 9/5) + 32;
//    }
    public static void main(String[] args) {
        // problem one
        multiplication(7);
//        problem two
        pattern1(8);
//        problem 35
        int c = sumrec(45);
        System.out.println(c);
//        problem 8
        pattern1_rect(9);
    }
}
