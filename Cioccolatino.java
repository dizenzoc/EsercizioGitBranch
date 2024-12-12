import EsercizioGitBranch.Cioccolato;

public class Cioccolatino extends Cioccolato{
    public String forma;
    public String ripieno;

    public Cioccolatino(String forma, String ripieno){
        super.tipoDiCioccolato;
        super.tipoDiAggiunta;
        super.percentualeCacao;
        super.unita;
        this.forma = forma;
        this.ripieno = ripieno;
    }

    @Override
    public void produce(){
        System.out.println(super.toString + "di forma: " + forma + "; ripieno di: " + ripieno);
    }
}
