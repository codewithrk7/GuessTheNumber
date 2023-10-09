class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
//class DoClass extends EkClass{
//    DoClass(int c){
//        super(c);
//        System.out.println("Mai ek constructor hoon");
//    }
//}
public class cwh_47_superandthis {
    public static void main(String[] args) {
        EkClass e = new EkClass(68451);
//        DoClass d = new DoClass(6);
        System.out.println(e.getA());

    }
}
