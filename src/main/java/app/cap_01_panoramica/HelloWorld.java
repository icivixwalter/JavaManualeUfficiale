package app.cap_01_panoramica;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

@Esercizio(nro = "1.5", pag = 8, descrizione = "Aggiungere una costante denominata al posto della stringa.")
public class HelloWorld {
    //per renderla costante applicare static + final
    private static final String COSTANTE_S = "Hello world";

    public static void main(String[] args) {
        System.out.println(COSTANTE_S);
    }
}
