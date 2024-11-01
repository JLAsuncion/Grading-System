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
        int failedSubjects = 0;


        double math, english, science, ESP, MAPEH, filipino, AP, TLE;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("★★★★★★★★★★★★★★★★★★★★WELCOME TO GRADING SYSTEM★★★★★★★★★★★★★★★★★★★★");


            while (studentName.isEmpty() || !studentName.matches("[A-Za-z\\.]+( [A-Za-z\\.]+)*")) {
                System.out.printf("%-25s", "Enter Student Name: ");
                studentName = sc.nextLine();

                // REGEX (Regular Expression):
                // A special text string for describing a search pattern
                // Helps check if text matches specific rules

                // Regex Patterns used:
                // [A-Za-z\\.] - Match letters(from capital A-Z and small a-z letters) and dots
                // "+" - One or more of previous characters
                // ( [A-Za-z\\.]+)* - Allow multiple words with spaces

                // Examples:
                // Allowed: "John", "John Luis", "St. John"
                // Error: "John123", "John!", "  "

                // The "[A-Za-z]+( [A-Za-z]+)*" basically to verify if "studentName" contains characters.
                if (!studentName.matches("[A-Za-z\\.]+( [A-Za-z\\.]+)*")) {
                    System.out.println("Invalid Name. Please enter a valid name.");
                    continue;
                }
                break;
            }

            do {
                System.out.printf("%-25s", "Enter Student Number: ");
                while (!sc.hasNextInt()) {
                    //Add comment for what is hasNextInt means
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

            //Looping Galore
            //Do while is used because it's useful for checking invalid input
            //Math
            do {
                System.out.printf("%-25s", "Enter Grade in Math: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Math: ");
                }
                math = sc.nextDouble();
                if (math <= 59.4 || math > 100) {
                    //Add more error handling
                    System.out.println("Error: did not meet the required grade ");
                }
            } while (math <= 59.4 || math > 100);

            //English
            do {
                System.out.printf("%-25s", "Enter Grade in English: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in English: ");
                }
                english = sc.nextDouble();
                if (english <= 59.4 || english > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (english <= 59.4 || english > 100);

            //Science
            do {
                System.out.printf("%-25s", "Enter Grade in Science: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Science: ");
                }
                science = sc.nextDouble();
                if (science <= 59.4 || science > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (science <= 59.4 || science > 100);


            //ESP
            do {
                System.out.printf("%-25s", "Enter Grade in ESP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in ESP: ");
                }
                ESP = sc.nextDouble();
                if (ESP <= 59.4 || ESP > 100) {
                    System.out.println("Error: did not meet the required grade ");
                }
            } while (ESP <= 59.4 || ESP > 100);

            //MAPEH
            do {
                System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in MAPEH: ");
                }
                MAPEH = sc.nextDouble();
                if (MAPEH <= 59.4 || MAPEH > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (MAPEH <= 59.4 || MAPEH > 100);

            //Filipino
            do {
                System.out.printf("%-25s", "Enter Grade in Filipino: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in Filipino: ");
                }
                filipino = sc.nextDouble();
                if (filipino <= 59.4 || filipino > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (filipino <= 59.4 || filipino > 100);

            //AP
            do {
                System.out.printf("%-25s", "Enter Grade in AP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-25s", "Enter Grade in AP: ");
                }
                AP = sc.nextDouble();
                if (AP <= 59.4 || AP > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (AP <= 59.4 || AP > 100);

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
                if (TLE <= 59.4 || TLE > 100) {
                    System.out.println("Error: did not meet the required grade");
                }
            } while (TLE <= 59.4 || TLE > 100);

            //Formula to compute grades (Total subjects) / Total number of subjecrs
            double avgGrade = (math + english + science + ESP + MAPEH + filipino + AP + TLE) / 8;
            long roundedAvgGrade = Math.round(avgGrade);

            System.out.println();

            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

            System.out.printf("Student Name: %s\n", studentName);
            System.out.printf("Student Number: %d\n", studentNumber);
            System.out.println("Average Grade: " + avgGrade);
            System.out.println("Rounded Grade: " + roundedAvgGrade);

            //Check if the grades is less than 75
            //if less than 75, 'failedSubjects' increments
            if(math < 75) failedSubjects++;
            if(english < 75) failedSubjects++;
            if(science < 75) failedSubjects++;
            if(ESP < 75) failedSubjects++;
            if(MAPEH < 75) failedSubjects++;
            if(filipino < 75) failedSubjects++;
            if(AP < 75) failedSubjects++;
            if(TLE < 75) failedSubjects++;

            //Conditions to be executed
            //if 'failedSubjects' is 0 means there is no subjects that are less than 75
            if(failedSubjects == 0){
                System.out.println("Remarks: Passed");
                if (roundedAvgGrade >= 96 && roundedAvgGrade <= 100) {
                    System.out.println("Awards: WITH HIGHEST HONOR");
                } else if (roundedAvgGrade >= 90 && roundedAvgGrade <= 95) {
                    System.out.println("Awards: WITH HIGH HONOR");
                } else if (roundedAvgGrade >= 85 && roundedAvgGrade <= 89) {
                    System.out.println("Awards: WITH HONOR");
                }

            }
            //if there is one or two subjects that are less than 75
            //this condition is executed
            else if (failedSubjects == 1 || failedSubjects == 2){
                System.out.println("Remarks: Summer Class");
            }
            //if there is three or more subjects that are less than 75
            //this is executed
            else {
                System.out.println("Remarks: Repeat");
            }


            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            //Ask if the user wants to check another student grades
            System.out.print("Would you like to check another student record? (y/n): ");
            sc.nextLine();
            continueInput = sc.nextLine();
            //Empty the "studentName" for the next scanner
            studentName = "";
        } while (continueInput.equalsIgnoreCase("y"));

        sc.close();
    }
}