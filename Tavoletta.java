public class Tavoletta extends Cioccolato {
    int peso;
    boolean aggiunte;

    // Costruttore della classe Tavoletta
    public Tavoletta(String tipoDiCioccolato, String tipoDiAggiunta, int percentualeCacao, int unita, int peso, boolean aggiunte) {
        // Passaggio dei parametri alla superclasse
        super(tipoDiCioccolato, tipoDiAggiunta, percentualeCacao, unita);
        this.peso = peso;
        this.aggiunte = aggiunte;
    }

    // Override del metodo produce()
    @Override
    public void produce() {
        // Uso corretto delle variabili della superclasse
        System.out.println("Il tipo di cioccolato " + tipoDiCioccolato + " con tipo di aggiunta " + tipoDiAggiunta + " è stato aggiunto: " + aggiunte +
                " e con percentuale " + percentualeCacao + " con peso " + peso + "e unità: " + unita);
    }
}
