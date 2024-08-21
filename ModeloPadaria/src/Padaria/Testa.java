
package Padaria;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Padaria p = new Padaria("XX. XXX. XXX/0001-XX", "Pão Quentinho", "+55(61) 9 9999-9999",
                        new Produto("7890000000000", "Pão", 0.60, 
                                new Fornecedor("36. 685. 642/0001-XX", "Master Pão", "+55 (61) 9 6584-3274", 
                                        new Endereco("Avenida Jequitibá", 14, 
                                                new Cep("95555-000"))), 
                                new TipoProduto("O pão é preparado com farinha de trig, cereal, água e sal")),
                        new Cliente("123.456.789-09", "João dos Santos", 22), 
                        new Endereco("Avenida Parque Águas Claras", 07,
                                                new Cep("99534-123")));
        System.out.println(p);
    }
    
}
