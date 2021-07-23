package app.cap_01_panoramica.interfacce;

import java.util.Arrays;
import java.util.Objects;

/**
 * QUESTA CLASSE fa parte dell'esercizio 1.15
 * per evitare di copiare il codice da {@link SimpleLookup} la estendo con la parola chiave
 * extends
 */
public class SimpleLookupMigliorata extends SimpleLookup implements LookupMigliorata {
    //ha creato un costruttore necessario per estendere la classe
    public SimpleLookupMigliorata(String[] myNames, Object[] myValues) {
        super(myNames, myValues); // richiama il costruttore a 2 parametri di SimpleLookup
    }

    @Override
    public void add(String nome, Object obj) {
        // creiamo 2 nuovi array di dimensione aumentato di 1 rispetto a quello presente
        String[] myNames = new String[this.names.length + 1];
        Object[] myValues = new Object[this.values.length + 1];

        //POPOLARE L'ARRAY = copiare i contenuti dei precedenti array in questi con un ciclo for.
        for (int i = 0; i < this.names.length; i++) {
            myNames[i] = this.names[i];
            myValues[i] = this.values[i];
        }

        //aggiungo la nuova coppia come ultimo elemento degli array prendendo i valori dai parametri
        int ultimoIndice = myNames.length - 1;
        myNames[ultimoIndice] = nome;
        myValues[ultimoIndice] = obj;

        // visto che le due variabili myNames + myValues sono locali al metodo add
        // per aggiornare lo stato della classe devo copiare i valori di queste variabili nei campi della classe corrispondenti
        // Se ci si dimenticava, sarebbero rimasti gli array precedenti (con un valore in meno)
        this.names = myNames;
        this.values = myValues;
    }

    @Override
    public Object remove(String par_nome) {
        // 01) trovare il valore a partire dal nome usando il metodo find();
        Object oggetto = find(par_nome);
        if (oggetto == null)
            return null;

        // 02) eliminare dagli array l'elemento corrispondente al nome passato come parametro;
        for (int i = 0; i < this.names.length; i++) {
            // se ho trovato il nome nell'array = a quello del parametro
            if (par_nome.equals(this.names[i])) {
                //eliminare il nome dall'array
                this.names[i] = null;
            }
            if (oggetto.equals(this.values[i])) {
                this.values[i] = null;     //cancella i valore corispondente al nome
            }
        }

        // 03) creare nuovi array filtrando gli elementi not null (elimina i null)
        // 04) copiare gli array nei campi.
        //Arrays.stream(names).filter(Objects::nonNull) = filtro i nulli e li elimino
        //.toArray(String[]::new): trasforma lo stream di stringhe in un NUOVO array di stringhe e lo riassegna
        //al campo names
        names = Arrays.stream(names)            //trasforma l'array in stream (flusso di stringhe)
                .filter(Objects::nonNull)       //elimina i nulli
                .toArray(String[]::new);        //ritrasforma lo stream in una array inviandolo ---> a name
        //idem solo che sono Object
        values = Arrays.stream(values)
                .filter(Objects::nonNull)
                .toArray();

        // 05) restituire l'oggetto eliminato.
        return oggetto;
    }
}
