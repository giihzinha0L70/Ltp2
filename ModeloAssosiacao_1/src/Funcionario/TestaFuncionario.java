
package Funcionario;

/**
 *
 * @author 363707
 */
public class TestaFuncionario {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("363707", "Vivian", 
                new Residencia("Maria das Graças/Avn15",
                new Porta(1.5, 0.6)), 
                new Veiculo ("Gol",
                new Porta(1.5, 0.6))); 
        
        System.out.println(f);        
    }
    
}
