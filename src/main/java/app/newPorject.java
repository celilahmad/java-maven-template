package app;


import java.util.Scanner;

public class newPorject {
    public static void main(String[] args) {

        String[][] schedule = new String[7][2];

        schedule[0][0] = "Sunday";
        schedule[0][1] = "Do the hommeworks";

        schedule[1][0] = "Monday";
        schedule[1][1] = "Go to course; Watch film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Go to course; Play football";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Go to course; Play video games";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to course; Go out with friends";

        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to course; Visit grandpa";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "Relax whole day";

        Scanner sc = new Scanner(System.in);

        String beginning = "Your task for ";
        boolean test = false;
        String exit = "Exit";

        while (test == false) {
            System.out.println("Please enter day of the week");
            String task1 = sc.nextLine().trim();
            String task = task1.substring(0, 1).toUpperCase() + task1.substring(1).toLowerCase();


            if (task.equals(schedule[0][0]) || task.equals(schedule[1][0]) || task.equals(schedule[2][0]) || task.equals(schedule[3][0])
                    || task.equals(schedule[4][0]) || task.equals(schedule[5][0]) || task.equals(schedule[6][0])) {

                switch (task) {
                    case "Monday":
                        System.out.println(beginning + task + " " + schedule[1][1]);
                        break;
                    case "Tuesday":
                        System.out.println(beginning + task + " " + schedule[2][1]);
                        break;
                    case "Wednesday":
                        System.out.println(beginning + task + " " + schedule[3][1]);
                        break;
                    case "Thursday":
                        System.out.println(beginning + task + " " + schedule[4][1]);
                        break;
                    case "Friday":
                        System.out.println(beginning + task + " " + schedule[5][1]);
                        break;
                    case "Saturday":
                        System.out.println(beginning + task + " " + schedule[6][1]);
                        break;
                    case "Sunday":
                        System.out.println(beginning + task + " " + schedule[0][1]);
                        break;
                }
            } else if (task.equals(exit)) {
                test = true;
            }/*else if (task.equals("change" + schedule[0][0])) {
                System.out.println("Please, input new tasks for Monday");
                String task2 = sc.nextLine();
                task2.replaceAll(task,task2);
            }*/else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }

    }


}
