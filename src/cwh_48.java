class A{
    public int a;
    public  int harry(){
        return 4;
    }
    public void math2(){
        System.out.println("I am method 2 of classA");
    }
}
class  B extends A {
    @Override
    public void math2() {
        System.out.println("I am method 2 of class b");
    }

    public void math3() {
        System.out.println("I am method 3 of class b");
    }
}
    public class cwh_48 {
        public static void main(String[] args) {

            A a = new A();
            a.math2();

            B b = new B();
            b.math2();
        }
    }

