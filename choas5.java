import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = input.nextLine();

        for (int position = 0; position < word.length(); position += 2) {

            System.out.println(word.charAt(position));

        }


    }
}
