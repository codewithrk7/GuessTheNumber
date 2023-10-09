public class chw31 {
    static void telljokes(){
        System.out.println("What do you call a T-Rex that's been beaten up? Dino-sore.");
    }
    static int logic(int x, int y){
        int z;
        if (x>y){
            z =x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 6;
        int b =8;
        int c;
        // method invocation using object creation
        chw31 obj = new chw31();
        c = obj.logic(a,b);
//        c = logic(a,b);
        if (a>b){
            c =a+b;
        }
        else{
            c = (a+b)*5;
        }
        int a1 = 4;
        int b1 = 5;
        int c1;
        c1 = obj.logic(a1,b1);
//        c1 = logic(a1,b1);
        int r1 = 2;
        int r2 = 3;
        int r3;
        r3 = obj.logic(r1,r2);
        System.out.println(r3);
        System.out.println(c);
        System.out.println(c1);
    }
}
