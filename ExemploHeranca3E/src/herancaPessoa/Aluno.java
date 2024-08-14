
package herancaPessoa;

/**
 *
 * @author 363707
 */
public class Aluno extends Pessoa {
    //Variáveis
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    //Construtor
    public Aluno(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    public String toString(){
        return "\n-- Dados do Aluno --" +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nMatricula: " + getMatricula();
    }
}
