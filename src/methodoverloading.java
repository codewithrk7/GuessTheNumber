public class methodoverloading {
    static void foo(){
        System.out.println("good morning sir");
    }
    static void foo(int a , int b){
        System.out.println("good morning " +a +  " sir!") ;
        System.out.println("good morning " + b + " sir");
    }
//    static void foo(int a){
//        System.out.println("Good morning " + a + " sir!");
//    }
    static void change(int a) {
        a = 4587962;
    }

    static void change2(int[] arr) {
        arr[0] = 545;
    }

    static void telljokes() {
        System.out.println("What do you call a T-Rex that's been beaten up? Dino-sore.");
    }

    public static void main(String[] args) {
//        telljokes();
//        int [] marks = {45,89,32,65,78,45};
//        case 1 : changing the integer
//        int x = 87;
//        change(x);
//        System.out.println("the value of x  after running change is  - " +x);

//        case 2 : changing the array
//        int[] marks = {45, 89, 32, 65, 78, 45};
//        change2(marks);
//        System.out.println("the value of x after running change is " + marks[0]);

//        method overloading
//        foo();
//        foo(851);
        foo(4946,646);
//        parameter jiska value diya jayega and argument are actual
    }
}
