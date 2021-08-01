package app.cap_04_interfacce;

/**
 * CLASSE ASTRATTA DEVISE cap. 5.5 Ereditarieta dei tipi innestati pag. 141
 * E' una classe astratta che cattura UN COMPORTAMENTO COMUNE  a tutti i dipsositivi
 * come ad es. la PORTA che ha un comportamento generico e quindi si puo modellare
 * come classe astratta.
 * LA CLASSE PORT è una classe interna alla presente perchè LE PORTE esistono all'interno
 * dei dispositivi pag 142.
 * e quindi questa modella un dispositivo concreto che definisce :
 *  - lo stato del dispositivo;
 *  - lo stato della porta interna.
 */
public class Device {
    //CLASSE INTERNA PORT
    abstract class Port{
        //....

    }
    //...
}

