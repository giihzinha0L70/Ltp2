
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Analista extends Efetivo{
    private String funcao;
    private double gratificacao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public Analista(String nome, Formacao formacao, Endereco endereco, double salario, String funcao, double gratificacao){
        super(nome, formacao, endereco, salario);
        this.funcao=funcao;
        this.gratificacao=gratificacao;        
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Formação:" + getFormacao()+
                "\n Endereço:" + getEndereco()+
                "\n Salário:" + getSalario()+
                "\n Função:" + getFuncao()+
                "\n Gatificação:" + getGratificacao();
    }
}
