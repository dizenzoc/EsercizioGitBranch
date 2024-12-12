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
    @Override
    public String toString() {
        return "Cioccolato{" +
                "tipoDiCioccolato='" + tipoDiCioccolato + '\'' +
                ", tipoDiAggiunta='" + tipoDiAggiunta + '\'' +
                ", percentualeCacao=" + percentualeCacao +
                ", unita=" + unita +
                '}';
    }
}