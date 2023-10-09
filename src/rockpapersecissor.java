import java.util.Random;
import java.util.Scanner;
public class rockpapersecissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock , 1 for paper , 2 for scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt();

        if (userinput==computerInput){
            System.out.println("Draw");
        } else if (userinput==0 && computerInput==2 || userinput==1 && computerInput==0 || userinput==2 && computerInput==1) {
            System.out.println("you win");
        }
        else {
            System.out.println("Computer win");
        }
        System.out.println("Computer choice: " +computerInput);
    }
}
