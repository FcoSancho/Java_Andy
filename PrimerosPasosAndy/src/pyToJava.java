import java.util.Scanner;

public class pyToJava {
    public static void main(String[] args) {
        System.out.println("I will try to guess whatever text you want, just insert some text to start.");

        Scanner guessTextScanner = new Scanner(System.in);
        String guessText = guessTextScanner.nextLine();

        int attempts = 0;
        String CPUGuess = "";
        boolean notGuessed = true;

        while (notGuessed) {
            if (CPUGuess.length() < guessText.length()) {
                CPUGuess = CPUGuess + Character.toString((char)(((int)((Math.random() * 95)) + 32)));
            } else if (CPUGuess.length() >= guessText.length()) {
                attempts++;
                if (CPUGuess.equals(guessText)) {
                    System.out.println("It took me " + attempts + " attempt(s) to guess that you wrote \"" + guessText + "\".");
                    notGuessed = false;
                } else if (!CPUGuess.equals(guessText)) {
                    CPUGuess = "";
                }
            }
        }
    }
}