
package herancaAssociacaoPessoa;

/**
 *
 * @author 363707
 */
public class TestaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Marceneiro M = new Marceneiro("Matheus Dias", "6358", "design de interiores", 
                new Encomenda ("Para maiores de 18", "29/09/2024", 186.33, 
                        new Material ("porta grande", 2, 
                                new Fornecedor ("25687", "Construa Mat"))));
        System.out.println(M);
        
        Engenheiro(String nome, String CREA, Obra obra);
        
    }
    
}
