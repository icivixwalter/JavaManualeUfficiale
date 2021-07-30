package app.cap_02_classi_e_oggetti;

import java.util.Arrays;

/**
 * CLASSE BANK ACCOUNT PAG 60
 * + PAG 132 PER LE CLASSI INTERNE COME DA MODIFICHE EFFETTUATE a pag 132 + 133
 */
public class BankAccount {
    private long number;        //numero di conto
    private long balance;       //saldo in centesimi

    private Action lastAct;      //01) nuovo campo ultima operazione eseguita
/*Integrazione con pag 132 le Classi interne
ho aggiunto
    01) nuovo campo ultima operazione eseguita
    02) la classe interna Action
    03) aggiunto un nuovo metodo alla classe BankAccount denominato deposit ()
    04) aggiunto un nuovo metodo alla classe BankAccount denominato withdraw ()
    DESCRIZIONE: la classe Action memoriza una singola operazione effettuata sul conto bancario,
    e non è dichirata static e quindi i suoi oggetti esistono in relazione all'oggetto della classe
    contenitrice BankAccount
//=================================================================================================//
 */


    //02) la classe interna Action
    //----------------------------------------------------------------------------------
    public class Action {
        private String act;
        private long amount;

        //costruttore
        public Action(String act, long amount) {
            this.act = act;
            this.amount = amount;
        }

        public String toString() {
            //identifica l'Action pag. 132
            return "Action: " + act + " amount: " + amount;
        }
    }
    //02) la classe interna Action  *** fine ***
    //----------------------------------------------------------------------------------

    //costruttore della classe BankAccount
    public BankAccount(long mynumber, long mybalance) {
        this.number = mynumber;
        this.balance = mybalance;
        /*
        modifica Giacomo per evitare null su lastAct ne test viene creata una nuova azione
        che non rientra nei parametri del costruttore
        una Action = azione per indicare che  ho creato il BankAccaount come inizializzazione
        e gli passo il parametro sopra indicato balance come ammontare.
         */
        this.lastAct = this.new Action("Created BankAccount", mybalance);

    }

    //03) aggiunto un nuovo metodo alla classe BankAccount denominato deposit ()
    //----------------------------------------------------------------------------------
    public void deposit(long amount) {
        balance += amount;
        lastAct = new Action("deposit", amount);
    }
    //----------------------------------------------------------------------------------


    //04) aggiunto un nuovo metodo alla classe BankAccount denominato withdraw ()
    //----------------------------------------------------------------------------------
    public void withdraw(long amount) {
        balance -= amount;
        lastAct = new Action("withdraw", amount);
    }

    /*  05) aggiunto un nuovo metodo alla classe BankAccount denominato transfer ()
    per
       effettuare i trasferimenti di conto.
    //----------------------------------------------------------------------------------
    */
    public void transfer(BankAccount other, long amount) {
        other.withdraw(amount);  // prende soldi da other
        this.deposit(amount); // mette i soldi a questo conto

        this.lastAct = this.new Action("Transfer from " + other.number, amount);
        other.lastAct = other.new Action("trasfer to " + this.number, -amount);
    }
    //05) aggiunto un nuovo metodo alla classe BankAccount denominato transfer () *** fine
    //----------------------------------------------------------------------------------


//Integrazione con pag 132 le Classi interne  *** fine ***
//=================================================================================================//


    //todo: metodo toString come faccio a stampare con toString????

    /**
     * come faccio a stampare????
     */
    @Override
    public String toString() {
        return String.format("BankAccount : nro %d, conto %d, Ultima azione %s", number, balance, lastAct.toString());
    }


    public Permission permissionsFor(Person who) {
        //sembra che funziona
        Permission perm = new Permission();
        perm.canDeposit = canDeposit(who);
        perm.canWithdraw = canWithdraw(who);
        perm.canClose = canClose(who);
        return perm;

    }

    //... definizione di 3 METODI per definire i permssi di deposito + prelevamento + chiusura conto per una persona
    private boolean canDeposit(Person who) {
        return who.permission.canDeposit;
    }

    private boolean canWithdraw(Person who) {
        return who.permission.canWithdraw;
    }

    private boolean canClose(Person who) {
        return who.permission.canClose;
    }


    /*
    CLASSE INNESTATA
    pag. 130 modifica per l'inserimento di una classe innestata capitolo 5
    CLASSE PERMISSION viene definitva all'internd della classe BankAccaunt divenendone
    in effetti un membro. Quando il metodo permissionFor  restituisce un oggetto
    Permission esso indca il nome di tale classe utilizzando Permission. Permission
    è un membro della classe ed il nome completo è BanckAccount.Permission = indica che
    la CLASSE PERMISSION esiste come parte della classe BankAccount e NON COME TIPO
    A SE STANTE e il codice fuori dalla Classe BankAccount deve utilizzare un nome completo
    es. BankAccount.Permission perm = acct.permissionsFor (owner);
    La classe Permission puo avere accesso a tutti i membri  di BankAccount compresi quelli
    ereditati e tale classe statica puo essere estesa, anche se viene estesa non ha accesso
    ai membri della classe contenitore. pag 131
    CLASSE INNESTATE DI TIPO ENUMERATIVO = la dichiarazione enum esclude il modificatore
    static.

     */
    public static class Permission {
        public boolean canDeposit,
                canWithdraw,
                canClose;
    }

    //faccio il test della classe
    public static void main(String[] args) {
        //creo una variabile per invocare il metodo da testare permissionsFor
        BankAccount conto = new BankAccount(9876543, 1000);
        conto.permissionsFor(new Person(new Permission()));
        System.out.println("conto nomimativo base: " + conto);
        conto.deposit(100);

        System.out.println("\n ho depositato " + conto);

        // crea un altro BankAccount per traferire denaro con 600 di base pag 133
        BankAccount myother = new BankAccount(888887, 600);
        System.out.println("conto nomimativo base: " + myother);
        conto.transfer(myother, 200);
        System.out.println("Conto (" + conto + ") ho ricevuto 200 dal conto myother (" + myother + ")");
        System.out.println("Conto (" + myother + ") ho inviato 200 al conto (" + conto + ")");
    }

}
