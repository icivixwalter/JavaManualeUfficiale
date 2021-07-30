package app.cap_04_interfacce;

import app.cap_03_estensione_classi.Attr;

import java.util.*;


/**
 * CLASSE ATTRIBUTED IMP 1
 * PAG 124
 * tale classe utilizza LE CLASSI DI UTILITA = java.until.HashMap
 * e quindi utilizza una Hasmap
 * ATTENZIONE vengono impletate 2 interfacce Attributed, Iterable <Attr> = itera solo su vari
 * elementi Attr
 */
public class AttributedImp1 implements Attributed, Iterable<Attr> {
    /*attrTable= campo MAP (hasmap) String = chiave -> Attr = è un valore es. Walter, 3 + Giacomo, 5
    CREA un nuovo oggetto HashMap in grado di memoerizzare attributi ed utilizza un metodo hashCode
    dell'oggetto preso come chiave per indicizzare quest'ultimo. Non viene fornito nessun metodo di hash
    in quanto la classe String fornisce già una implementazione del metodo HashCode.
     */
    protected Map<String, Attr> attrTable = new HashMap<String, Attr>();

    /*metodo add di Attributed
    Viene aggiunto un nuovo attributo, e l'oggetto Attr viene memorizzato all'interno della mappa hash
    in corrispondenza del proprio nome e quindi individuare o eliminare attributi viene FATTO IN BASE
    AL NOME.
     */

    public void add(Attr newAttr) {
        attrTable.put(newAttr.getName(), newAttr);
    }

    //metodo find di Attributed
    public Attr find (String name) {
        return attrTable.get(name);
    }


    //metodo remove di Attributed
    public Attr remove(String name) {
        return attrTable.remove(name);
    }

    /*METODO attrs di Attributed
    E' stata implementata  Iterable<Attr> perchè la classe contiene solo attributi
    ed è stato necessario definire un nuovo metodo .iterator per restituire lo stesso
    */
    public Iterator <Attr> attrs () {
        return attrTable.values().iterator();
    }
    //METODO della Interfaccia Iterable che richiama quello sopra attrs
    public Iterator <Attr>  iterator () {
        return attrs();
    }


}

