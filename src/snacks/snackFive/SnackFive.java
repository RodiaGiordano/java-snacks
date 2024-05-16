package snacks.snackFive;

import java.util.Scanner;

public class SnackFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci una qualsiasi sequenza di caratteri");

        String userSequence = scanner.nextLine();
        char[] sequence = userSequence.toCharArray();
        int numbers = 0;
        int characters = 0;
        int symbols = 0;

        for(int i = 0; i < sequence.length; i++){

            if(Character.isAlphabetic(sequence[i]) ){
                characters++;
            }else if(Character.isDigit(sequence[i])){
                numbers++;
            }else{
                symbols++;
            }
        }

        System.out.println("numero di simboli: " + symbols);
        System.out.println("numero di numeri: " + numbers);
        System.out.println("numero di caratteri: " + characters);

        scanner.close();
    }
}
