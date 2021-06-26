package app.cap_01_panoramica.point;


import java.awt.*;

/**
 * SOTTOCLASSE della super classe Point
 * pag 24
 * La classe Point viene estesa  sia per i dati in quanto aggiunge un campo mycolor e sia
 * come metodo ridefinendo clear; l'oggetto Pixel estende il comportamento della classe Point
 * aggiungendo il colore. Attenzione oltre al comportamento esteso si puo fare anche una restrizione
 * del comportamento come ad es. un'oggetto Pixel che si trova in un oggetto Scree, il quale restringe
 * le coordinate x,y entro i limiti della dimensione dello schermo.
 * La classe estesa definisce un metodo con la stessa segnatura e lo stesso tipo di ritorno validi per un
 * metodo della super classe, ed in questo esempio Pixel, viene definito un metodo clear  che ha un comportamento
 * più adatto con il campo  color dichiarato.
 * ATTENZIONE = se non specificato, il main è ereditato dalla classe Point
 */
public class Pixel extends Point {
    Color myColor;

    //costruttore compreso anche quello della superclasse
    public Pixel(double x, double y, Color myColor) {
        //super(..) = costruttore della superclasse
        super(x, y);
        //inizializzo il campo di questa classe con this
        this.myColor = myColor;
    }

    //metodo clear ridefinito
    public void clear() {
        super.clear();
        System.out.println("Metodo clear della classe Pixel ");
        //nuova variabile che estende il clear della superclasse
        myColor = null;
    }

    /**
     * @return LA RAPPRESENTAZIONE STRINGA DI QUESTA ISTANZA DI CLASSE (PIXEL)
     * sovrascrive il metodo toString della classe Object
     */
    @Override
    public String toString() {
        return "Pixel{" +
                "color=" + myColor +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        /*
        POLIMORFISMO
            ad una variabile di tipo Point assegno una istanza di tipo Pixel
            perchè Pixel estende Point.
            Uso più generalizzato della classe Point.
         */

        Point point = new Pixel(2.1,2.3,Color.BLUE);
        System.out.println(point);
        /*
         * Sia Point che Pixel hanno un metodo clear().
         * In questa maniera quale metodo viene chiamato quello di Point o di Pixel?
         * tutte e due !!!!!!!!!!!!!!!!
         */
        point.clear();
        System.out.println(point);
    }
    /*
        * invoco il metodo clear della classe madre (superclasse)
         se non utilizzo super.clear, ma  faccio
            in questo caso utilizzo il clear di Pixel non della super classe
            quindi utilizzi la classe effettiva dell'oggetto e non quella di
            riferimento (la super classe)
         */

}
