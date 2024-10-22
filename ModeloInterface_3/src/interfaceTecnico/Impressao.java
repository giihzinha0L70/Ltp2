
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Impressao extends Servico{
    private Double valorImpressao;

    public Double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(Double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }
    
    public Impressao(String nome, Double valorImpressao){
        super(nome);
        this.valorImpressao=valorImpressao;
    }
    
    @Override
    public Double totalPagar(){
        return(valorImpressao * Cliente.qtdPaginaImpressa);
    }
    @Override
    public String toString(){
        return  "\nNome:"+ getNome()+
                "\nValor da Impressão:"+ getValorImpressao();
    }
}
