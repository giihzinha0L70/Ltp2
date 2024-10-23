
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Medicamento implements PrecoVenda, Icms{
    private String codigo;
    private String nome;
    private Double precoFornecedor;
    private Fornecedor fornecedor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(Double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public Medicamento(String codigo, String nome, Double precoFornecedor, Fornecedor fornecedor){
        this.codigo=codigo;
        this.nome=nome;
        this.precoFornecedor=precoFornecedor;
        this.fornecedor=fornecedor;
    }
    
    public Double calculaIcms(){
        return(precoFornecedor * ALIQUOTA);
    } 
    
    public Double precoFinal(){
        return(precoFornecedor + calculaIcms());
    }
    
    @Override
    public String toString(){
        return  "\nCódigo:"+ getCodigo()+
                "\nNome:"+ getNome()+
                "\nNota Fiscal do Fornecedor:"+ getPrecoFornecedor()+
                "\nFornecedor:"+ getFornecedor()+
                "\nAliquota"+ ALIQUOTA;
    }
}
