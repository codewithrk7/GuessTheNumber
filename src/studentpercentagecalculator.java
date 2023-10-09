import java.util.Scanner;
public class studentpercentagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st subject marks: ");
        int s1 = sc.nextInt();
        System.out.println("Enter 2nd subject marks: ");
        int s2 = sc.nextInt();
        System.out.println("Enter 3st subject marks: ");
        int s3 = sc.nextInt();
        System.out.println("Enter 4st subject marks: ");
        int s4 = sc.nextInt();
        System.out.println("Enter 5st subject marks: ");
        int s5 = sc.nextInt();
        int total_marks = s1+s2+s3+s4+s5;
        float percentage = total_marks;
    }
}
