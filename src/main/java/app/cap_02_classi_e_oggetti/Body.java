package app.cap_02_classi_e_oggetti;

/**
 * CLASSE BODY (corpo celeste)
 * pag 40 moditicata cosi alla pag 49
 */
public class Body {
    public long idNum;
    public String name = "<unamed>";
    public Body orbits = null;
    private static long nextID = 0;

    //VARI COSTRUTTORI
    //------------------------------------------------------------------------------------------------//
    //costruttore SENZA ARGOMENTI
    Body() {
        //il costruttore assegna un idNum valido all'oggetto appena creato
        idNum = nextID++;
    }

    //COSTRUTTORE CON 1 ARGOMENTO
    //todo: II COSTRUTTORE A DUE ARGOMENTI ?? altro esempio di invocazione del costruttore ?? pag 50 ??
    //todo costruttore 1 argomento oggetto Body che non orbita nulla pag 50
    Body(String bodyName){
        this(bodyName, null);  //todo: rende nullo il parametro passato ???
    }

    //todo: costruttore copia pag 51
    Body(Body other){
        idNum= other.idNum;
        name= other.name;
        orbits= other.orbits;
    }

    Body(String bodyName, Body orbitsAround){
        //todo: this cosa è ???;
        this();
        name=bodyName;
        orbitsAround= orbitsAround;
    }

    //VARI COSTRUTTORI *** FINE *
    //------------------------------------------------------------------------------------------------//

    public static void main(String[] args) {
        //todo: inizializzatori sono questi ?? pag 49
        Body sun = new Body();      //idNum = 0
        sun.name = "Sol";           //assegna quello precedente
        Body earth = new Body();      //idNum = 1
        earth.name="Earth";
        earth.orbits=sun;

        //todo: pag 50 codice che segue l'allocazione è giusto?? pechè fuori graffe non da errore???
        Body sun2 = new Body("Sol",null);

        Body earth2= new Body("Earth",sun);

    }//public static void main(String[] args) {

} //public class Body {
