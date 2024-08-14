
package modeloheranca5_1;

/**
 *
 * @author 363707
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor V = new Vendedor("Jorge", "Mansões por do Sol", 2356, 200.25, "Hortifrutes", 6500.0, 552.2);
        System.out.println(V);
        
        Diretor D = new Diretor("Jackson", "Rua-22", 6584, 3544.6, 5489.6);
        System.out.println(D);
        
        PessoaFisica PF= new PessoaFisica("Tori", "Cidade de Deus", 64, "658.547-85");
        System.out.println(PF);
        
        PessoaJuridica PJ = new PessoaJuridica("Matheus", "Chácara-12", 89, "635.326-99");
        System.out.println(PJ);
    }
    
}
