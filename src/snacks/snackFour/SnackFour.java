package snacks.snackFour;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola");
        String word = scanner.nextLine();
        String reverseWord = "";

        for (int i = (word.length()-1); i >= 0; i--){
           reverseWord += word.charAt(i);

        }

        String result = word.equals(reverseWord) ? "E' palindroma" : "non è palindroma";
        System.out.println(result);

        scanner.close();
    }
}
