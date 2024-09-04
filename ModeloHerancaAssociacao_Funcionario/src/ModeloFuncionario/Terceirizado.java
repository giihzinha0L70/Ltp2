
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Terceirizado extends Funcionario{
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Terceirizado(String nome, Formacao formacao, Endereco endereco, String cargo){
        super(nome, formacao, endereco);
        this.cargo=cargo;
    }
    
    @Override
    public String toString(){
        return  "\n Nome do Funcionário:" + getNome()+
                "\n Formação:" + getFormacao()+
                "\n Endereço:" + getEndereco()+
                "\n Cargo:" + getCargo();
    }
}
