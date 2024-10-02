
package ModeloFisico;

/**
 *
 * @author 363707
 */
public class TestaFisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fisica F = new Fisica(1200.0, "Maria", "(99)99999-9999", 500.0, 500.0, 
                new Endereco("Rua das Rosas", 14, 
                        new Cep("01001-000")), 
                new CartaoCredito(89, "02.10.24", 500.0, 
                        new TransacaoCartao(99, 500.0)), 
                new Conta(98, 1200.0, 
                        new Transacao("Cartão de Crédito", 500.0), 
                        new Agencia(77, "Banco do Brasil")), "010.332.947.01");
        System.out.println(F);
    }
    
}
