import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a name followed by a comma then the year you were born");
        System.out.println("For example: Dale,2001");
        System.out.println("An input of nothing will stop the program");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();
        ArrayList<Integer> listOfAges = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            if (userInput.length() > 0) {
                String[] splitUserInput = userInput.split(",");
                listOfNames.add(splitUserInput[0]);
                listOfAges.add(Integer.valueOf(splitUserInput[1]));
            }
        }
        int sum = 0;
        int count = 0;
        for (int e : listOfAges) {
            sum += e;
            count++;
        }
        int longestName = listOfNames.get(0).length();
        int longestNameIndex = 0;
        for (int i = 0; i < listOfNames.size(); i++) {
            if (longestName < listOfNames.get(i).length()) {
                longestNameIndex = i;
            }
        }

        System.out.println("Longest name: " + listOfNames.get(longestNameIndex));
        System.out.println("Average of the birth years: " + (double)sum/count);
    }
}