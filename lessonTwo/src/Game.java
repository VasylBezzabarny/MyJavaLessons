import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int[][] Array = new int[6][6];
        int a = myRandom.nextInt(5) + 1;
        int b = myRandom.nextInt(5) + 1;
        System.out.println("All set. Get ready to rumble!");
        String[][] target = {{" 0 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 "},
                {" 1 ", " - ", " - ", " - ", " - ", " - "},
                {" 2 ", " - ", " - ", " - ", " - ", " - "},
                {" 3 ", " - ", " - ", " - ", " - ", " - "},
                {" 4 ", " - ", " - ", " - ", " - ", " - "},
                {" 5 ", " - ", " - ", " - ", " - ", " - "}};
        //target[a][b] = " ! ";
        for (int i = 0; i < target.length; i++) {
            for (int j = 0; j < target[i].length; j++) {
                System.out.print(target[i][j] + "|");
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        int g = 1;
        int v = 1;
        do {
            do {
                System.out.println("Выберите значение ячейки от 1 до 5 по горизонтали");
                String numberGorizont = scan.nextLine();
                g = Integer.valueOf(numberGorizont);
                if ((g > 5) || (g < 0)) {
                    do { System.out.println("Выберите допустимое значение");
                        numberGorizont = scan.nextLine();
                        g = Integer.valueOf(numberGorizont);}
                    while ( g > 5);
                    break;
                } else {
                    System.out.println("Ваше значение " + numberGorizont);
                    break;
                }
            } while ( (g < 6) & (g > 0) );
            do {
                System.out.println("Выберите значение ячейки от 1 до 5 по вертикали");
                String numberVert = scan.nextLine();
                v = Integer.valueOf(numberVert);
                if ( (v > 5) || (v < 0) ) {
                    do { System.out.println("Выберите допустимое значение");
                        numberVert = scan.nextLine();
                        v = Integer.valueOf(numberVert);}
                    while ( (v > 5) || (v<0) );
                    break;
                } else {
                    System.out.println("Ваше значение " + numberVert);
                    break;
                }
            } while ( (v < 6) & (v>0) );
            if (target[g][v] != target[a][b]) {
                System.out.println("Ваш результат");
                target[g][v] = " * ";
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "|");
                    }
                    System.out.println();
                }
            }
            if (target[g][v] == target[a][b]) {
                target[g][v] = " X ";
                System.out.println("You have won!");
                for (int i = 0; i < target.length; i++) {
                    for (int j = 0; j < target[i].length; j++) {
                        System.out.print(target[i][j] + "|");
                    }
                    System.out.println();
                }
            }
        } while (target[g][v] != target[a][b]);
    }
}

