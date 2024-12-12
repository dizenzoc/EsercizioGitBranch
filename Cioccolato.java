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
                "tipoDiCioccolato='" + tipoDiCioccolato + '\'' +
                ", tipoDiAggiunta='" + tipoDiAggiunta + '\'' +
                ", percentualeCacao=" + percentualeCacao +
                ", unita=" + unita +
                '}');
    }

    public static void main(String[] args) {
        final int MAX_CIOCCOLATO_GIORNALIERO = 100;
        int cioccolatoRimasto = MAX_CIOCCOLATO_GIORNALIERO;

        Scanner scInt = new Scanner(System.in); // Scanner per input interi
        boolean menu = true; //booleano per mostrare menu
        
        while(menu) {
            mostraMenu();
            int scelta = scInt.nextInt();
            scInt.nextLine(); // Consuma la newline
            switch (scelta) {
                case 1:
                    System.out.println();
                    //logica per cioccolatino
                    System.out.println();
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
}
