package app.cap_02_classi_e_oggetti;

/**
 * CLASSE ECHO
 * metodon main pag 70
 */
//todo: come farl funzionare su riga di comando??
public class Echo {
    public static void main(String[] args) {
        for (int i = 0; i <args.length; i++)
            System.out.println(args[i]+ " ");
            System.out.println();
    }
}
