package app.cap_02_classi_e_oggetti;


/**
 * CLASSE PERSON CREATA perche lo richiede la pagina 60
 * implicitamente
 */
public class Person {
   // public Permission permission;  // deprecata quindi commentata perche si trovato un modo migliore per mettere Permission
    //perche Permission è stata innestata dentro BanckAccount

    //devo usare BankAccount.Permission
    public BankAccount.Permission permission;

    //costruttore modificato con l'utilizzo di Permission di BankAccount
    public Person(BankAccount.Permission permission) {
        this.permission = permission;
    }
}
