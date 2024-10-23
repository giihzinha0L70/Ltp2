
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;
    private DoCliente doCliente;
    private Medicamento medicamento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DoCliente getDoCliente() {
        return doCliente;
    }

    public void setDoCliente(DoCliente doCliente) {
        this.doCliente = doCliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Cliente(String cpf, String nome, int idade, Endereco endereco, DoCliente doCliente, Medicamento medicamento){
        this.cpf=cpf;
        this.nome=nome;
        this.idade=idade;
        this.endereco=endereco;
        this.doCliente=doCliente;
        this.medicamento=medicamento;
    }
    
    @Override
    public String toString(){
        return  "\nCPF:"+ getCpf()+
                "\nNome:"+ getNome()+
                "\nIdade:"+ getIdade()+
                "\nEndereço:"+ getEndereco()+
                "\nNota Fiscal do Cliente:"+ getDoCliente()+
                "\nMedicamento:"+ getMedicamento();
    }
}
