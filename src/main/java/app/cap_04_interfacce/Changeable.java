package app.cap_04_interfacce;

/**
 * INTEFACCIA Changeable
 * costruita per il par. 5.6 Innesto delle interfacce
 * SCOPO DELL'INNESTO DELLA CLASSE NELL'INTERFACCIA
 * 1) USO
 * è quello di permettere all'interfaccia di restituire con
 * un metodo dell'interfaccia
 * piu valori in uscita. pag. 144
 * in questo caso restituisce con un metodo 2 valori:
 * - oggetto che ha fatto le modifiche
 * - la stringa che descrive l'oggetto
 * 2) USO
 *  Definire una implementazione di default (parziale o completa)
 *  per la intefaccia.
 *
 *  Quindi UNA CLASSE che implementi questa interfaccia potrebbe
 *  scegliere :
 *      a) di estendere la classe innestata (Record) di implementazione
 *      di default
 *      b) reindirizza le invocazioni dei metodi verso l'istanza di
 *      questa classe innesta (Record) pag. 144.
 *
 */
public interface Changeable {
    //innesto una classe Record pag 144 che ha un comportamendo di
    //default come restituire l'oggetto della modifica + la descrizione in stringa dell'oggetto
    class Record {
        public Object changer;      //oggetto della modifica
        public String changerDesc;  //Stringa che la descrive
    }

    /*metodo per la restituzione di un oggetto Changeable.Record
    contenente l'oggetto che ha effettuato la modifica + la stringa
    che la descrive
     */
    Record getLastChange();     //restituisce un oggetto Changeable con piu valori con un metodo solo.
}
