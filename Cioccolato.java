import java.util.ArrayList;
import java.util.Scanner;

public abstract class Cioccolato {

    protected String tipoDiCioccolato;
    protected String tipoDiAggiunta;
    protected int percentualeCacao;
    protected int unita;

    // costruttore vuoto
    public Cioccolato() {

    }

    //costruttore
    public Cioccolato(String tipoDiCioccolato, String tipoDiAggiunta, int percentualeCacao, int unita) {
        this.tipoDiCioccolato = tipoDiCioccolato;
        this.tipoDiAggiunta = tipoDiAggiunta;
        this.percentualeCacao = percentualeCacao;
        this.unita = unita;
    }

    // getter e setter
    public String getTipoDiCioccolato() {
        return tipoDiCioccolato;
    }

    public void setTipoDiCioccolato(String tipoDiCioccolato) {
        this.tipoDiCioccolato = tipoDiCioccolato;
    }

    public String getTipoDiAggiunta() {
        return tipoDiAggiunta;
    }

    public void setTipoDiAggiunta(String tipoDiAggiunta) {
        this.tipoDiAggiunta = tipoDiAggiunta;
    }

    public int getPercentualeCacao() {
        return percentualeCacao;
    }

    public void setPercentualeCacao(int percentualeCacao) {
        this.percentualeCacao = percentualeCacao;
    }

    public int getUnita() {
        return unita;
    }

    public void setUnita(int unita) {
        this.unita = unita;
    }

    // toString
    public void produce() {
        System.out.println("Cioccolato{" +
                "\n\ttipoDiCioccolato='" + tipoDiCioccolato + '\'' +
                "\n\ttipoDiAggiunta='" + tipoDiAggiunta + '\'' +
                "\n\tpercentualeCacao=" + percentualeCacao +
                "\n\tunita=" + unita +
                '}');
    }

    public static void main(String[] args) {
        final int MAX_CIOCCOLATO_GIORNALIERO = 100;
        int cioccolatoRimasto = MAX_CIOCCOLATO_GIORNALIERO;

        Scanner scInt = new Scanner(System.in); // Scanner per input interi
        //Scanner scStr = new Scanner(System.in);
        boolean menu = true; //booleano per mostrare menu
        ArrayList<Cioccolato> lista = new ArrayList<>();
        
        while(menu) {
            mostraMenu();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    if (cioccolatoRimasto >= 2) {
                        lista.add(creaCioccolatino(scInt));
                        cioccolatoRimasto -= 2;
                    }
                    else{
                        break;
                        // System.out.println("Per oggi abbiamo finito... Vuoi continuare?");
                        // int risp = 0;
                        // switch (risp) {
                        //     case 1:
                        //         cioccolatoRimasto = MAX_CIOCCOLATO_GIORNALIERO;
                        //         break;
                        
                        //     default:
                        //         break;
                        // }
                    }
                    break;
                case 2:
                    System.out.println();
                    //logica per tavoletta
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    //logica per cioccolata calda
                    System.out.println();
                    break;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Scelta non valida. Riprova.");
                    System.out.println();
            }
        }
    }

    private static void mostraMenu() {
        System.out.println("Cosa vuoi aggiungere?");
        System.out.println("1. Cioccolatino");
        System.out.println("2. Tavoletta");
        System.out.println("3. Cioccolata Calda");
        System.out.println("4. Esci");
        System.out.print("Scegli un'opzione: ");
    }

    private static void mostraMenuTipoCioccolatino() {
        System.out.println("Tipo di cioccolato:");
        System.out.println("1. Al Latte");
        System.out.println("2. Fondente");
        System.out.print("Scegli un'opzione: ");
    }

    private static void mostraMenuAggiuntaCioccolatino() {
        System.out.println("Tipo di aggiunta:");
        System.out.println("1. Nocciole");
        System.out.println("2. Mandorle");
        System.out.println("3. Oreo");
        System.out.print("Scegli un'opzione: ");
    }

    private static void mostraMenuFormaCioccolatino() {
        System.out.println("Forma Cioccolatino:");
        System.out.println("1. Rettangolo");
        System.out.println("2. Quadrato");
        System.out.print("Scegli un'opzione: ");
    }

    private static void mostraMenuRipienoCioccolatino() {
        System.out.println("Tipo di aggiunta:");
        System.out.println("1. Crema");
        System.out.println("2. Nutella");
        System.out.print("Scegli un'opzione: ");
    }

    private static Cioccolatino creaCioccolatino(Scanner scInt){
        Cioccolatino nuovoCioccolatino = new Cioccolatino();
        nuovoCioccolatino.setUnita(2); //valore fisso
        
        boolean menu = true;
        //menu per tipo di cioccolatino
        while(menu){
            mostraMenuTipoCioccolatino();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    nuovoCioccolatino.setTipoDiCioccolato("Al Latte");
                    menu = false;
                    break;
                case 2:
                    nuovoCioccolatino.setTipoDiCioccolato("Fondente");
                    menu = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Scelta non valida. Riprova.");
                    System.out.println();
            }
        }
        menu = true;
        //menu per tipo di aggiunta al cioccolatino
        while(menu){
            mostraMenuAggiuntaCioccolatino();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    nuovoCioccolatino.setTipoDiAggiunta("Nocciole");
                    menu = false;
                    break;
                case 2:
                    nuovoCioccolatino.setTipoDiAggiunta("Mandorle");
                    menu = false;
                    break;
                case 3:
                    nuovoCioccolatino.setTipoDiAggiunta("Oreo");
                    menu = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Scelta non valida. Riprova.");
                    System.out.println();
            }
        }
        System.out.println("Inserisci percentuale cacao: ");
        int percentuale = scInt.nextInt();
        scInt.nextLine(); // Consuma la newline
        nuovoCioccolatino.setPercentualeCacao(percentuale);

        menu = true;
        //menu per forma di cioccolatino
        while(menu){
            mostraMenuFormaCioccolatino();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    nuovoCioccolatino.setForma("Rettangolo");
                    menu = false;
                    break;
                case 2:
                    System.out.println();
                    nuovoCioccolatino.setForma("Quadrato");
                    menu = false;
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("Scelta non valida. Riprova.");
                    System.out.println();
            }
        }
        menu = true;
        //menu per tipo di cioccolatino
        while(menu){
            mostraMenuRipienoCioccolatino();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    nuovoCioccolatino.setRipieno("Crema");
                    menu = false;
                    break;
                case 2:
                    nuovoCioccolatino.setRipieno("Nutella");
                    menu = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Scelta non valida. Riprova.");
                    System.out.println();
            }
        }
        System.out.println("Nuovo cioccolatino creato");
        nuovoCioccolatino.produce();
        return nuovoCioccolatino;
    }

    private static Tavoletta creaTavoletta(){
        
        return null;
    }

    private static CioccolataCalda creaCioccolataCalda(){
        return null;
    }
}
