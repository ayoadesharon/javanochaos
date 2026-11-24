import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        String word = "";

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
            } else {
                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word);

    }
}
