
package ClasseAbstrataVeiculo;

/**
 *
 * @author 363707
 */
public class DePasseio extends Veiculo{
    private String marca;
    private String descricao;
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }
    
    public DePasseio(String placa, int ano, String cor, Double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora){
        super(placa, ano, cor, preco, proprietario);
        this.marca=marca;
        this.descricao=descricao;
        this.montadora=montadora;
    }
    
    
    @Override
    public Double ipva(){
        return  (preco * 0.03);
    }
    
    @Override
    public Double seguro(){
        return  (preco * 0.015);
    }
    
    @Override
    public String toString(){
        return  "\n --- Sobre o Veículo de Passeio ---"+
                "\n Placa:" + getPlaca() + 
                "\n Ano:" + getAno()+
                "\n Cor:" + getCor()+
                "\n Preço:" + getPreco()+
                "\n Proprietário:" + getProprietario()+
                "\n Marca:" + getMarca()+
                "\n Descrição:" + getDescricao()+
                "\n Montadora:" + getMontadora()+
                "\n IPVA:" + ipva()+
                "\n Seguro:" + seguro();
    }
    
}
