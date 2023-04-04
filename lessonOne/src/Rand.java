import java.util.Random;
import java.util.Scanner;

public class Rand {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("What is your name?");
        String name = "";
        name = myScanner.nextLine();
        System.out.println("Your name is" + " " + name);
        int i = 101;
        while (i != 0) {
            String number = "";
            System.out.println("Your number is" + " " + number);
            number = myScanner.nextLine();
            int myNum = Integer.valueOf(number);
            Random myRandom = new Random();
            int[] Array = new int[100];
            int r = myRandom.nextInt(100);
            Array[r] = 1;
            System.out.println(r);
            if (myNum > r) {
                System.out.println("Your number is too big. Please, try again");
            } else {
                System.out.println("Your number is too small. Please, try again");
            }
            if (Array[myNum] == Array[r]) {
                System.out.println("Congratulations, " + (name) + "!");

            }
        }
    }
}