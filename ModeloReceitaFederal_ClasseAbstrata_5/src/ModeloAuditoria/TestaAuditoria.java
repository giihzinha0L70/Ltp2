
package ModeloAuditoria;

/**
 *
 * @author 363707
 */
public class TestaAuditoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auditor Aud = new Auditor(7, "Pedro", 1200.0, 
                new Endereco("Rua das Rosas", 14), 300.0, 
                new Auditoria(5, "21.10.24"));
        System.out.println(Aud);
        
        Atendente Aten = new Atendente(8, "Maria", 1500.0, 
                new Endereco("Rua da Conceição", 12), "Bancário", 
                new Fisica("João", 
                        new Endereco("Josefina", 33), "653.225.654-00", 
                        new ParaPessoaFisica(4, 2023, 2000.0, 
                                new Deducao(22, "...", 500.0), 
                                new Pagamento(44, "...", 350.0), 
                                new Bens(63, "...", 632.1), 5520.8, 
                                new Dependente(32, "Júlia", 25))));
        System.out.println(Aten);
        
        Juridica Jur = new Juridica("Flávia", 
                new Endereco("Maria das Graças", 26), "6666", 
                new ParaPessoaJuridica(6, 2002, 10000.5, 
                        new Deducao(63, "...", 525.5), 
                        new Pagamento(32, "...", 756.3), 
                        new Bens(72, "...", 750.0), "Nenhuma!"));
        System.out.println(Jur);       
        
    }
    
}
