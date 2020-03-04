package app;


import java.util.Scanner;

public class HelloWorldApp {

    public static void main(String[] args) {


        int height = 6;
        int width = 5;
        int[][] square = new int[height][width];

        int guess1 = 0;
        int guess2 = 0;
        //String[][] game = new String[10][10];

        int randomLine = (int)(Math.random()*5+0.5);
        int randomColumn = (int)(Math.random()*5+0.5);
        int[][] rand = new int[randomLine][randomColumn];


        //if (guess1=rand[][])


        for (int i = 0; i <= width; i++) {
            if (i == 0) {
                System.out.print(i + "|");
            } else {
                System.out.print(" " + i + " |");
            }
        }
        System.out.println();
        for (int x = 1; x < square.length; x++) {
            System.out.print(x);
            for (int y = 0; y < square.length - 1; y++) {

                System.out.print("| - ");
            }

            System.out.println("|");
        }

        boolean con = true;
        Scanner sc = new Scanner(System.in);
        while (con){
            System.out.println("Enter row");
            guess1 = sc.nextInt();
            System.out.println("Enter column");
            guess2 = sc.nextInt();

            //int [][] array = new int[guess1][guess2];

            if (guess1>0 && guess1 <6 && guess2>0 && guess2<6){

                if (guess1==randomLine && guess2==randomColumn){
                    System.out.println("Congrats you won");
                    con=false;
                }else{
                    System.out.println("Try again");

                }
            }


        }

    }

}
