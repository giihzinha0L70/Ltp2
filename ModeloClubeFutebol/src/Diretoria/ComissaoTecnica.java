
package Diretoria;

/**
 *
 * @author 363707
 */
public class ComissaoTecnica {
    private String nome;
    private String qtdeMembros;
    private Treino treino;
    private Elenco elenco;
    private Olheiro olheiro;
    private Calendario calendario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdeMembros() {
        return qtdeMembros;
    }

    public void setQtdeMembros(String qtdeMembros) {
        this.qtdeMembros = qtdeMembros;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public Olheiro getOlheiro() {
        return olheiro;
    }

    public void setOlheiro(Olheiro olheiro) {
        this.olheiro = olheiro;
    }

    public Calendario getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendario calendario) {
        this.calendario = calendario;
    }
    
    public ComissaoTecnica(String nome, String qtdeMembros, Treino treino, 
            Elenco elenco, Olheiro olheiro, Calendario calendario){
        
        this.nome=nome;
        this.qtdeMembros=qtdeMembros;
        this.treino=treino;
        this.elenco=elenco;
        this.olheiro=olheiro;
        this.calendario=calendario;
    }
    
    @Override
    public String toString(){
        return  "\n Nome:" + getNome()+
                "\n Quantidade de Membros:" + getQtdeMembros()+
                "\n Treino:" + getTreino()+
                "\n Elenco:" + getElenco()+
                "\n Olheiro:" + getOlheiro()+
                "\n Calwndário:" + getCalendario();
        
    }
}
