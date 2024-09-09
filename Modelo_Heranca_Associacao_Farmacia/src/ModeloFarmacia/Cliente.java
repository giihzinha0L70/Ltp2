
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Cliente {
    private String cnpj;
    private String nome;
    private String dataNasc;
    private Receita receita;
    private Pedido pedido;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public Cliente(String cnpj, String nome, String dataNasc, Receita receita, Pedido pedido){
        this.cnpj=cnpj;
        this.nome=nome;
        this.dataNasc=dataNasc;
        this.receita=receita;
        this.pedido=pedido;
    }
    
    @Override
    public String toString(){
        return  "\n CNPJ:" +getCnpj()+
                "\n Nome:" + getNome()+
                "\n Data de Nascimento:" + getDataNasc()+
                "\n Receita:" + getDataNasc()+
                "\n Pedido:" + getPedido();
    }
}
