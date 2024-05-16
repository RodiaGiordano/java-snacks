package snacks.snackTwo;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args){

        String[] names = {"Giorgio", "Luigi", "Federico", "Maria", "Alessandra"};
        String[] lastNames = {"Rossi", "Bianchi", "Verdi", "Rodia", "Smith"};

        String[] falseList = new String[names.length];
        Random random = new Random();
        for (int i = 0; i < falseList.length; i++){

            int randomNameIndex = random.nextInt(falseList.length);
            int randomLastNameIndex = random.nextInt(falseList.length);

            falseList[i] = names[randomNameIndex] + " " + lastNames[randomLastNameIndex];

            System.out.println(falseList[i]);
        }

    }
}
