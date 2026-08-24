public class Moto extends Veiculo{
    public int numCilindrada;
    public Moto(String modelo, int ano, int numCilindrada) {
        super(modelo, ano);
        this.numCilindrada = numCilindrada;
    }
    @Override
    public String imprimirDetalhes() {
        return super.imprimirDetalhes() + "\nNúmero de Cilindrada: "+ this.numCilindrada;
    }
}
