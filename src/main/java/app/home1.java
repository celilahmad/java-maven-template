package app;

import java.util.Arrays;
import java.util.Scanner;

public class home1 {

    public static void main(String[] args) {

        int[] array = new int[1000];
        int number = (int) (Math.random() * 100);
        int name = 0;
        int wrongNumbers = 0;

        System.out.println("Let the game begin");

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 0-100");


        while (name != number) {
            wrongNumbers++;
            name = sc.nextInt();
            if(name>=0 && name<=100) {
                if (name > number) {
                    System.out.println("Your number is too big. Please, try again.");


                } else if (name < number) {
                    System.out.println("Your number is too small. Please, try again.");

                }
                for (int i =0;i<array.length;i++) {
                    for (int j=i+1;j<array.length;j++) {
                        if (array[j]!=array[i]){ // or use .equals()
                            array[wrongNumbers] = name;
                        }
                    }
                }

            }else{
                System.out.println("Please enter numbers range 0-100");

            }
        }
        System.out.println("Congratulations, number is " + name);

        int[] wrongArray = new int[wrongNumbers];


        System.arraycopy(array, 1, wrongArray, 0, wrongNumbers);

        Arrays.sort(wrongArray);

        System.out.println("Your numbers " + Arrays.toString(wrongArray));
    }
}
