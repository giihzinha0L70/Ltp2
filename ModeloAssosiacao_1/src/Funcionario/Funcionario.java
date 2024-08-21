
package Funcionario;

/**
 *
 * @author 363707
 */
public class Funcionario {
    private String matricula;
    private String nome;
    private Residencia residencia;
    private Veiculo veiculo;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Residencia getResidencia() {
        return residencia;
    }

    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public Funcionario(String matricula, String nome, Residencia residencia, Veiculo veiculo){
    this.matricula=matricula;
    this.nome=nome;    
    this.residencia=residencia;
    this.veiculo=veiculo;
    }
    
    @Override
    public String toString(){
        return "\n Matrícula:" + getMatricula ()+
                "\n Nome:" + getNome ()+
                "\n Residência:" + getResidencia ()+
                "\n Veículo:" + getVeiculo ();
                
    }
}