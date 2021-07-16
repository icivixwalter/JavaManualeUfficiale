package app.cap_01_panoramica;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

import java.util.Arrays;

public class Fibonacci {
    /**
     * sequenza fibonacci max 50
     * <p>
     * modiche MAX
     */
    private static final int MAX = 50;  //COSTANTE DENOMINATA = max valore di fibonacci
    private static final int MAX_INDEX = 9;  //COSTANTE DENOMINATA numero massimo di valori

    @Esercizio(nro = "1.3", pag = 6, descrizione = " aggiungere un titolo alla lista stampata per il programma fibonacci ")
    public static void main(String[] args) {
        System.out.println("FIBONACCI VERSIONE 1");
        System.out.println("----------------------------------------------------------------");
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci_01();

        System.out.println("\n\n");
        System.out.println("FIBONACCI VERSIONE 2 con for. I numeri pari sono contrassegnati con *");
        System.out.println("----------------------------------------------------------------");

        fibonacci.fibonacci_02();

        System.out.println("\n\n");
        System.out.println("FIBONACCI VERSIONE 3 al contrario. I numeri pari sono contrassegnati con *");
        System.out.println("----------------------------------------------------------------");

        fibonacci.fibonacciContrario();

        System.out.println("\n\n");
        System.out.println("FIBONACCI VERSIONE 4 con array. " +
                "\n1) ho creato un array che contiene MAX_INDEX ELEMENTI" +
                "\n2) ho copiato i numeri di fibonacci nell'array;" +
                "\n3) ho stampato l'intero contenuto dell'array alla fine (non durante il ciclo).");
        System.out.println("----------------------------------------------------------------");

        fibonacci.fibonacciArray();

        System.out.println("\n\n");
        System.out.println("FIBONACCI VERSIONE 5. con array di FibonacciValue. " +
                "\n1) ho creato un array che contiene MAX_INDEX FibonacciValue" +
                "\n2) ho copiato i numeri di fibonacci e se sono pari nei FibonacciValue dell'array;" +
                "\n3) ho stampato l'intero contenuto dell'array alla fine (non durante il ciclo).");
        System.out.println("----------------------------------------------------------------");
        fibonacci.fibonacciArrayDiClassi();
    }

    public void fibonacci_01() {
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        //SEQUENZA CON WHILE
        while (hi < MAX) {
            System.out.println(hi);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi

        }
    }

    /**
     * CICLO CHE SEGNA I NUMERI PARI DI FIBONACCI CON *
     */
    public void fibonacci_02() {
        long lo = 1;
        long hi = 1;

        //SEQUENZA CON IL CICLO FOR pag. 10
        String mark_s;

        for (int i = 2; i <= MAX_INDEX; i++) {
            if (hi % 2 == 0) {
                mark_s = " *";
            } else {
                mark_s = "";
            }
            System.out.println(i + ": " + hi + mark_s);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi
        }
    }

    /**
     * CICLO ALL'INDIETRO
     */
    @Esercizio(nro = "1.7", pag = 12, descrizione = "Modificare il ciclo per il conteggio all'indietro.")
    public void fibonacciContrario() {
        long lo = 1;
        long hi = 1;

        //SEQUENZA CON IL CICLO FOR pag. 10
        String mark_s;
        // con i-- conta all'indietro partendo da MAX_INDEX = 9 Fino a 2
        for (int i = MAX_INDEX; i >= 2; i--) {
            if (hi % 2 == 0) {
                mark_s = " *";
            } else {
                mark_s = "";
            }
            System.out.println(i + ": " + hi + mark_s);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi
        }
    }

    @Esercizio(nro = "1.9", pag = 20, descrizione = " Modificare l'algoritmo per fargli memorizzare in una array" +
            "la sequenza prodotta e mostrare solo alla fine la sequenza dei valori - UNICA STAMPA")
    public void fibonacciArray() {
        //crero ARRAY
        int[] risultati = new int[MAX_INDEX];

        int lo = 1;
        int hi = 1;
        risultati[0] = lo;
        int i = 1;
        //SEQUENZA CON WHILE
        while (hi < MAX) {
            //ATTENZIONE scrivere i++ significa : 1) prima utilizza l'indice 2) dopo incrementa di 1
            risultati[i++] = hi;

            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi

        }
        //stampo l'intero array
        System.out.println(Arrays.toString(risultati));
    }

    /**
     * CICLO CHE SEGNA I NUMERI PARI DI FIBONACCI CON *
     */
    @Esercizio(nro = "1.10", pag = 20, descrizione = "  Modificare l'algoritmo per fargli memorizzare in una array" +
            "la sequenza prodotta e mostrare solo alla fine la sequenza dei valori - UNICA STAMPA " +
            "+ creare una Classe con 2 campi 1) valore fibonacci 2) il bool per dire se pari o meno." +
            "Inoltre l'array deve utilizzare questa classe.")
    public void fibonacciArrayDiClassi() {
        //istanzio l'array di FibonacciValue che sono MAX_INDEX = 9
        FibonacciValue[] risultatiClassi = new FibonacciValue[MAX_INDEX];
        long lo = 1;
        long hi = 1;
        //inizializzo il PRIMO ELEMENTO DELL'ARRYA con LA CLASSE fibonacciValue
        risultatiClassi[0] = new FibonacciValue(lo, false);

        //CICLO FOR che istanza le rimanenti finbonacciValue dell'array
        //inserendo i due valori
        for (int i = 2; i <= MAX_INDEX; i++) {
            /*in questo ciclo istanzio gli altri elementi dell'array
             * utilizzo l'operatore == per passare al costruttore un boolean:
             *   Se il numero è PARI ALLORA hi%2 da come risultato 0;
             *   altrimenti da 1 e quindi è dispari
             *   hi % 2 questo modulo restituisce il RESTO DELLA DIVISIONE hi/2
             *   che puo essere o ZERO o UNO qundi PARI O DISPARI.
             * */
            risultatiClassi[i - 1] = new FibonacciValue(hi, hi % 2 == 0);
            /*
            // alternativa
            boolean isPari;
            if (hi % 2 == 0) {
                isPari = true;
            } else {
                isPari = false;
            }
            risultatiClassi[i-1]= new FibonacciValue(hi,isPari);
            System.out.println(i + ": " + hi + mark_s);

            // alternativa due
            boolean isPari = false;
            if (hi % 2 == 0) {
                isPari = true;
            }
            risultatiClassi[i-1]= new FibonacciValue(hi,isPari);
            */
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo

        }
        System.out.println(Arrays.toString(risultatiClassi));

    }


}
