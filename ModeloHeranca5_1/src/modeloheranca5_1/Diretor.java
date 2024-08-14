
package modeloheranca5_1;

/**
 *
 * @author 363707
 */
public class Diretor extends Funcionario{
    private Double gratificacao;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public Diretor (String nome, String endereco, int matr, Double salario, Double gratificacao){
        super(nome, endereco, matr, salario);
        this.gratificacao = gratificacao;
        
    }
     public String toString(){
        return"--- DIRETOR ---"+
                "\nNome: "+getNome()+
                "\nEndereco : "+getEndereco()+
                "\nMatr: "+getMatr()+
                "\nSalário: "+getSalario()+
                "\nGratificação: "+getGratificacao();
    }
}
