import java.util.Arrays;
import java.util.Scanner;

public class WordsFilter {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input words using comma: ");
        String userInput = scanner.nextLine();
        String[] splitInput = userInput.split(",");
        int input = 5;
        while (input != 0) {
            System.out.println("Choose a filter:");
            System.out.println("1 - Max length");
            System.out.println("2 - Starts with");
            System.out.println("3 - Ends with");
            System.out.println("4 - Contains");
            System.out.println("0 - Exit");
            input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1) {
                System.out.println("Please, provide a maximum length");
                int providedLength = scanner.nextInt();
                scanner.nextLine();
                String[] newArray = new String[splitInput.length + 1];
                int counter = 0;
                for (String s : splitInput) {
                    if (s.length() <= providedLength) {
                        newArray[counter] = s;
                        counter++;
                    }
                }
                System.out.println("Your list: " + Arrays.toString(newArray));
            } else if (input == 2) {
                System.out.println("Please provide a start letter");
                String providedLetter = scanner.nextLine();
                String[] newArray = new String[splitInput.length + 1];
                int counter = 0;
                for (String s : splitInput) {
                    if (s.startsWith(providedLetter)) {
                        newArray[counter] = s;
                        counter++;
                    }
                }
                System.out.println("Your list: " + Arrays.toString(newArray));
            } else if (input == 3) {
                System.out.println("Please, a letter the words should end with");
                String providedLetter = scanner.nextLine();
                String[] newArray = new String[splitInput.length + 1];
                int counter = 0;
                for (String s : splitInput) {
                    if (s.endsWith(providedLetter)) {
                        newArray[counter] = s;
                        counter++;
                    }
                }
                System.out.println("Your list: " + Arrays.toString(newArray));
            } else if (input == 4) {
                System.out.println("Please, provide a letter that should be contained");
                String providedLetter = scanner.nextLine();
                String[] newArray = new String[splitInput.length + 1];
                int counter = 0;
                for (String s : splitInput) {
                    if (s.contains(providedLetter)) {
                        newArray[counter] = s;
                        counter++;
                    }
                }
                System.out.println("Your list: " + Arrays.toString(newArray));
            } else if (input == 0){
                System.out.println("Program is finished!");
            } else {
                System.out.println("Wrong number provided!");
            }
        }
        System.out.println("Thank you!");
    }
}
