
package ModeloProduto;

/**
 *
 * @author 363707
 */
public abstract class Pessoa {
    private String nome;
    protected Double altura;
    protected Double peso;
    protected int anoNasc;
    protected int anoAtual;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa(String nome, Double altura, Double peso, int anoNasc, int anoAtual, Endereco endereco){
        this.nome=nome;
        this.altura=altura;
        this.peso=peso;
        this.anoNasc=anoNasc;
        this.anoAtual=anoAtual;
        this.endereco=endereco;
    }
    
    @Override
    public abstract String toString();
    public abstract Double pesoIdeal();
    public abstract int idade();
}
