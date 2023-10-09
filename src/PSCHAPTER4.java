import java.util.Scanner;
public class PSCHAPTER4 {
    public static void main(String[] args) {
//        int a = 10;
//        if (a=11)
//            System.out.println("I am 11");
//        else
//          System.out.println("I am not 11");
////        Error answer

//        question2
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physices");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in maths");
//        m3 = sc.nextByte();
//        float avg = m1+m2+m3/3.0f;
//        System.out.println("Your overal perfentage is:" + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congrats");
//        }
//        else{
//            System.out.println("Try again");
//        }
//        question 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your incomes in lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
////        float income = 3.3f;
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income<=5f){
//            tax = tax + 0.05f*(income-2.5f);
//        }
//        else if(income>5f && income<=10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(income-5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f*(5.0f-2.5f);
//            tax = tax + 0.2f*(10.0f-2.5f);
//            tax = tax + 0.3f*(income-10.0f);
//        }
//        System.out.println("the total tax paid by the employee is: " + tax);
//        question 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter you day number");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("sunday");
//        }
//        question 6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is organisation websites");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an commerical webites");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an indian websites");
        }
    }
}
