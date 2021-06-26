package app.cap_01_panoramica.point;

import app.cap_01_panoramica.annotazioni.Reviewed;

/**
 * CLASSE POINT pag 12
 */
@Reviewed(reviewer = "giacomo",date = 20210624)
public class Point {
    //punti
    public double x, y; // attenzione i campi MAI PUBBLICI

    //2 COSTRUTTORI
    //---------------------------------------------------------------------------------//
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //---------------------------------------------------------------------------------//


    //Campo statico della classe = VARIABILI DELLA CLASSE STATICHE
    public static Point origin = new Point();

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
     */
    public double distance(Point that) {
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
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
        System.out.println("Secondo Punto " + secondoPunto);

    }

}
