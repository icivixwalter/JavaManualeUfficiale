package app.cap_04_interfacce;

/**
 * CLASSE OUTER
 * creata per es. ESTENSIONE DELLE CLASSI INTERNE pag. 135
 * CLASSE CONTENITORE OUTER con innestata la classe Inner
 */
public class Outer {
    //inseriti come esempio di adombramento di pag 137
    void print(){}  //print di Outer senza parametri
    void print(int val){}


    /**
* CLASSE INNER creata per il paragrafo 5.2.2. pag 135 a
*/
// I classe innestata Inner
  class Inner{
        //inseriti come esempio di adombramento di pag 137
        void print(){}  //questo metodo adobra quello della classe Outer (contenitrice)
        void show (){}


        //COSTRUTTORE DI INNER VUOTO
            public Inner() {
                print ();
                Outer.this.print(); //ADOMBRA tutte le forme di Outer.print pag 137
               // print(1);   scorretto non esiste Inner.print(int)

            }
    }
}


//I CLASSE ESTERNA che estende Outer PAG 135
class ExtendedOuter extends Outer {
    // II CLASSE innestata Inner = il costruttore di Inner richiede un Oggetto di tipo Outer
    // cui correlarsi e quindi rappresentato in modo implicito con l'oggetto ExtendedOuter pag. 135
    class ExtendedInner extends Inner {
    }

    /* USO DEI COSTRUTTORI NO-ARG IMPLICITI:
     ExtendedInner ---> Inner = CHE VIENE INVOCATO  con super e quindi con
     un riferimento esplicito a un oggetto Other

     ExtendedInner---> Inner ----> Outer
    creo un variabile oggetto di tipo ExtendedInner e tali istanza
    sfrutta il costruttore IMPLICITO no-arg pag 135 utilizzando super.
    ExtendedInner invoca a sua volta il costruttore no-arg di Inner
     */
    Inner ref = new ExtendedInner(); // il campo ref viene inizializzato quando  viene
    // creato l'oggetto ExtendedOuter

}

