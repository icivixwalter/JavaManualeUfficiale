package app.cap_02_classi_e_oggetti;

/**
 * CLASSE PRIMES
 * es. Inizializzazione statica
 */

public class Primes {
    //inizializza un array di numeri primi di 5 indici;
    static int[] knownPrimes = new int[4];


    //blocco di inizializzazione statica
    static {
        knownPrimes[0] = 2;
        for (int i = 1; i < knownPrimes.length; i++) {
            //TODO : DA ERRORE??
            //knownPrimes[i] = nextPrime();
        }
    }


    public static void main(String[] args) {
        //todo: dichiarazione nextPrime ma va bene ?? .....
        int nextPrime=0;

        System.out.println("nextPrime = " + nextPrime);

    }



}

