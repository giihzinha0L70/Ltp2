
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class DoFornecedor extends NotaFiscal{
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    
   public DoFornecedor(int numero, String data, Double valorInicial, String dataValidade){
       super(numero, data, valorInicial);
       this.dataValidade=dataValidade;
   } 
   
    @Override
    public Double valorFinal(){
        return (valorInicial * 0.72);
    }
    
    @Override
    public String toString() {
        return "\n\n --- Dados da Nota Fiscal do Fornecedor ---"+
                "\n Número:" + getNumero()+
                "\n Data:" + getData()+
                "\n Valor Inicial:" + getValorInicial()+
                "\n Data da Validade:" + getDataValidade();
    }
     
}
