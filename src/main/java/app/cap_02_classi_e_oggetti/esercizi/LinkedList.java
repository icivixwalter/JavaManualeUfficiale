package app.cap_02_classi_e_oggetti.esercizi;

import app.cap_02_classi_e_oggetti.BankAccount;
import app.cap_02_classi_e_oggetti.Body;

/**
 * CLASSE LINKEDLIST PAG 42
 * cosi come è creata la classe LinckedList è generale quindi puo' ospitare qualsiasi oggetto
 * Object (Java) e in questo modo non contiene solo una lista di veicoli, ma anche altri oggetti
 * es. veicolo + persona ecc... il vantaggio di questa impostazione :
 * private Object myobj = permette di assegnare qualsiasi oggetto generale
 */
@Esercizio(nro = "2.2", pag = 42, descrizione = "Scrivere una classe LinkedList dotata" +
        "di un campo di tipo Object e di un riferimento al successivo elemento " +
        "LinkedList all'interno della lista")
public class LinkedList {
    //campo tipo object
    private Object myobj;

    //riferimento lista di tanti elementi collegati di cui ognuno punta al succesivo
    private LinkedList myLinkedListSuccessivo;  //rappresenta il collegamento di uno all'altro

    //metodo ToString per l'esercizio 2.5


    @Esercizio(nro = "2.8", pag = 52, descrizione = "Quali costruttori andrebbero aggiunti?")
    //-------------------------------------------------------------------------------------------
    //cosa inserisco di costrutore ?? = provo con genera costruttore automatico!
    //01 ho costruito un costruttore senza parametri = per rimanre compatibili con il codice
    //      gia presente nella main, infatti se avessi inserito direttamente un costruttore con
    //      parametri la main avrebbe creato errore, in quanto nella main viene utilizzato il
    //      COSTRUTTORE IMPLICITO senza parametri
    public LinkedList() {
    }

    //02 costtruttore II con parametri = 2 parametri Object + LinkedList in quanto si potra utilizzare
    //                              la classe al difuori della medesima con possibilita di specificare
    //                              sia l'oggetto e sia la lista successiva da collegare.
    public LinkedList(Object par_myobj, LinkedList par_myListaDaCollegare) {
        this.myobj = par_myobj;
        this.myLinkedListSuccessivo = par_myListaDaCollegare;
    }

    //-------------------------------------------------------------------------------------------


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(); // s= stringa modificabile
        LinkedList linkedListCorrente = this;
        //aggiungo alla Stringa VUOTA il veicolo 1
        s.append(linkedListCorrente.myobj).append(" => "); // veicolo 1 =>

        //con il ciclo while aggiungo i veicolo siccessivi
        while (linkedListCorrente.myLinkedListSuccessivo != null) {
            //s= viene riempita con il metodo toString dell'oggetto (ad esempio Veicolo)
            // aggiungo allo StringBuilder la rappresentazione in stringa dell'oggetto contenuto dalla LinkedList successiva
            s.append(linkedListCorrente.myLinkedListSuccessivo.myobj.toString()) // veicolo k =>
                    .append(" => ");
            linkedListCorrente = linkedListCorrente.myLinkedListSuccessivo;
        }

        // restituisco la stringa completa
        return s.toString();
    }

    //creo un METODO PRIVATO tipo void per l'esercizio 2.6 = UTILIZZO DI COSTRUTTORI IMPLICITI
    //                          ho creato static = per evitare di crare una variabile tipo
    //                          LinkedList.

    private static void usoDiCostruttoreSenzaArgomenti() {
             /*
        ATTENZIONE visto che non è stato creato il COSTRUTTORE DELLA CLASSE LinkedList con 2 parametri
        la classe LinkedList deve essere popolata a mano con i campi di seguito creati in questo modo:
        ....
        myLinkedList.myobj = veicolo1;
        myLinkedList2.myobj = veicolo2;
        myLinkedList3.myobj = veicolo3;
      -----------------------------------------------------------------------------------------------------------
         */

        //creare veicolo 1 e 2 + 3 .... oltre ad altri da creare!
        //01 ho creato 3 variabili oggetto veicolo
        var veicolo1 = new Veicolo();
        var veicolo2 = new Veicolo();
        var veicolo3 = new Veicolo();


        //02 CREO 3 oggetti LinkedList per fare una lista
        LinkedList myLinkedList = new LinkedList();
        LinkedList myLinkedList2 = new LinkedList();
        LinkedList myLinkedList3 = new LinkedList();


        //03 HO ASSOCIATO I 3 OGGETTI ALLA LISTA CORRISPONDENTE
        //inserire i veicoli nella lista LinkedList corrispondente
        //come inserisco i nodi? - LinkedList = sono i nodi, UN NODO
        //risolvo inserendo ogni veicolo nei Nodi 1,2,3
        myLinkedList.myobj = veicolo1;
        myLinkedList2.myobj = veicolo2;
        myLinkedList3.myobj = veicolo3;
        /*
        SBAGLIATO
        myLinkedList.myobj= veicolo2; // cos' sostituisci v1 con v2 non va bene
        myLinkedList.myobj= veicolo3;
         */

        //04 HO FATTO IL COLLEGAMENTO DEI NODI LINKEDLIST
        // SBAGLIATO COLLEGAMENTO : myLinkedList.myLinkedListSuccessivo = myLinkedList; // collegherebbe la lista1 a se stessa!!!!
        //collego myLinkedList (L1) (che rappresenta la Lista 1) alla lista 2 (L2)
        myLinkedList.myLinkedListSuccessivo = myLinkedList2; // L => L2
        //COLLEGO la lista L2 (myLinkedList2) alla L3 (myLinkedList3)
        myLinkedList2.myLinkedListSuccessivo = myLinkedList3; // L2 => L3

        //05 STAMPO la lista nro 1,2,3
        System.out.println(myLinkedList);   //per stampare tutto stampare la PRIMA perche contiene
        //perche li attraversa con il ciclo while in modo completo

        //il ciclo while non è completo perche parte dalla 2 o dalla terza
        System.out.println("\nfaccio una prova partendo da myLinkedList2 e myLinkedList3");

        System.out.println(myLinkedList2);  //ATTENZIONE stampa la 2 + 3 e salta la prima
        System.out.println(myLinkedList3);  //ATTENZIONE stampa 3 e salta la prima + la seconda

        //-----------------------------------------------------------------------------------------------------------

    }

    private static void usoDiCostruttoreConArgomenti() {
             /*
        ATTENZIONE visto che non è stato creato il COSTRUTTORE DELLA CLASSE LinkedList con 2 parametri
        la classe LinkedList deve essere popolata a mano con i campi di seguito creati in questo modo:
        ....
        myLinkedList.myobj = veicolo1;
        myLinkedList2.myobj = veicolo2;
        myLinkedList3.myobj = veicolo3;
      -----------------------------------------------------------------------------------------------------------
         */

        //creare veicolo 1 e 2 + 3 .... oltre ad altri da creare!
        //01 ho creato 3 variabili oggetto veicolo
        var veicolo1 = new Veicolo();
        var veicolo2 = new Veicolo();
        var veicolo3 = new Veicolo();


        //02 CREO 3 oggetti LinkedList per fare una lista = sono invertiti perche
        //              perche le variabili devono essere definite dalle 3 alla 1 altrimenti errore.
        LinkedList myLinkedList3 = new LinkedList(veicolo3, null);
        LinkedList myLinkedList2 = new LinkedList(veicolo2, myLinkedList3);
        LinkedList myLinkedList = new LinkedList(veicolo1, myLinkedList2);

        //05 STAMPO la lista nro 1,2,3
        System.out.println(myLinkedList);   //per stampare tutto stampare la PRIMA perche contiene
        //perche li attraversa con il ciclo while in modo completo
    }

    private static void usoDiOggettiDiversi() {
             /*
        ATTENZIONE visto che non è stato creato il COSTRUTTORE DELLA CLASSE LinkedList con 2 parametri
        la classe LinkedList deve essere popolata a mano con i campi di seguito creati in questo modo:
        ....
        myLinkedList.myobj = veicolo1;
        myLinkedList2.myobj = veicolo2;
        myLinkedList3.myobj = veicolo3;
      -----------------------------------------------------------------------------------------------------------
         */

        //creare veicolo 1 e 2 + 3 .... oltre ad altri da creare!
        //01 ho creato 3 variabili oggetto veicolo
        var veicolo1 = new Veicolo();
        var bankAccount = new BankAccount(235563, 33);
        var body = new Body();


        //02 CREO 3 oggetti LinkedList per fare una lista = sono invertiti perche
        //              perche le variabili devono essere definite dalle 3 alla 1 altrimenti errore.
        LinkedList myLinkedList3 = new LinkedList(body, null);
        LinkedList myLinkedList2 = new LinkedList(bankAccount, myLinkedList3);
        LinkedList myLinkedList = new LinkedList(veicolo1, myLinkedList2);

        //05 STAMPO la lista nro 1,2,3
        System.out.println(myLinkedList);   //per stampare tutto stampare la PRIMA perche contiene
        //perche li attraversa con il ciclo while in modo completo
    }


    //main
    @Esercizio(nro = "2.5", pag = 48, descrizione = "Scrivere un metodo main per la classe LinkedList" +
            "che crei un certo numero di oggetti Vehicle e li posizioni all'interno di nodi " +
            "consecutivi della lista.")
    public static void main(String[] args) {
        //grazie a static posso invocare il metodo diretto senza variabile qualificante
        System.out.println("--------------------------------------------------------------------");
        System.out.println("I COSTRUTTORE : -> usoDiCostruttoreSenzaArgomenti()\n");
        usoDiCostruttoreSenzaArgomenti();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("II COSTRUTTORE : -> usoDiCostruttoreConArgomenti\n");
        usoDiCostruttoreConArgomenti();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("III COSTRUTTORE : MA CON OGGETTI DIVERSI: " +
                "veicolo + bank + body   -> usoDiOggettiDiversi() \n");

        usoDiOggettiDiversi();

    }
}
