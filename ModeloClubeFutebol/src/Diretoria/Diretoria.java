
package Diretoria;

/**
 *
 * @author 363707
 */
public class Diretoria {
    private String nome;
    private Funcionario funcionario;
    private ComissaoTecnica comissaoTecnica;
    private Receita receita;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ComissaoTecnica getComissaoTecnica() {
        return comissaoTecnica;
    }

    public void setComissaoTecnica(ComissaoTecnica comissaoTecnica) {
        this.comissaoTecnica = comissaoTecnica;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }
    
    public Diretoria(String nome, Funcionario funcionario, ComissaoTecnica comissaoTecnica, Receita receita){
        this.nome=nome;
        this.funcionario=funcionario;
        this.comissaoTecnica=comissaoTecnica;
        this.receita=receita;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Funcionário:" + getFuncionario()+
                "\n Comissão Técnica:" + getComissaoTecnica()+
                "\n Receita:" + getReceita();
    }
}
