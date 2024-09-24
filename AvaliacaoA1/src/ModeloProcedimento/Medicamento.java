package ModeloProcedimento;

/**
 *
 * @author yurif
 */
public class Medicamento {
    private String nome;
    private double dosagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDosagem() {
        return dosagem;
    }

    public void setDosagem(double dosagem) {
        this.dosagem = dosagem;
    }
    
    public Medicamento(String nome, int dosagem){
        this.nome=nome;
        this.dosagem=dosagem;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" +getNome()+
                "\n Dosagem:" +getDosagem();
    }
}
