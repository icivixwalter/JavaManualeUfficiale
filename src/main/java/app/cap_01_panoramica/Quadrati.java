package app.cap_01_panoramica;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

/**
 * TABELLA DI QUADRATI
 * stampo il numero ed il suo quadrato
 */
@Esercizio(nro = "1.4", pag= 6)
public class Quadrati {
    private static final String TITOLO_S = "TABELLA DEI QUADRATI\nn\t|\tn*n\n-------------------------------";
    @Esercizio(nro = "1.6", pag = 8, descrizione = "Aggiungere una costante denominata al posto della stringa del titolo.")
    public static void main(String[] args) {
        System.out.println(TITOLO_S);
        for (int i = 1; i<=10;i++){
            //stampare il numero + il quadrato
            System.out.printf("%d\t|\t%d \n",i, i*i);
        }
    }
}
