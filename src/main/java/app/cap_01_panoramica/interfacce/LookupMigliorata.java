package app.cap_01_panoramica.interfacce;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

/**
 * INTERFACCIA LOOK UP MIGLIORATA
 * pag 29
 */
@Esercizio(nro = "1.15", pag = 29, descrizione = "01) Scrivere una interfaccia  che estenda Lookup" +
        "02) in modo tale da dichiarare  im metodi add() e remove()." +
        "03) Implementare questa interfaccia in una nuova classe. ")
public interface LookupMigliorata extends Lookup { //01) = LookupMigliorata extends Lookup  ---> estendo l'interfaccia
    //02) in modo tale da dichiarare  im metodi add() e remove().
    public void add(String nome, Object obj); // inserito 2 parametri perche si aggiunge il nome = chiave e l'oggetto = valore hashmap
    //public nei metodi dell'interfaccia è opzionale
    public Object remove(String nome); //per rimuovere basta la stringa chiave ma restituisce Object rimosso.


}
