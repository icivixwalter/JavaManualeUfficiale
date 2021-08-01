package app.cap_04_interfacce;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * CLASSE INTERNE ANOMINE
 * è stata creata per controllare l'esecuzione del
 * metodo Iterator dove le CLASSI INTERNE possono ADOMBRARE
 * LE VARIABILI LOCALI o i campi o i metodi d'istanza pag 139
 * CONCLUSIONE = i membri appartenenti alla CLASSI LOCALI possono
 * adombrare le variabili locali ed i parametri con il RISCHIO che una
 * volta che un PARAMETRO o un VARIABILE LOCALE sono STATI ADOMBRATI
 * DIVENTA IMPOSSIBILE FARVI RIFERIMENTO pag 139.
 */
public class ClasseInterneAnonime {

    /*Creo un metodo Iterator pag 139
     * LA CLASSE ITER è locale al METODO  walkTrough CHE non è UN MEMBRO DELLA CLASSE CONTENITRICE
     */

    public static Iterator<Object> walkTrough(final Object[] objs) {

        /* CREO LA CLASSE LOCALE ITER con i membri della classe locale
          ed ha accesso a tutte le variabili FINAL del metodo ed in particolare
          al parametro objs
         */
        class Iter implements Iterator<Object> {
            //campo = utile per tener traccia del punto raggiunto all'interno dell'array.
            private int pos = 0;

            //metodo
            public boolean hasNext() {
                return (pos < objs.length);
            }

            public Object next() throws NoSuchElementException {
                if (pos >= objs.length)
                    throw new NoSuchElementException();
                return objs[pos++];
            }
            /*
             Attenzione il metodo remove con java 8 .... non è necessario perche
            l'interfaccia Iterator di Java contiene il metodo REMOVE di default e quindi
            è opzionale implementarlo nelle classi per richiamarlo puoi fare cosi
            Iter().remove(); e con la parola new istanzianzo un campo. Ma qui viene
            SEGUITO L'ESEMPIO DEL LIBRO a pag 139 che prevede l'apposito metodo remove
            */
            public void remove (){
                throw new UnsupportedOperationException();
            }
        }


        return new Iter();
    }
}