/*
**************WELCOME TO GRADING SYSTEM*************
Enter Student Name:      NAME [ENTER]
Enter Student Number:    1111 [ENTER]

Enter Grade in Math:     1   [ENTER]
Enter Grade in English:  1   [ENTER]
Enter Grade in Science:  1   [ENTER]
Enter Grade in ESP:      1   [ENTER]
Enter Grade in MAPEH:    1   [ENTER]
Enter Grade in Filipino: 1   [ENTER]
Enter Grade in AP:       1   [ENTER]
Enter Grade in TLE:      1   [ENTER]

*****************************************************
Student Name: NAME
Student Number: 1111
Average Grade: 1.0
Rounded Grade: 1
Remarks:****
Awards: ****
*****************************************************
Would you like to check another student record? (y/n):
*/

import java.util.*;

public class Grade {
    public static void main(String[] args) {

        String studentName = "";
        int studentNumber = -1;
        String continueInput;

       // double math = -1, english = -1, science = -1, ESP = -1, MAPEH = -1, filipino = -1, AP = -1, TLE = -1;
        double math, english, science, ESP, MAPEH, filipino, AP, TLE;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**************WELCOME TO GRADING SYSTEM*************");


            while (studentName.isEmpty() || !studentName.matches("[A-Za-z]+( [A-Za-z]+)*")) {
                System.out.printf("%-25s", "Enter Student Name: ");
                studentName = sc.nextLine();

                // The "[A-Za-z]+( [A-Za-z]+)*" basically to verify if "name" contains characters
                if (!studentName.matches("[A-Za-z]+( [A-Za-z]+)*")) {
                    System.out.println("Invalid Name. Please enter a valid name.");
                    continue;
                }
                break;
            }

            //Add lang ako Student Number
            do {
                System.out.printf("%-25s", "Enter Student Number: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                    System.out.printf("%-25s", "Enter Student Number: ");
                }
                studentNumber = sc.nextInt();
                if (studentNumber <= -1) {
                    System.out.println("Invalid student number. Please enter a valid positive number.");
                }
            } while (studentNumber <= -1);

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
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Math: ");
                }
                math = sc.nextDouble();
                if (math < 0 || (math <= 59.4 && math >= 0) || math > 100) {
                    System.out.println("Error: did not meet the required grade ");
                }
            } while (math < 0 || (math <= 59.4 && math >= 0) || math > 100);

            //English
            do {
                System.out.printf("%-25s", "Enter Grade in English: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in English: ");
                }
                english = sc.nextDouble();
                if (english < 0 || (english <= 59.4 && english >= 0) || english > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (english < 0 || (english <= 59.4 && english >= 0) || english > 100);

            //Science
            do {
                System.out.printf("%-25s", "Enter Grade in Science: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Science: ");
                }
                science = sc.nextDouble();
                if (science < 0 || (science <= 59.4 && science >= 0) || science > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (science < 0 || (science <= 59.4 && science >= 0) || science > 100);


            //ESP
            do {
                System.out.printf("%-25s", "Enter Grade in ESP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in ESP: ");
                }
                ESP = sc.nextDouble();
                if (ESP < 0 || (ESP <= 59.4 && ESP >= 0) || ESP > 100) {
                    System.out.println("Error: did not meet the required grade ");
                }
            } while (ESP < 0 || (ESP <= 59.4 && ESP >= 0) || ESP > 100);

            //MAPEH
            do {
                System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                }
                MAPEH = sc.nextDouble();
                if (MAPEH < 0 || (MAPEH <= 59.4 && MAPEH >= 0) || MAPEH > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (MAPEH < 0 || (MAPEH <= 59.4 && MAPEH >= 0) || MAPEH > 100);

            //Filipino
            do {
                System.out.printf("%-25s", "Enter Grade in Filipino: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Filipino: ");
                }
                filipino = sc.nextDouble();
                if (filipino < 0 || (filipino <= 59.4 && filipino >= 0) || filipino > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (filipino < 0 || (filipino <= 59.4 && filipino >= 0) || filipino > 100);

            //AP
            do {
                System.out.printf("%-25s", "Enter Grade in AP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in AP: ");
                }
                AP = sc.nextDouble();
                if (AP < 0 || (AP <= 59.4 && AP >= 0) || AP > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (AP < 0 || (AP <= 59.4 && AP >= 0) || AP > 100);

            //TLE
            do {
                System.out.printf("%-25s", "Enter Grade in TLE: ");
                while (!sc.hasNextDouble()) {
                    //When user input a character or string
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in TLE: ");
                }
                TLE = sc.nextDouble();
                //When user input a negative values (saka na ung pag lagpas 100)
                if (TLE < 0 || (TLE <= 59.4 && TLE >= 0) || TLE > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (TLE < 0 || (TLE <= 59.4 && TLE >= 0) || TLE > 100);

            //Formula to compute grades (Total subjects) / Total number of subjecrs
            double avgGrade = (math + english + science + ESP + MAPEH + filipino + AP + TLE) / 8;
            long roundedAvgGrade = Math.round(avgGrade);


            System.out.println();

            System.out.println("*****************************************************");


            System.out.printf("Student Name: %s\n", studentName);
            System.out.printf("Student Number: %d\n", studentNumber);
            System.out.println("Average Grade: " + avgGrade);
            System.out.println("Rounded Grade: " + roundedAvgGrade);


            if (roundedAvgGrade >= 96 && roundedAvgGrade <= 100) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HIGHEST HONOR");
            } else if (roundedAvgGrade >= 90 && roundedAvgGrade <= 95) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HIGH HONOR");
            } else if (roundedAvgGrade >= 85 && roundedAvgGrade <= 89) {
                System.out.println("Remarks: Passed");
                System.out.println("Awards: WITH HONOR");
            } else if (roundedAvgGrade >= 75 && roundedAvgGrade <= 84) {
                System.out.println("Remarks: Passed");
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
            studentName = "";
        } while (continueInput.equalsIgnoreCase("y"));

        sc.close();
    }
}