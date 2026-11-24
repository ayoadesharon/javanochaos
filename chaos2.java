import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.nextLine().toLowerCase();

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowel++;
            }
            else if (letter >= 'a' && letter <= 'z') {
                consonant++;
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

    }
}
