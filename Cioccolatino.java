public class Cioccolatino extends Cioccolato{
    public String forma;
    public String ripieno;

    public Cioccolatino(){

    }

    public Cioccolatino(String tipoDiCioccolato, String tipoDiAggiunta, int percentualeCacao, int unita, String forma, String ripieno){
        super(tipoDiCioccolato, tipoDiAggiunta, percentualeCacao, unita);
        this.forma = forma;
        this.ripieno = ripieno;
    }

    @Override
    public void produce(){
        System.out.println("Cioccolatino{\n" +
                "\ttipoDiCioccolato='" + tipoDiCioccolato + '\'' +
                "\n\ttipoDiAggiunta='" + tipoDiAggiunta + '\'' +
                "\n\tpercentualeCacao=" + percentualeCacao +
                "\n\tunita=" + unita +
                "\n\tforma=" + forma +
                "\n\tripieno=" + ripieno +
                '}');
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getRipieno() {
        return ripieno;
    }

    public void setRipieno(String ripieno) {
        this.ripieno = ripieno;
    }

    
}
