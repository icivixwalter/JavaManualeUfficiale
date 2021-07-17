package app.cap_03_estensione_classi;

/**
 * CLASSE ATTRIBUTO
 * pag. 75
 * non estende nessuna classe ma estende comunque ed implicitamenteù
 * la classe Object inoltre dichiara metodi che sono implementati da
 * tutti gli oggetti come il metodo toString inoltre le variabili Object
 * che possono riferirsi a qualunque oggetto tipo una istanza di classe
 * o un array.
 * La classe estende la nozione di ATTRIBUTO, in modo che puo essere utilizzata
 * per memorizzare i colori (che possono essere inseriti in una tabella come ad
 * es.  nomi di stringe colore rosso ecc. oppure dei valori numerici dei colori)
 * Per fare cio viene estesa la classe Attr per creare un'altra classe dal nome
 * ColorAttr che supporti un metodo che possa restituire un oggetto ScreeColor
 * <p>
 * (pag 75)
 */
public class Attr {
    /* Il nome è immutabile perchè è FINAL pag 75
     e può essere utilizzato come chiave in una tabella hash o
     in una lista ordinata.
     */
    private final String name;
    private Object value = null;

    //I Costruttore con 1 param
    public Attr(String name) {
        this.name = name;
    }

    /* II Costruttore con 2 param
    pag 75 gli oggetti attributo possono avere qualsiasi valore  che viene
    memorizzato nella variabile di tipo Object
     */
    public Attr(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    //get e set per  le variabili private
    //--------------------------------------------------------------------//
    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(Object newValue) {
        Object oldVal = value;
        value = newValue;
        return oldVal;
    }

    public String toString() {
        return name + "=" + value + "";
    }
    //--------------------------------------------------------------------//
}
