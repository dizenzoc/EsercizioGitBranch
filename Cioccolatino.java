public class Cioccolatino extends Cioccolato{
    public String forma;
    public String ripieno;

    public Cioccolatino(String tipoDiCioccolato, String tipoDiAggiunta, int percentualeCacao, int unita, String forma, String ripieno){
        super(tipoDiCioccolato, tipoDiAggiunta, percentualeCacao, unita);
        this.forma = forma;
        this.ripieno = ripieno;
    }

    @Override
    public void produce(){
        System.out.println(super.toString() + "di forma: " + forma + "; ripieno di: " + ripieno);
    }
}
