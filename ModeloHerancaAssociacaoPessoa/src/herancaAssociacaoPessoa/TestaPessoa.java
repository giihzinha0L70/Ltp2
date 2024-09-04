
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
        
        Engenheiro E = new Engenheiro("Jorge","12345-DF", 
                new Obra ("Você paga pela qualidade", "Rua das Flores - 16", 
                        new Material ("tijolos", 500, 
                                new Fornecedor ("6935-521", "Só Tijolos")), 
                        new Cliente ("Maria Soares da Silva", "261.998.765-35", "Maria da Conceição, casa 05")));
        System.out.println(E);
      
    }
    
}
