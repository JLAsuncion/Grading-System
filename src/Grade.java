//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.*;

public class Grade {
    public static void main(String[] args) {

        String name = "";
        int SD_Number = -1;
        String continueInput;

        double math = -1, english = -1, science = -1, ESP = -1, MAPEH = -1, filipino = -1, AP = -1, TLE = -1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**************WELCOME TO GRADING SYSTEM*************");



                while (name.isEmpty() || !name.matches("[A-Za-z]+( [A-Za-z]+)*")) {
                System.out.printf("%-25s", "Enter Student Name: ");
                name = sc.nextLine();

                // The "[A-Za-z]+( [A-Za-z]+)*" basically to verify if "name" contains characters
                if (!name.matches("[A-Za-z]+( [A-Za-z]+)*")) {
                    System.out.println("Invalid Name");
                    continue;
                }
                break;
            }

            //Add lang ako Student Number
            do {
                System.out.printf("%-25s", "Enter Student Number: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Student Number: ");
                }
                SD_Number = sc.nextInt();
                if (SD_Number <= -1) {
                    System.out.println("Invalid ");
                }
            } while (SD_Number <= -1);

            System.out.println();
        /*
        System.out.println("AVERAGE FOR HONORS");
        System.out.println("WITH HIGHEST HONOR(100-96), WITH HIGH HONOR(95-90), WITH HONOR(89-85)");
        System.out.println();

         */

            //Looping Gallore
            //Math
            do {
                System.out.printf("%-25s", "Enter Grade in Math: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Math: ");
                }
                math = sc.nextDouble();
                if (math <= -1) {
                    System.out.println("Invalid ");
                }
            } while (math <= -1);

            //English
            do {
                System.out.printf("%-25s", "Enter Grade in English: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in English: ");
                }
                english = sc.nextDouble();
                if (english <= -1) {
                    System.out.println("Invalid ");
                }
            } while (english <= -1);

            //Science
            do {
                System.out.printf("%-25s", "Enter Grade in Science: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Science: ");
                }
                science = sc.nextDouble();
                if (science <= -1) {
                    System.out.println("Invalid ");
                }
            } while (science <= -1);


            //ESP
            do {
                System.out.printf("%-25s", "Enter Grade in ESP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in ESP: ");
                }
                ESP = sc.nextDouble();
                if (ESP <= -1) {
                    System.out.println("Invalid ");
                }
            } while (ESP <= -1);

            //MAPEH
            do {
                System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                }
                MAPEH = sc.nextDouble();
                if (MAPEH <= -1) {
                    System.out.println("Invalid ");
                }
            } while (MAPEH <= -1);

            //Filipino
            do {
                System.out.printf("%-25s", "Enter Grade in Filipino: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Filipino: ");
                }
                filipino = sc.nextDouble();
                if (filipino <= -1) {
                    System.out.println("Invalid ");
                }
            } while (filipino <= -1);

            //AP
            do {
                System.out.printf("%-25s", "Enter Grade in AP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in AP: ");
                }
                AP = sc.nextDouble();
                if (AP <= -1) {
                    System.out.println("Invalid ");
                }
            } while (AP <= -1);

            //TLE
            do {
                System.out.printf("%-25s", "Enter Grade in TLE: ");
                while (!sc.hasNextDouble()) {
                    //When user input a character or string
                    System.out.println("Not a number");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in TLE: ");
                }
                TLE = sc.nextDouble();
                //When user input a negative values (saka na ung pag lagpas 100)
                if (TLE <= -1) {
                    System.out.println("Invalid ");
                }
            } while (TLE <= -1);

            //Formula to compute grades (Total subjects) / Total number of subjecrs
            double avgGrade = (math + english + science + ESP + MAPEH + filipino + AP + TLE) / 8;
            long roundedAvgGrade = Math.round(avgGrade);


            System.out.println();

            System.out.println("*****************************************************");


            System.out.printf("Student Name: %s\n", name);
            System.out.printf("Student Number: %d\n", SD_Number);
            System.out.println("Average Grade: " + avgGrade);
            System.out.println("Rounded Grade: " + roundedAvgGrade);


            if (roundedAvgGrade >= 96 && roundedAvgGrade <= 100) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HIGHEST HONOR(puro ai naman)");
            } else if (roundedAvgGrade >= 90 && roundedAvgGrade <= 95) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HIGH HONOR(ai parin)");
            } else if (roundedAvgGrade >= 85 && roundedAvgGrade <= 89) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HONOR(naka chamba ah)");
            } else if (roundedAvgGrade >= 75 && roundedAvgGrade <= 84) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: HONOR DOESNT MATTERS");
            }
            //This condition below executes when the grade is -1 or when grade is above 100
            else if (roundedAvgGrade <= -1 || roundedAvgGrade >= 101) {
                System.out.println("Remarks: Invalid");
            } else {
                System.out.println("Remarks: Failed");
            }

            System.out.println("*****************************************************");
            System.out.print("Would you like to check another student record? (y/n): ");
            sc.nextLine();
            continueInput = sc.nextLine();
            name ="";
        } while (continueInput.equalsIgnoreCase("y"));

        sc.close();
    }
}