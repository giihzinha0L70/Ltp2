
package ModeloFarmacia;

/**
 *
 * @author 363707
 */
public class Pedido {
    private int numero;
    private Double valor;
    private Perfumaria perfumaria;
    private Atendente atendente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Perfumaria getPerfumaria() {
        return perfumaria;
    }

    public void setPerfumaria(Perfumaria perfumaria) {
        this.perfumaria = perfumaria;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
    
    public Pedido(int numero, Double valor, Perfumaria perfumaria, Atendente atendente){
        this.numero=numero;
        this.valor=valor;
        this.perfumaria=perfumaria;
        this.atendente=atendente;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Valor:" + getValor()+
                "\n Perfumaria:" + getPerfumaria()+
                "\n Atendente:" + getAtendente();
    }
}
