
package ModeloProduto;

/**
 *
 * @author 363707
 */
public class Fisica extends Pessoa{
    private String Cpf;
    private DoCliente doCliente;

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public DoCliente getDoCliente() {
        return doCliente;
    }

    public void setDoCliente(DoCliente doCliente) {
        this.doCliente = doCliente;
    }
    
    public Fisica(String nome, Double altura, Double peso, int anoNasc, int anoAtual, Endereco endereco, String Cpf, DoCliente doCliente){
        super(nome, altura, peso, anoNasc, anoAtual, endereco);
        this.Cpf=Cpf;
        this.doCliente=doCliente;
    }
    
    @Override
    public Double pesoIdeal(){
        return  ((((altura * altura) * peso) /2));
    }
    
    @Override
    public int idade(){
        return  (anoAtual-anoNasc);
    }
    
    @Override
    public String toString(){
        return  "\n --- Sobre o Veículo Ônibus ---"+
                "\n Nome:" + getNome() + 
                "\n Altura:" + getAltura()+
                "\n Peso:" + getPeso()+
                "\n Ano de Nascimento:" + getAnoNasc()+
                "\n Ano Atual:" + getAnoAtual()+
                "\n Endereço:" + getEndereco()+
                "\n CPF:" + getCpf()+
                "\n Nota Fiscal do Cliente:" + getDoCliente()+
                "\n Peso Ideal:" + pesoIdeal()+
                "\n Idade:" + idade();
    }
}
