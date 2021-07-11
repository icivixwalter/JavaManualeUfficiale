package app.cap_02_classi_e_oggetti.esercizi;

/**
 * CLASSE VEICOLI
 */
@Esercizio(nro = "2.1", pag = 42)
public class Veicolo {
    @Esercizio(nro = "2.13", pag = 65) // campi sono resi privati
    private int velocita;
    private int direzione;
    private String proprietario;

    @Esercizio(nro = "2.3", pag = 44)
    private static int idSuccessivo = 0; //ottiene il prossimo veicolo
    /**/
    //todo: metodo toString da errore ??


    //todo: esercizio da fare ???
    /*
    ad ogni istanza new di veicolo il campo statico idSuccessivo viene incrementato E ASSEGNATO A ID
    ++X = INCREMENTA E ASSEGNA
    X++ = ASSEGNA E INCREMENTA
    Quindi il campo è final perche a) rappresenta una proprieta immutable dell'oggetto
     */
    @Esercizio(nro = "2.4", pag = 44)
    private final int id = ++idSuccessivo;                 // campo idenfica this

    @Esercizio(nro = "2.10", pag = 57)
    public String toString() {

        return "veicolo";
    }

    @Esercizio(nro = "2.13.01", pag = 65) // metodi di acceso ai campi che sono resi privati
       /* creato i metodi get e set per i campi
        velocita;
        direzione;
       proprietario;
               */

    //get e set velocita
    public void setVelocita(int newVelocita){
        velocita=newVelocita;
    }
    public int getVelocita(){return velocita;}


    //get e set proprietario
    public void setProprietario(String newProprietario){
        proprietario=newProprietario;
    }
    public String getProprietario(){return proprietario;}

    // TODO: da fare
    @Esercizio(nro = "2.17", pag = 68) // creare due metodi overloading
    public void metodo(){

    }



    //MAIN
    //campo non statico id deve essere final e viene aumentato ad ogni oggetti veicolo
    public static void main(String[] args) {
        System.out.println(Veicolo.idSuccessivo);
        Veicolo auto= new Veicolo();
        System.out.println(auto.id);
        System.out.println(Veicolo.idSuccessivo);

        Veicolo auto2= new Veicolo();
        System.out.println(auto2.id);

    }

}
