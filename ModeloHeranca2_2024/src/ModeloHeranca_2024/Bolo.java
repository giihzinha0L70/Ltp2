
package ModeloHeranca_2024;

/**
 *
 * @author 363707
 */
public class Bolo extends Produto{
    private String nome;
    private double peso;
    private double preco;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Bolo(String dataFabricacao, String dataValidade, int codigo, String nome, double peso, double preco){
        super(dataFabricacao, dataValidade, codigo);
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
               
    }
    
    @Override
    public String toString(){
          return"--- BOLO ---"+
                "\nDataFabricacao: "+getDataFabricacao ()+
                "\nDataValidade: "+getDataValidade ()+
                "\nCodigo: "+getCodigo ()+
                "\nNome: "+getNome ()+
                "\nPeso: "+getPeso ()+
                "\nPreco: "+getPreco ();
                                
        
    }
}
