
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Contrato {
    private int numero;
    private Double valor;

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
    
    public Contrato(int numero, Double valor){
        this.numero=numero;
        this.valor=valor;
    }
    
    @Override
    public String toString(){
        return  "\n Número:" + getNumero()+
                "\n Valor:" + getValor();
    }
}
