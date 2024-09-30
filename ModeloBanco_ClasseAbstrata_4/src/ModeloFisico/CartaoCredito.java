
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class CartaoCredito {
    private int numero;
    private String dataCriacao;
    protected static Double valorDaCompra;
    private TransacaoCartao transacaoCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Double getValorDaCompra() {
        return valorDaCompra;
    }

    public void setValorDaCompra(Double valorDaCompra) {
        this.valorDaCompra = valorDaCompra;
    }

    public TransacaoCartao getTransacaoCartao() {
        return transacaoCartao;
    }

    public void setTransacaoCartao(TransacaoCartao transacaoCartao) {
        this.transacaoCartao = transacaoCartao;
    }
    
    public CartaoCredito(int numero, String dataCriacao, Double valorDaCompra, TransacaoCartao transacaoCartao){
        this.numero=numero;
        this.dataCriacao=dataCriacao;
        this.valorDaCompra=valorDaCompra;
        this.transacaoCartao=transacaoCartao;
    }
    
    public static Double saldoParcial(){
        return (Fisica.saldoAtual() - valorDaCompra);
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Data de Criação:" + getDataCriacao()+
                "\n Valor da Compra:" + getValorDaCompra()+
                "\n Transação do Cartão:" + getTransacaoCartao();
    }
}
