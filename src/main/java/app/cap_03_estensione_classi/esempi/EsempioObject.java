package app.cap_03_estensione_classi.esempi;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

public class EsempioObject {
    //todo: esercizio da fare
    @Esercizio(nro = "3.7", pag = 96) // ridefinire i metodi equals e hashCode per la classe  ColorAttr
    public static void main(String[] args)
    //IMPLEMENTAZIONE è il codice scritto nel corpo del metodo e vale tutte le classi.
    {
        String var1 = "prima variabile";
        String var2 = "prima variabile";
        String var3 = var1;

        //PAG 97 ESEMPIO EQUALS
        //equals = CONFRONTA I VALORI  non i riferimenti all'oggetto (i puntatori)
        System.out.println(".....................................\n");
        System.out.println("confronto va1 = var2 + var1 = var3");
        // == CONFRONTA I RIFERIMENTO SOLO PER GLI OGGETTI mentre per i tipi primitivi cofronta i valori
        System.out.println(var1 == var2); // TRUE
        System.out.println((var1 == var3 )+ "\n"); // TRUE

        System.out.println("esempio EQUALS = (var1.equals(var2)) + (var1.equals(var3)");
        System.out.println(var1.equals(var2)); // TRUE
        System.out.println(var1.equals(var3)); // TRUE
    }

}
