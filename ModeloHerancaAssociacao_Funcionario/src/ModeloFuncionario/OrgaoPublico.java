
package ModeloFuncionario;

/**
 *
 * @author 363707
 */
public class OrgaoPublico {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public OrgaoPublico(String nome){
        this.nome=nome;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome();
    }
}
