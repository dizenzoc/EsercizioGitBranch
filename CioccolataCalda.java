public class CioccolataCalda extends Cioccolato {
    private double temperatura;
    private double densita;

    public CioccolataCalda (String tipoDiCioccolato, String tipoDiAggiunta, int percentualeCacao, int unita, double temperatura, double densita){
        super(tipoDiCioccolato, tipoDiAggiunta, percentualeCacao, unita);
        this.temperatura=temperatura;
        this.densita=densita;
    }

    @Override
    public void produce(){
        super.produce();
        System.out.println("temperatura=" + temperatura  + " C, Densita: "+densita);
    }
}