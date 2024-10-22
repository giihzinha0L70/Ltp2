
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public class Funcionario extends Pessoa implements Comissao{
    private int matr;
    private Double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public Double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Double valorComissao) {
        this.valorComissao = valorComissao;
    }
    
    public Funcionario(String cpf, String nome, Endereco endereco, int matr, Double valorComissao){
        super(cpf, nome, endereco);
        this.matr=matr;
        this.valorComissao=valorComissao;
    }
    
    @Override
     public Double calculaSalComissao(){
        return(SAL + valorComissao);
    }
    
    @Override
    public String toString(){
        return  "\nCPF:"+ getCpf()+
                "\nNome:"+ getNome()+
                "\nEndereço:"+ getEndereco()+
                "\nMatrícula:"+ getMatr()+
                "\nValor da Comissão:"+ getValorComissao()+
                "\nSal:"+ SAL;
    }
}
