package app.cap_01_panoramica.generics;

/**
 * CLASSE LOOKUP che restituisce un tito T = generico
 * non è una classe generica ma implementa un  una
 * INTERFACCIA GENERICA fornendo un tipo concreto cioè un Integer al posto
 * di un parametro T astratto.
 * Il METODO find restituisce un oggetto Integer
 */
//la classe CintegerLooUp implementa la interfaccia IntegerLookUp e gli fornisce il tipo <Integer>
public class IntegerLookup implements IGenericLookup<Integer> {
    private String[] names;  //questa classe memorizza un array di String
    private Integer[] values;  //questa classe memorizza un array di integer

    /**
     * COSTRUTTORE UNICO
     * costruttore con parametri necessario per inizializzare i campi
     */
    public IntegerLookup(String[] par_names, Integer[] par_values) {
        this.names = par_names;
        this.values = par_values;
    }


    /**
     * MENTODO FIND
     * questa metodo cerca i nome dato in input nel array di nomi di questa classe
     * e restituisce il valore corrispondente
     */

    public Integer find(String name) {
        // names.length = lunghezza dell'array dipende dall'array passato al costruttore.
        // ad esempio la lunghezza di questo array e' 2 {"One", "two"} vedi nel main
        for (int i = 0; i < names.length; i++) {
            //se names i = name
            if (names[i].equals(name))
                //ritorna il valore intero corripondente all'indice i
                return values[i];
        }
        System.out.println("Non ho trovato nessun nome: " + name);
        return null;//non trovato
    }

    public static void main(String[] args) {

        //2 ARRAY  lunghi 2 posizioni. (e sono in coppia)
        // aggiungo le coppie di nome e valore separati in due array (perchè a pag 30 non lo spiega.)
        String[] names = {"One", "two"};
        Integer[] values = {1, 2};

        //PRIMA PROVA FIND trova tutto con array a 2
        //Istanzioto la classe Generic... con i nomi e valori in coppia  con due array
        IGenericLookup<Integer> l = new IntegerLookup(names, values);
        //eseguo il metodo processValues della classe Processor  per provare il metodo find.
        Processor myProcessor = new Processor();
        myProcessor.processValues(names, l);

        System.out.println("--------------------------------------------------\n\n");
        System.out.println("II PROVA FIND");

        //MODIFICA
        //SECONDA PROVA FIND
        String[] names2 = {"Primo", "Secondo", "Terzo", "Quarto"};
        Integer[] values2 = {1, 2, 3, 4};
        IGenericLookup<Integer> l2 = new IntegerLookup(names2, values2);
        myProcessor.processValues(names2, l2);


    }

}
