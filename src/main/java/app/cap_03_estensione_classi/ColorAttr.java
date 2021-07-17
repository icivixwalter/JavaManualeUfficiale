package app.cap_03_estensione_classi;

/**
 * CLASSE COLORATTR PAG 75
 */
public class ColorAttr extends Attr {
    private ScreenColor myColor; //colore decodificato


    //I° COSTRUTTORE = rispecchia la classe Attr
    public ColorAttr(String name, Object value) {
        //mette super per invocare esplicitamente il costruttore della
        //superclasse
        super(name, value);
        decodeColor();
    }

    //II° COSTRUTTORE = rispecchia la classe Attr
    public ColorAttr(String name) {
        //con this invoco il costruttore della CLASSE CORRENTE non della superclasse
        //cio' assicura che l'attributo del colore contenga almeno quello di base
        //ossia trasparents
        this(name, "trasparent");
    }

    //III° COSTRUTTORE =  accetta uno ScreenColor
    public ColorAttr(String name, ScreenColor value) {
        super(name, value.toString());
        myColor = value;
    }
    //I° metodo sovraccaricato
    public Object setValue(Object newValue) {
        //esegue prima il metodo setValue della superclasse
        Object retval = super.setValue(newValue); //SUPER = accedo ai metodi della superclasse ma ridefinito nella classe corrente
        decodeColor();
        return retval;
    }

    /*imposta il valore dello ScreenColor ma non la descrizione
        esegue prima il metodo setValue della superclasse
     */
    //II° metodo sovraccaricato
    public ScreenColor setValue(ScreenColor newValue) {
        super.setValue(newValue.toString());
        ScreenColor oldValue = myColor;
        myColor = newValue;
        return oldValue;
    }

    //restituisce l'oggett ScreeColor decodificato
    public ScreenColor getColor() {
        return myColor;
    }

    //imposta ScreenColor in base alla descrizione fornita da getValue
    //modificatore protect
    protected void decodeColor() {
        if (getValue() == null)
            myColor = null;
        else
            myColor = new ScreenColor(getValue());
    }

    public static void main(String[] args) {

    }
}
