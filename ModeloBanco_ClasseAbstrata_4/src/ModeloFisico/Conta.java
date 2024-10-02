
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class Conta {
    private int numConta;
    private Double saldo;
    private Transacao transacao;
    private Agencia agencia;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    public Conta(int numConta, Double saldo, Transacao transacao, Agencia agencia){
        this.numConta=numConta;
        this.saldo=saldo;
        this.transacao=transacao;
        this.agencia=agencia;
    }
    
    public static Double saldoConta(){
        return (TransacaoCartao.saldoFuturo() - TransacaoCartao.valor);
    }
    
    @Override
    public String toString(){
        return  "\n Número da Conta:"+ getNumConta()+
                "\n Saldo:" + getSaldo()+
                "\n Transação:" + getTransacao()+
                "\n\n Agência:" + getAgencia();
    }
}
