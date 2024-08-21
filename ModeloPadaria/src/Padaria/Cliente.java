
package Padaria;

/**
 *
 * @author 363707
 */
public class Cliente {
    private String cpf;
    private String nome;
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cliente(String cpf, String nome, int idade){
        this.cpf=cpf;
        this.nome=nome;
        this.idade=idade;
    }
    
    @Override
    public String toString(){
        return  "\n CPF:" + getCpf()+
                "\n Nome:" + getNome()+
                "\n Idade:" + getIdade();
    }
}
