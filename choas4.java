import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 1;
        int sum = 0;
        int userChoice = 1;

        for (int i = 0; i < 100; i++) {

            if (userChoice != -1) {

                System.out.println("Enter a new integer:");
                int number = input.nextInt();

                sum += number;

                double average = (double) sum / total;

                System.out.println("The running average is " + average);

                System.out.println("Enter -1 to stop:");
                userChoice = input.nextInt();

                total++;
            }
        }

    }
}
