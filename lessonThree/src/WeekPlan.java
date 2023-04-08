import java.util.Random;
import java.util.Scanner;


public class WeekPlan {
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        String day = "";
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to work";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "cooking a food";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "walk in the forest";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to market";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "sleepday";

        while (!day.equals("EXIT")) {
            day = newDay();
            switch (day) {
                case "SUNDAY":
                    System.out.println("Your tasks for " + scedule[0][0] + ": " + scedule[0][1]);
                    break;
                case "MONDAY":
                    System.out.println("Your tasks for " + scedule[1][0] + ": " + scedule[1][1]);
                    break;
                case "TUESDAY":
                    System.out.println("Your tasks for " + scedule[2][0] + ": " + scedule[2][1]);
                    break;
                case "WEDNESDAY":
                    System.out.println("Your tasks for " + scedule[3][0] + ": " + scedule[3][1]);
                    break;
                case "THURSDAY":
                    System.out.println("Your tasks for " + scedule[4][0] + ": " + scedule[4][1]);
                    break;
                case "FRIDAY":
                    System.out.println("Your tasks for " + scedule[5][0] + ": " + scedule[5][1]);
                    break;
                case "SATURDAY":
                    System.out.println("Your tasks for " + scedule[6][0] + ": " + scedule[6][1]);
                    break;
                case "EXIT":
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }

    private static String newDay() {
        System.out.println("Please, input the day of the week: ");
        Scanner myScanner = new Scanner(System.in);
        String day = myScanner.nextLine();
        day = day.toUpperCase().trim();
        return day;
    }
}
