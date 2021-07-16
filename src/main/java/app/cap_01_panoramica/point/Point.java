package app.cap_01_panoramica.point;

import app.cap_01_panoramica.annotazioni.Reviewed;
import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

/**
 * CLASSE POINT pag 12
 * pag 115 cap 4 inserito modifica, viene dichiarata Point come classe Comparable e una classe identifica
 * i tipi di interfaccia che essa implementa elencandoli in una lista dopo la porola implements.
 * Queste interfacce sono dette SUPERINTERFACCE DELLA CLASSE che deve fornire dei metodi definite nelle sue
 * superinterfacce oppure in caso contrario la classe deve essere dichiarata abstract e la sua implementazione
 * viene eseguita nelle sottoclassi. pag. 115
 */
@Reviewed(reviewer = "giacomo", date = 20210624)
public class Point implements Comparable<Point> {
    //Campo statico della classe = VARIABILI DELLA CLASSE STATICHE
    //modifiche dal capitolo 04 - Il riferimento all'origine che non cambia mai pag 115
    private static final Point ORIGIN = new Point();

    //punti
    public double x, y; // attenzione i campi MAI PUBBLICI

    Comparable<Point> p1;// nuovo nome introdotto dall'interfaccia pag 116

    //2 COSTRUTTORI
    //---------------------------------------------------------------------------------//
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //---------------------------------------------------------------------------------//


    public void clear() {
        System.out.println("metodo Clear della Classe Point");
        x = 0.0;
        y = 0.0;
    }

    /**
     * RADICE EUCLIDEA
     * Parametro = un oggetto classe Point
     * calcolo della radice quadrata della somma dei quadrati tra
     * le rispettive coordinate di x dei due punti e le rispettive coordinate di y
     * modificato da double distance(Point that) ... in  Point p
     */
    public double distance(Point p) {
        double xdiff = x - p.x;
        double ydiff = y - p.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    //modifica inserita dal cap. 4 pag 115
    public int compareTo(Point p) {
        double pDist = p.distance(ORIGIN);
        double dist = this.distance(ORIGIN);
        if (dist > pDist)
            return 1;
        else if (dist == pDist)
            return 0;
        else
            return -1;
    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * il riferimento THIS
     * es. metodo move
     */
    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }


    //esercizio pag. 17 1.8 metodo inizializza le coordinate passando un altro Point
    @Esercizio(nro = "1.8", pag = 17, descrizione = "Aggiungere un metodo che inizializzi" +
            " le coordinate dell'oggetto corrente con i valori passati da un altro" +
            " oggetto Point.")
    public void inizializzoCoordinate(Point altroPoint) {
        this.x = altroPoint.x;
        this.y = altroPoint.y;
    }

    //main
    public static void main(String[] args) {
        Point lowerLeft = new Point(); //CHIAMA IL COSTRUTTORE SENZA PARAMETRI
        Point upperRight = new Point();
        Point middlePoint = new Point();

        // QUESTO SI PUO FARE SOLO CON I CAMPI PUBBLICI (ma non lo fare piu')
        lowerLeft.x = 0.0;
        lowerLeft.y = 0.0;

        upperRight.x = 1280.0;
        upperRight.y = 1024.0;

        middlePoint.x = 640.0;
        middlePoint.y = 512.0;


        /*
         * come invocare distance che conterra
         * la distanza euclidea tra lowerLeft e UpperRight PAG 16
         */
        double d = lowerLeft.distance(upperRight);

        // stile C
        System.out.printf("STILE C: stampa la distanza tra lowerLeft e upperRight = %f\n", d);

        // alternativa stile java
        System.out.println("STILE JAVA: stampa la distanza tra lowerLeft e upperRight = " + d);


        //esercizio pag. 17 1.8 metodo inizializza le coordinate passando un altro Point
        //qui chiamo due costruttori di cui il primo con parametri
        Point primoPuntoInizializzato = new Point(10.0, 20.0);
        Point secondoPunto = new Point();

        //per inizializzare secondoPunto con la x,y di primoPuntoInizializzato uso questo metodo

        secondoPunto.inizializzoCoordinate(primoPuntoInizializzato);

        System.out.println("Primo punto " + primoPuntoInizializzato);
        System.out.println("-------------------------------------\n Ho copiato le coordinate del" +
                " primo punto nel secondo punto \n");
        System.out.println("Secondo Punto " + secondoPunto);
    }

}

