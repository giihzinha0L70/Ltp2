package herancaPessoa;

/**
 *
 * @author 363707
 */
public class Funcionario extends Pessoa{
    //Variáveis
    private String cargo;
    private double salario;

    //Refatoração
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Construtor
    public Funcionario(String nome, String cpf, String cargo, Double salario){
        super(nome, cpf);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String toString(){
        return "-- Dados do Funcionário --" +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nCargo: " + getCargo() +
                "\nSalário: " + getSalario();
    }
}
