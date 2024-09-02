
package herancaAssociacaoPessoa;

/**
 *
 * @author 363707
 */
public class Marceneiro extends Pessoa {
    private String cnpj;
    private String areaAtuacao;
    private Encomenda encomenda;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }
    
    public Marceneiro(String nome, String cnpj, String areaAtuacao, Encomenda encomenda){
        super(nome);
        this.cnpj=cnpj;
        this.areaAtuacao=areaAtuacao;
        this.encomenda=encomenda;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n CNPJ:" + getCnpj()+
                "\n Área de Atuação:" + getAreaAtuacao()+
                "\n Encomenda:" + getEncomenda();
    }
}
