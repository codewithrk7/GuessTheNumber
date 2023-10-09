import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject marks ");
        float s1 = sc.nextInt();
        System.out.println("Enter 2nd subject marks");
        float s2 = sc.nextInt();
        System.out.println("Enter 3rd subject marks ");
        float s3 = sc.nextInt();
        System.out.println("Enter 4th subject marks");
        float s4 = sc.nextInt();
        System.out.println("Enter 5th subject marks ");
        float s5 = sc.nextInt();
        float total_Marks = s1 +s2+s3+s4+s5;
        float percentage = total_Marks*100/500;
        System.out.println("your total marks ="+total_Marks);
        System.out.println("Your percentage is="+percentage);
    }
}
