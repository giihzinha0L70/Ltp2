
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class DoCliente extends NotaFiscal{
    private String descricao;
    protected static Double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public DoCliente(int numero, String descricao, Double preco){
        super(numero);
        this.descricao=descricao;
        this.preco=preco;
    }
    
    @Override
    public String toString(){
        return  "\nNúmero:"+ getNumero()+
                "\nDescrição:"+ getDescricao()+
                "\nPreço:"+ getPreco();
    }
}
