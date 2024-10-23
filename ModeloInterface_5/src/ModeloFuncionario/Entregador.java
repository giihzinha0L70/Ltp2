
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Entregador extends Funcionario implements PercentInss, Pagamento{
    private String veiculoUtilizado;
    private Medicamento medicamento;

    public String getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public void setVeiculoUtilizado(String veiculoUtilizado) {
        this.veiculoUtilizado = veiculoUtilizado;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public Entregador(String matr, String nome, Double salario, Endereco endereco, String veiculoUtilizado, Medicamento medicamento){
        super(matr, nome, salario, endereco);
        this.veiculoUtilizado=veiculoUtilizado;
        this.medicamento=medicamento;
    }
    
    @Override
    public Double Inss(){
        return(salario * PERCENTREGADOR);
    }
    @Override
    public Double salarioFinal(){
        return(salario - (salario * PERCENTREGADOR));
    }
    
    @Override
    public String toString(){
        return  "\nMatrícula:"+ getMatr()+
                "\nNome:"+ getNome()+
                "\nSalário:"+ getSalario()+
                "\nEndereço:"+ getEndereco()+
                "\nVeículo Utilizado:"+ getVeiculoUtilizado()+
                "\nMedicamento:"+  getMedicamento();
    }
}
