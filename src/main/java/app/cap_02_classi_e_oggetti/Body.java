package app.cap_02_classi_e_oggetti;

import java.util.Arrays;

/**
 * CLASSE BODY (corpo celeste)
 * pag 40 moditicata cosi alla pag 49
 */
public class Body {
    //da pag 65 tutti i body vengon trasformati da publica a privati
    private String name = "<unamed>";
    private long idNum;
    private Body orbits = null;
    private static long nextID = 0;

    /*
    * UTILITA DEL blocco di inizializzazione
    * esempio di blocco di inizializzazione pag 52 in questo modo nextID viene incrementato
    * e assegnato ai idNum ogni volta che sia chiama costruttore di questa classe,
    * SENZA questo blocco era necessario ripertere la riga in ogni costruttore.
    */
    {
        this.idNum = nextID++;
    }

    //VARI COSTRUTTORI
    //------------------------------------------------------------------------------------------------//
    //costruttore SENZA ARGOMENTI = no-arg
    Body() {
        //il costruttore assegna un idNum valido all'oggetto appena creato
        // idNum = nextID++;  non serve perchè nel blocco di inizializzazione, vedi sopra.
    }

    //COSTRUTTORE CON 1 ARGOMENTO
    //todo: II COSTRUTTORE A DUE ARGOMENTI ?? altro esempio di invocazione del costruttore ?? pag 50 ??
    //todo costruttore 1 argomento oggetto Body che non orbita nulla pag 50
    Body(String bodyName) {
        this(bodyName, null);  //todo: rende nullo il parametro passato ???
    }

    //todo: costruttore copia pag 51
    Body(Body other) {
        this.idNum = other.idNum;
        this.name = other.name;
        this.orbits = other.orbits;
    }
    //costruttore con 2 ARGOMENTI
    Body(String bodyName, Body orbitsAround) {
        //this () chiama il costruttore senza argomenti
        // this(); adesso è inutile perchè IdNum si aggiorna nel blocco di inizializzazione
        this.name = bodyName;
        this.orbits = orbitsAround;
    }


    //VARI COSTRUTTORI *** FINE *
    //------------------------------------------------------------------------------------------------//

    /**
     * pag 58 PARAMETRO SOTTO FORMA DI SEQUENZA
     * crea un array di tipo con i tre puntini .... = (Body ... bodies)
     *
     * @param bodies todo: parametro in sequenza arieta variabile
     */
    public void setOrbiters(Body... bodies) {
        //memorizza i valori dento un array di Body ......??? pag 58???
        for (Body body : bodies) {

        }
    }

    /** METODO TO STRING
     *
     */
    public String toString() {

        String desc = idNum + " (" + name + ")";
        if (orbits != null)
            desc += " orbits " + orbits.toString();
        return desc;
    }

    /* metodi agginti = vedi pag 64
     * non erano stati inseriti i seguenti metodi:
     * getID + getName + setName + getOrbits + setOrbits
     */
        public long getID(){return idNum;}
        //get e set Name
        public String getName(){return name;}
        public void setName(String newName){
            name= newName;
        }
        //get e set Orbits
        public Body getOrbits(){return orbits;}
        public void setOrbits(Body orbitsAround){
            orbits= orbitsAround;
        }
        /* AGGIUNTO PAG 65 = controllo oggetti a livello di classe
         il codice è in grado di accedere al campo privato orbits e anche
         a tutti i campi della classe di tutti gli oggetti della classe (pag 65)
         */

        public void capture (Body victim){
            victim.orbits = this;
        }


    //MAIN
    public static void main(String[] args) {
        //todo: inizializzatori sono questi ?? pag 49
        Body sun = new Body();      //idNum = 0               (membro o campo)
        sun.name = "Sol";           //assegna quello precedente
        Body earth = new Body();      //idNum = 1
        earth.name = "Earth";
        earth.orbits = sun;

        //todo: pag 50 codice che segue l'allocazione è giusto?? pechè fuori graffe non da errore???
        Body sun2 = new Body("Sol", null);
        Body earth2 = new Body("Earth", sun);
        /*
            CHIAMO IL METODO PARAMETRO SOTTOFORMA DI SEQUENZA
         */
        // todo: CHIAMA IL METODO parametro in sequenza arieta variabile pag 58 modificato ??
        //
        Body sun3 = new Body("Sol", null);
        Body earth3 = new Body("Earth", sun3);
        Body moon3 = new Body("Moon", earth3);
        Body mars3 = new Body("Mars", sun3);
        Body phobos3 = new Body("Phobos", mars3);
        Body deimos3 = new Body("Deimos", mars3);

        //TODO: GIUSTO ?? chiama il metodo e crea un arrya con 1 punto e il II con due Body???
        earth2.setOrbiters(moon3);
        mars3.setOrbiters(phobos3, deimos3);
        //todo: ricontrallare con giacomo
        //PER EVITARE DI CREARE ARRAY a lunghezza zero si puo chiamare direttamente l'array pag 59
        Body[] marsMoons = {phobos3, deimos3};
        mars3.setOrbiters(marsMoons);

        //stampa i pianeti utilizzanto toString per rappresentare la stringa formattata della istanza della classe
        System.out.println("\n\n");
        System.out.println("Stampe tramite toString");
        System.out.println(sun3);
        System.out.println(earth3);
        System.out.println(moon3);
        System.out.println(mars3);
        System.out.println(phobos3);
        System.out.println(deimos3);

        System.out.println(" \n\n");
        System.out.println("Stampe l'array tramite toString ");
        //stampa di prova l'array pag 59
        System.out.println(Arrays.toString(marsMoons));



    }//public static void main(String[] args) {

} //public class Body {
