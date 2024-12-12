public class CioccolataCalda extends Cioccolato {
    private double temperatura;
    private double densita;

    public CioccolataCalda (String tipo, int perceCacao, double temperatura){
        super(tipoDiCioccolato, percentualeCacao);
        this.temperatura=temperatura;
        this.densita=densita;
    }

    @Override
    public void produce(){
        super.produce();
        System.out.println("temperatura; "+ temperatura " C, Densita: "+densita);
    }
}