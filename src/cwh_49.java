class Phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("My name is java class 1");
    }
}

class SmartPhone extends Phone{
    public void swagat(){
        System.out.println("aapka sawagt hai");
    }
    public void name(){
        System.out.println("My name is java in class 2");
    }
}

public class cwh_49 {
    public static void main(String[] args) {

//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();
        Phone obj = new SmartPhone(); // super class ka reference sub class ka reference ke equal hota hai
//        SmartPhone obj2 = new Phone(); // Not Allowed through the Error
          obj.greet();
          obj.name();
    }
}
