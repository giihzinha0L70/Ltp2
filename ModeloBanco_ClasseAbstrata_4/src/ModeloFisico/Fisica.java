
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class Fisica extends Pessoa{
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public Fisica(Double saldo, String nome, String telefone, Double limite, 
                    Double valorGasto, Endereco endereco, CartaoCredito cartaoCredito, Conta conta, String cpf){
        super(saldo, nome, telefone, limite, valorGasto, endereco, cartaoCredito, conta);
        this.cpf=cpf;
    }
    
     public static Double saldoAtual(){
        return (saldo - valorGasto);
    }
    
    @Override
     public String toString(){
         return  "\n Saldo:" + getSaldo()+
                 "\n Nome:" + getNome()+
                 "\n Telefone:" + getTelefone()+
                 "\n Limite:" + getLimite()+
                 "\n Valor Gasto:" + getValorGasto()+
                 "\n Endereço:" + getEndereco()+
                 "\n Cartão de Crédito:" + getCartaoCredito()+
                 "\n Conta:" + getConta()+
                 "\n\n CPF:" + getCpf();
     }
}
