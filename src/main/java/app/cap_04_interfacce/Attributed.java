package app.cap_04_interfacce;
import app.cap_03_estensione_classi.Attr;

import java.util.Iterator;

/**
 * INTERFACCIA ATTRIBUTED = definisce un TIPO COLLEZIONE  (UN INSIEME DI ATTRIBUTI)
 * utilizzando il meccanismo di accesso alla collezione di .Iterator che ha il vataggio
 * di
 * pag 122 cap 4.4
 * Al posto di creare una superclasse per tutti gli oggetti attributi
 * viene creata UNA INTERFACCIA con 4 metodi
 * 1) aggiungere un nuovo attributo ad un Oggetto e questo oggetto
 *      diventa proprietario dell'istanza Attr;
 * 2) find attributo se è stato inserito nell'oggetto (pag 123)
 * 3) elimina un attributo;
 * 4) accedi a tutti gli attributi associati all'oggetto;
 * ACCESSO ATRIBUTI = si puo accedere agli attributi  in un oggetto Iterator restituito dal metodo
 * attrs. Iterator è una itefaccia generica definita con java.util usata dalle CLASSI COLLEZIONE
 * (collection clasesse) allo scopo di fornire aaccesso  ai loro contenuti quindi Attributes è una
 * INTERFACCIA che definisce  UN TIPO DI COLLEZIONE e quindi posso iterare in Attributed con Iterator e
 * cioè una classe di collezione di tipo standard..
 */
public interface Attributed {
    //1) metodo Aggiungi attributo = e quando viene aggiunto all'oggetto  tale
    //oggetto è il proprietario dell'istanza di Attr fino alla sua rimozione.
    //todo: da errore ma ho risulto con import app.cap_03_estensione_classi.Attr;
     void add (Attr newAttr);
     //2) find attributo se è stato inserito nell'oggetto (pag 123)
     Attr find (String attrName);
     //3) elimina un attributo dall'oggetto;
     Attr remove (String attrName);

     //4) accedi a tutti gli attributi associati all'oggetto;
    // accedi agli attributi attraverso L'OGGETTO ITERATOR  che viene restituitto
    //dal metodo attrs; Iterator è una interfaccia generica usata dalle
    //classi collection class per fornire accesso ai loro contenuti.
    Iterator<Attr> attrs();

}
