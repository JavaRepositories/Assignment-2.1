import java.util.Scanner;

/*
    This class is designed to accept a double from the user and determine
    if that double is a valid grade. This will trigger a logical else-if structure
    that will determine the letter grade needed. It will only accept
    non-zero numbers.
 */
public class Driver {

    public static void main(String[] args) {
        double percentGrade;
        String letterGrade = null;
        System.out.print("Enter a grade percentage: ");

        // Looping input till valid
        while(true) {
            // Re-making scanner each time for new console input
            Scanner scanner = new Scanner(System.in);

            // Seeing if there is a valid double while looping through cache
            if(scanner.hasNextDouble() && scanner.hasNext()) {
                // Getting the next double
                percentGrade = scanner.nextDouble();

                // Using condensed structure to save space on long logic. Still easily readable
                if(percentGrade >= 93) letterGrade = "A";
                else if(percentGrade >= 90) letterGrade = "A-";
                else if(percentGrade >= 87) letterGrade = "B+";
                else if(percentGrade >= 84) letterGrade = "B";
                else if(percentGrade >= 80) letterGrade = "B-";
                else if(percentGrade >= 77) letterGrade = "C+";
                else if(percentGrade >= 74) letterGrade = "C";
                else if(percentGrade >= 70) letterGrade = "C-";
                else if(percentGrade >= 67) letterGrade = "D";
                else if(percentGrade >= 0) letterGrade = "F";
                else System.out.print("You must supply a positive percentage!\nRetry: ");

                // Stop loop if we have a letter grade from logic
                if(letterGrade != null) break;
            } else {
                System.out.print("You must supply a double for a grade!\nRetry: ");
            }
        }
        System.out.println("Your grade is " + percentGrade + "% (" + letterGrade + ")");
    }
}