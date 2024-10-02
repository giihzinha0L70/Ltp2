
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class Transacao {
    private String tipo;
    private Double valorTransacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
    
    public Transacao(String tipo, Double valorTransacao){
        this.tipo=tipo;
        this.valorTransacao=valorTransacao;
    }
    
    @Override
    public String toString(){
        return  "\n Tipo:" + getTipo()+
                "\n\n Valor da Transação:" + getValorTransacao();
    }
}
