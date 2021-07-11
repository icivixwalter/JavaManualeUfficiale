package app.cap_02_classi_e_oggetti;

/**
 * CLASSE BODY PRINT PAG 54 - I METODI
 */
public class BodyPrint {

    /*
        TODO: metodo invocato da errore ?? pag 56
    public String toString() {
        String desc = idNum + " (" + name + ")";
        if (orbits != null)
            desc += " orbits " + obits.toString();
        return desc;
    }
    */
    //Intestazione del metodo
    public static void main(String[] args) {
        Body sun = new Body("Sol", null);
        Body earth = new Body("Earth", sun);
        /*
        todo: da errore ??
        System.out.println("Body"+earth.name +
                "orbits" + earth.orbits.name +
                "and ah ID " +earth.idNum);

         */
    }

}//*** FINE public class BodyPrint {
