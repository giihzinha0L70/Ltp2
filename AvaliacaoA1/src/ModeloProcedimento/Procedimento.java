
package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Procedimento {
    private int numero;
    private String descricao;
    private double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public Procedimento(int numero, String descricao, double valor){
        this.numero=numero;
        this.descricao=descricao;
        this.valor=valor;
    }
    
    @Override
    public String toString(){
        return  "\n --- PROCEDIMENTO ---"+
                "\n Número:" + getNumero()+
                "\n Descrição:" + getDescricao()+
                "\n Valor:" + getValor();
    }
}
