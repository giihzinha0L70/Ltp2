
package ClasseAbstrataVeiculo;

/**
 *
 * @author 363707
 */
public class Onibus extends Veiculo{
    private int qtdePassageiros;
    private Montadora montadora;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public Onibus(String placa, int ano, String cor, Double preco, Proprietario proprietario, int qtdePassageiros, Montadora montadora){
        super(placa, ano, cor, preco, proprietario);
        this.qtdePassageiros=qtdePassageiros;
        this.montadora=montadora;
    }
    
    @Override
    public Double ipva(){
        return  (preco * 0.05);
    }
    
    @Override
    public Double seguro(){
        return  (preco * 0.025);
    }
    
    @Override
    public String toString(){
        return  "\n --- Sobre o Veículo Ônibus ---"+
                "\n Placa:" + getPlaca() + 
                "\n Ano:" + getAno()+
                "\n Cor:" + getCor()+
                "\n Preço:" + getPreco()+
                "\n Proprietário:" + getProprietario()+
                "\n Quantidade de Passageiros:" + getQtdePassageiros()+
                "\n Montadora:" + getMontadora()+
                "\n IPVA:" + ipva()+
                "\n Seguro:" + seguro();
    }
}
