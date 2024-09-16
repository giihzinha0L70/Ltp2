
package ClasseAbstrataVeiculo;

/**
 *
 * @author 363707
 */
public class Moto extends Veiculo{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
public Moto(String placa, int ano, String cor, Double preco, Proprietario proprietario, int cilindrada){
    super(placa, ano, cor, preco, proprietario);
    this.cilindrada=cilindrada;    
    }

    @Override
    public Double ipva(){
        return  (preco * 0.08);
    }
    
    @Override
    public Double seguro(){
        return  (preco * 0.05);
    }
    
    @Override
    public String toString(){
        return  "\n --- Sobre o Veículo Ônibus ---"+
                "\n Placa:" + getPlaca() + 
                "\n Ano:" + getAno()+
                "\n Cor:" + getCor()+
                "\n Preço:" + getPreco()+
                "\n Proprietário:" + getProprietario()+
                "\n Cilindrada:" + getCilindrada()+
                "\n IPVA:" + ipva()+
                "\n Seguro:" + seguro();
    }

}
