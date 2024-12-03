/*
**************WELCOME TO GRADING SYSTEM*************
Enter Student Full Name:      NAME [ENTER]
Enter Student Number:         1111 [ENTER]

Enter Final Grade in Math:      1   [ENTER]
Enter Final Grade in English:   1   [ENTER]
Enter Final Grade in Science:   1   [ENTER]
Enter Final Grade in ESP:       1   [ENTER]
Enter Final Grade in MAPEH:     1   [ENTER]
Enter Final Grade in Filipino:  1   [ENTER]
Enter Final Grade in AP:        1   [ENTER]
Enter Final Grade in TLE:       1   [ENTER]

*****************************************************
Student Name: NAME
Student Number: 1111
General Average: 1.0
General Average Rounded: 1
Remarks:****
Awards: ****
*****************************************************
Would you like to check another student record? (y/n) or (Y/N):
*/

import java.util.*;

public class GradingSystem {
    public static void main(String[] args) {

        String studentFullName = "";
        long studentNumber;
        String continueInput;
        int failedSubjects = 0;

        double finalMathGrade, finalEnglishGrade, finalScienceGrade, finalESPGrade,
                finalMAPEHGrade, finalFilipinoGrade, finalAPGrade, finalTLEGrade;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("**************WELCOME TO GRADING SYSTEM*************");

            while (studentFullName.isEmpty() || !studentFullName.matches("[A-Za-z]+(\\.)?((,[ ])?|[ ])[A-Za-z]+(\\.)?( [A-Za-z]+(\\.)?)*")) {

                // Use System.out.printf to print a formatted string
                // The format specifier "%-25s" means:
                // % - Indicates the start of a format specifier
                // "-" - for left alignment
                // 25 - for the minimum width of the output
                // "s" - for a string output
                // This will print the string "Enter Grade in Math: " left-aligned within a 25-character wide field
                System.out.printf("%-25s", "Enter Student Full Name: ");
                studentFullName = sc.nextLine();


                if (studentFullName.isEmpty()) {
                    System.out.println("Error: Name cannot be empty. Please enter a name.");
                    continue;
                }

                // REGEX (Regular Expression):
                // A special text string for describing a search pattern
                // Helps check if text matches specific rules

                // Regex Patterns used:
                // [A-Za-z] - Match letters(from capital A-Z and small a-z letters)
                // "+" - One or more of previous characters
                // (\\.)? - Optionally match a dot (for abbreviations like Jr., St.)
                // ((,[ ])?|[ ]) - Allow either a comma followed by a space, or just a space between names
                // ( [A-Za-z]+(\\.)?)*  - Allow multiple words with spaces, each word can optionally end with a dot

                // Examples:
                // Allowed: "John", "John Luis", "St. John", "Peter, John", "Smith, John Jr."
                // Error: "John123", "John!", "John. ", " ", "", "Peter,Griffin" (no space after comma)


                if (!studentFullName.matches("[A-Za-z]+(\\.)?((,[ ])?|[ ])[A-Za-z]+(\\.)?( [A-Za-z]+(\\.)?)*")) {
                    System.out.println("Error: Name cannot contain numbers or special characters(except for dot(.) and comma(,) ");
                    continue;
                }
                break;
            }

            do {
                System.out.printf("%-25s", "Enter Student Number: ");

                // sc.hasNextLong() is a Scanner method that:
                // 1. Looks at the next input token without consuming it
                // 2. Returns true only if the next token can be converted to a long number
                // 3. Returns false if:
                //    - Input contains letters (e.g., "abc", "123a")
                //    - Input contains special characters (e.g., "$100", "12#34")
                //    - Input is empty
                //    - Number is too large for long data type
                while (!sc.hasNextLong()) {
                    // This block executes when hasNextLong() returns false
                    // Meaning the input cannot be converted to a valid long number
                    System.out.println("Error: Please enter a number.");

                    // sc.next() consumes/removes the invalid input
                    // This prevents an infinite loop by moving to the next input token
                    sc.next();

                    System.out.printf("%-25s", "Enter Student Number: ");
                }

                studentNumber = sc.nextLong();

                // Check if "studentNumber" is 12 digits by comparing range (100000000000L to 999999999999L)
                if (studentNumber < 100000000000L || studentNumber > 999999999999L) {
                    if (studentNumber < 0) {
                        // Handle negative values
                        System.out.println("Error: Negative numbers are not allowed.");
                    } else {
                        // Handle numbers that are not 12 digits
                        // This else executes when:
                        // - studentNumber < 100000000000L (less than 12 digits)
                        // - studentNumber > 999999999999L (more than 12 digits)
                        System.out.println("Error: Student number must be exactly 12 digits.");
                    }
                }
            } while (studentNumber < 100000000000L || studentNumber > 999999999999L);

            System.out.println();

            //Looping Galore
            //GRADES
            //Do while is used because it's useful for checking invalid input
            //Math
            do {
                System.out.printf("%-32s", "Enter Final Grade in Math: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in Math: ");
                }
                finalMathGrade = sc.nextDouble();
                if (finalMathGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalMathGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalMathGrade <= 59.9 || finalMathGrade > 100);

            //English
            do {
                System.out.printf("%-32s", "Enter Final Grade in English: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in English: ");
                }
                finalEnglishGrade = sc.nextDouble();
                if (finalEnglishGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalEnglishGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalEnglishGrade <= 59.9 || finalEnglishGrade > 100);

            //Science
            do {
                System.out.printf("%-32s", "Enter Final Grade in Science: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in Science: ");
                }
                finalScienceGrade = sc.nextDouble();
                if (finalScienceGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalScienceGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalScienceGrade <= 59.9 || finalScienceGrade > 100);


            //ESP
            do {
                System.out.printf("%-32s", "Enter Final Grade in ESP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in ESP: ");
                }
                finalESPGrade = sc.nextDouble();
                if (finalESPGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalESPGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalESPGrade <= 59.9 || finalESPGrade > 100);

            //MAPEH
            do {
                System.out.printf("%-32s", "Enter Final Grade in MAPEH: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in MAPEH: ");
                }
                finalMAPEHGrade = sc.nextDouble();
                if (finalMAPEHGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalMAPEHGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalMAPEHGrade <= 59.9 || finalMAPEHGrade > 100);

            //Filipino
            do {
                System.out.printf("%-32s", "Enter Final Grade in Filipino: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in Filipino: ");
                }
                finalFilipinoGrade = sc.nextDouble();
                if (finalFilipinoGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalFilipinoGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalFilipinoGrade <= 59.9 || finalFilipinoGrade > 100);

            //AP
            do {
                System.out.printf("%-32s", "Enter Final Grade in AP: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in AP: ");
                }
                finalAPGrade = sc.nextDouble();
                if (finalAPGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalAPGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalAPGrade <= 59.9 || finalAPGrade > 100);

            //TLE
            do {
                System.out.printf("%-32s", "Enter Final Grade in TLE: ");
                while (!sc.hasNextDouble()) {
                    //When user input a character or string
                    System.out.println("Error: Cannot be a letter or symbol");
                    sc.next();
                    System.out.printf("%-32s", "Enter Final Grade in TLE: ");
                }
                finalTLEGrade = sc.nextDouble();
                if (finalTLEGrade <= 59.9) {
                    System.out.println("Error: Did not meet the required grade ");
                } else if (finalTLEGrade > 100) {
                    System.out.println("Error: Grade exceeded ");
                }
            } while (finalTLEGrade <= 59.9 || finalTLEGrade > 100);

            //Formula to compute grades (Total subjects) / Total number of subjects
            double avgGrade = (finalMathGrade + finalEnglishGrade + finalScienceGrade + finalESPGrade +
            finalMAPEHGrade + finalFilipinoGrade + finalAPGrade + finalTLEGrade) / 8;

            //long roundedAvgGrade = Math.round(avgGrade);
            //Formula to round the average (add 0.5 and cast to int)
            int roundedAvgGrade = (int) (avgGrade + 0.5);

            System.out.println();

            System.out.println("*****************************************************");

            System.out.println("Student Name: " + studentFullName);
            System.out.println("Student Number: " + studentNumber);
            System.out.println("General Average: " + avgGrade);
            System.out.println("General Average Rounded: " + roundedAvgGrade);

            //Check if the grades is less than 75
            //if less than 75, 'failedSubjects' increments
            if (finalMathGrade < 75) failedSubjects++;
            if (finalEnglishGrade < 75) failedSubjects++;
            if (finalScienceGrade < 75) failedSubjects++;
            if (finalESPGrade < 75) failedSubjects++;
            if (finalMAPEHGrade < 75) failedSubjects++;
            if (finalFilipinoGrade < 75) failedSubjects++;
            if (finalAPGrade < 75) failedSubjects++;
            if (finalTLEGrade < 75) failedSubjects++;

            //Conditions to be executed
            //if 'failedSubjects' is 0 means there is no subjects that are less than 75
            if (failedSubjects == 0) {
                System.out.println("Remarks: Passed");
                if (roundedAvgGrade >= 98 && roundedAvgGrade <= 100) {
                    System.out.println("Awards: WITH HIGHEST HONOR");
                } else if (roundedAvgGrade >= 95 && roundedAvgGrade <= 97) {
                    System.out.println("Awards: WITH HIGH HONOR");
                } else if (roundedAvgGrade >= 90 && roundedAvgGrade <= 94) {
                    System.out.println("Awards: WITH HONOR");
                }

            }
            //if there is one or two subjects that are less than 75
            //this condition is executed
            else if (failedSubjects == 1 || failedSubjects == 2) {
                System.out.println("Remarks: Summer Class");
            }
            //if there is three or more subjects that are less than 75
            //this is executed
            else {
                System.out.println("Remarks: Repeat");
            }


            System.out.println("*****************************************************");
            //Ask if the user wants to check another student grades
            System.out.print("Would you like to check another student record? (y/n) or (Y/N): ");
            sc.nextLine();
            continueInput = sc.nextLine();
            //Empty the "studentFullName" for the next scanner
            studentFullName = "";
        } while (continueInput.equalsIgnoreCase("y") || continueInput.equalsIgnoreCase("Y"));

        sc.close();
    }
}