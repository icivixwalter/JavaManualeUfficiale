package app.cap_03_estensione_classi;

/**
 * CLASSE EXTENDSHOW
 * classe estesa che utilizza lo stesso medoto della superclasse
 *
 */
public class ExtendShow extends SuperShow {
    public String str = "ExtendStr";
    //II metodo  show
    public void show() {
        System.out.println("Estend. show: " + str);
    }


    public static void main(String[] args) {
        ExtendShow ext = new ExtendShow();  //ext = variabile di tipo ExtendShow alla classe corrente
        SuperShow sup = ext;        //sup = variabile di tipo SuperShow riferimento alla Superclasse
        sup.show();
        ext.show();
        System.out.println("sup.str = " + sup.str);
        System.out.println("ext.str = " + ext.str);

    }

}
