import java.util.Scanner;
public class percentagecalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        float s1= sc.nextInt();
        System.out.println("Enter 2st subject marks");
        float s2= sc.nextInt();
        System.out.println("Enter 3st subject marks");
        float s3= sc.nextInt();
        float total_Marks=s1+s2+s3;
        float percentage=total_Marks*100/300;
        System.out.println("Your total marks ="+total_Marks);
        System.out.println("your percentage is = "+percentage);
    }
}
