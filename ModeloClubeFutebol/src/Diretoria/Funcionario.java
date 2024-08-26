
package Diretoria;

/**
 *
 * @author 363707
 */
public class Funcionario {
    private String cargo;
    private String nome;
    private Double salario;
    private Treino treino;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
    
    public Funcionario(String cargo, String nome, Double salario, Treino treino){
        this.cargo=cargo;
        this.nome=nome;
        this.salario=salario;
        this.treino=treino;        
    }
    
    @Override
    public String toString(){
        return "\n Cargo:"+ getCargo()+
                "\n Nome:" + getNome()+
                "\n Salário:" + getSalario()+
                "\n Treino:" + getTreino();                
    }
}
