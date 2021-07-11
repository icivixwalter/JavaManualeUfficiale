package app.cap_02_classi_e_oggetti;

/**
 * CLASSE PASSA L'OGGETTO come copia del vlore del suo riferimento pag 61
 */
public class PassRef {


    //METODI
    //Metodo statico commonName
    public static void commonName(Body bodyRef) {
        //todo: errore ???
        //bodyRef.name   = "Dog Star";
        bodyRef=null;
    }

    //MAIN
    //____________________________________________________________________________//
    public static void main(String[] args) {

        Body sirius = new Body("Sirius", null);
        System.out.println("before: one = "+ sirius);
        commonName(sirius);
        System.out.println("after: one = "+ sirius);

    }
    //____________________________________________________________________________//


}
