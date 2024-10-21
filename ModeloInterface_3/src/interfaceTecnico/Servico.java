
package interfaceTecnico;

/**
 *
 * @author 363707
 */
public abstract class Servico {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Servico(String nome){
        this.nome=nome;
    }
    
    public Double TotalPagar(){
        return(valorHora * QTDHORAEXTRA);
    }
    
    @Override
    public abstract String toString();
}
