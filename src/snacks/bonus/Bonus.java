package snacks.bonus;

public class Bonus {
    public static void main(String[] args){

        String numbString = "8034";
        int numbParsed = 0;

        for(int i = 0; i < numbString.length(); i++){
            int character = numbString.charAt(i);

            if(character >= 48 && character <= 57){
                numbParsed = numbParsed * 10 + (character - 48);
            }
        }

        // numbParsed è inizializzato a 0, moltiplicandolo x 0 aggiungo il character (l'intero corrispondente al numero corrente)
        // assicurandomi quindi che il primo carattere corrisponderà nel primo ciclo ad un numero ad una cifra.
        // character al primo ciclo + 56, se sottraggo 48 (numero 0) ottengo 8, nella seconda iterazione 48-48 fa 0 e osì via
        // moltiplicare * 10 assicura che ad ogni iterazione c'è un incremento l'unità di misura,decine,centinaia etc..
        // in sostanza ogni iterazione aumenta l'unità di misura moltiplicando il primo valore della stringa e somma il valore successivo
        // garantendo che la stringa venga correttamente rappresentata in int
        System.out.println(numbParsed);
    }
}
