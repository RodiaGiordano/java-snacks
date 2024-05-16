package snacks.snackFour;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una parola");
        String word = scanner.nextLine();
        String result = "la parola è palindroma";

        int j = word.length() -1;
      /*  for (int i = (word.length()-1); i >= 0; i--){
           reverseWord += word.charAt(i);

        }*/
        for(int i = 0; i < word.length(); i++, j--){
            if(word.charAt(i) != word.charAt(j)){
                result = "la parola non è palindroma";
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
