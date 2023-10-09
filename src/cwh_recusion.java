public class cwh_recusion {
    static int factorial(int n) {
        //factorial(n)= n*n-1*.....1
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int fiborecur(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return fiborecur(n-1)+fiborecur(n-2);
        }
    }
    static int factorial_iterative(int n){
        if (n==0|| n==1){
              return 1;
        }
        else{
            int product=1;
            for (int i=1;i<=n; i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("the value of fibonacci n is:"+fiborecur(n)) ;
        System.out.println("The value of factorial n is: "+ factorial(n));
        System.out.println("the value of factoiral n is:" + factorial_iterative(n));
    }
}
