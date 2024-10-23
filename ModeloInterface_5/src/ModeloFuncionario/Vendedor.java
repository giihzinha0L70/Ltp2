
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Vendedor extends Funcionario implements PercentInss, Pagamento{
    private int idade;
    private Cliente cliente;
    private Medicamento medicamento;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
     public Vendedor(String matr, String nome, Double salario, Endereco endereco, int idade, Cliente cliente, Medicamento medicamento){
        super(matr, nome, salario, endereco);
        this.idade=idade;
        this.cliente=cliente;
        this.medicamento=medicamento;
    }
     
    @Override
    public Double Inss(){
        return(salario * PERCVENDEDOR);
    }
    
    public Double comissao(){
        return(DoCliente.preco * PERCVENDEDOR);
    }
    
    @Override
    public Double salarioFinal(){
        return(salario + comissao() - (salario * PERCVENDEDOR));
    }
    
    @Override
    public String toString(){
        return  "\nMatrícula:"+ getMatr()+
                "\nNome:"+ getNome()+
                "\nSalário:"+ getSalario()+
                "\nEndereço:"+ getEndereco()+
                "\nIdade:"+ getIdade()+
                "\nCliente:"+ getCliente()+
                "\nMedicamento:"+ getMedicamento();
    }
}
