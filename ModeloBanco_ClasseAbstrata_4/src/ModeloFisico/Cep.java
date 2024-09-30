
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class Cep {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Cep(String numero){
        this.numero=numero;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" +  getNumero();
    }
}
