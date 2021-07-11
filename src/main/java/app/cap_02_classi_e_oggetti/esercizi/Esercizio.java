package app.cap_02_classi_e_oggetti.esercizi;

import java.util.Date;

/**
 * ANNOTAZIONI PER GLI ESERCIZI SVOLTI
 */
public @interface Esercizio {
    public String nro();
    public int pag() default 0;
    public String descrizione() default "";

}
