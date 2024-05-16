package snacks.snackOne;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");

        int userNumber = Integer.parseInt(scanner.nextLine());

        if(userNumber % 2 == 0){
            System.out.println(userNumber);
        }else{
            System.out.println(userNumber +1);
        }
        scanner.close();
    }
}
