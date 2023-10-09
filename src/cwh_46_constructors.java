class Base1{
    Base1(){
        System.out.println("Mai ek constructor hu");
    }
    Base1(int a){
        System.out.println("Mai ek constructor hu with value of a as : " +a);
    }
}
 class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("I am a derived in constructor");
    }
    Derived1(int x , int y){
        super(x);
        System.out.println("i am an overloading in derived1 : " + y);
    }
 }
 class ChildofDerived extends Derived1{
    ChildofDerived(){
        System.out.println("I am a child of Derived constructor");
    }
    ChildofDerived(int x , int y, int z){
        super(x,y);
        System.out.println(" i am a child of derived wiht valueod z as:" +z);
    }
 }
public class cwh_46_constructors {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d  = new Derived1();
//        Derived1 d  = new Derived1(4,9);
//        ChildofDerived cd = new ChildofDerived();
        ChildofDerived cd = new ChildofDerived(4,5,6);
    }
}
