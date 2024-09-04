
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class Funcionario {
    private String nome;
    private Formacao formacao;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
     public Funcionario(String nome, Formacao formacao, Endereco endereco){
        this.nome=nome;
        this.formacao=formacao;
        this.endereco=endereco;
    }
}
