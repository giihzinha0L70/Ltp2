
package interfacePessoa;

/**
 *
 * @author 363707
 */
public class Professor extends Pessoa implements Imprimivel, EstadoOrigem{
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Professor(String nome, Double salario, String titulo){
        super(nome, salario);
        this.titulo=titulo;
    }
    
    @Override
    public Double calculaSalario(){
        return salario + GRATIFICACAO;
    }
    
    @Override
    public String toString(){
        return  "\n--- Dados da Pessoa ---"+
                "\nNome:" + getNome()+
                "\nTítulo:" + getTitulo()+
                "\nCidade:" + CIDADE+
                "\nEstado:" + ESTADO+
                "\nSalário:" + getSalario()+
                "\nGratificação:" + GRATIFICACAO+
                "\nSalário Final:" + calculaSalario();
    }
}
