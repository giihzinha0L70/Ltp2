
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public abstract class Funcionario {
    private String matr;
    private String nome;
    protected static Double salario;
    private Endereco endereco;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Funcionario(String matr, String nome, Double salario, Endereco endereco){
        this.matr=matr;
        this.nome=nome;
        this.salario=salario;
        this.endereco=endereco;
    }
    
    @Override
    public abstract String toString();

    public abstract Double Inss();
}
