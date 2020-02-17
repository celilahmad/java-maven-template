package app;


import java.util.Scanner;

public class HelloWorldApp {

    public static void main(String[] args) {
        boolean guessed=true;
        Scanner sc = new Scanner(System.in);
        int rl = (int)(Math.random()*5 );
        int rc = (int)(Math.random()*5 );
        String [][]box = new String[5][5];

        /*for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(i + "|");
            } else {

                System.out.print(" " + i + " |");
            }

        }*/
        System.out.println();
        for(int i=0;i<box.length;i++) {
            //System.out.print(i+1+ "|");
            for(int j=0;j<box[i].length;j++) {
                box[i][j]=" - ";
                System.out.print(" - ");
            }
            System.out.println();
        }
        System.out.println("Correct row colum is " + (rl+1)+" " + (rc+1));

        int guessedRow = 0;
        int guessedCol = 0;
        while(guessed) {

            box[rl][rc]=" x ";
            System.out.println("Enter row and column");
            guessedRow=sc.nextInt()-1;
            //System.out.println("Enter column");
            guessedCol=sc.nextInt()-1;



            if(box[guessedRow][guessedCol]==" x ") {
                for(int i=0;i<box.length;i++) {
                    for(int j=0;j<box[i].length;j++) {
                        System.out.print(box[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("You have won");
                guessed=false;
                //System.exit(0);
            }else {
                box[guessedRow][guessedCol]=" * ";
                box[rl][rc]=" - ";
                for(int i=0;i<box.length;i++) {
                    for(int j=0;j<box[i].length;j++) {
                        System.out.print(box[i][j]);
                    }
                    System.out.println();
                }
            }

        }



    }

}
