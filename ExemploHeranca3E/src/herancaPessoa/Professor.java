package herancaPessoa;

public class Professor extends Pessoa{
    //Variáveis
    private String disciplina;
    private double salario;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Construtor
    public Professor(String nome, String cpf, String disciplina, Double salario){
        super(nome, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    public String toString(){
        return "\n-- Dados do Professor --" +
                "\nNome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nDisciplina: " + getDisciplina() +
                "\nSalario: " + getSalario();
    }
}
