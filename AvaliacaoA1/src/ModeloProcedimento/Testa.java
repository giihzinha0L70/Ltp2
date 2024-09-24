
package ModeloProcedimento;

/**
 * Escola Técnica de Brasília - ETB
 * Professor: Vinícius
 * Aluna: Giovanna Gomes
 * Turma:3E
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atendente A = new Atendente("363.252.965-88", "Fernanda", 6, 2500, 
                new Consulta (2, "Consulta Rápida", 500, "20.10.24", "14:00", 
                        new Consultorio (10, "Taguatinga Centro")));
        System.out.println(A);
        
        Medico M = new Medico("587.244.965-22", "David", "00000000-0/DF", "Clínica Médica", 
                new Medicacao (2, "Sob recomendação Médica", 250, "Diminuir a dor", 300, 
                        new Medicamento ("Morfina", 250)), 
                new Exame (7, "Feito só com horário marcado", 300, "25.10.24", 
                        new Consultorio (23, "Avenida das Águas/Águas-Claras")), 
                new Consulta (8, "Obedeça o Médico Responsável", 255, "27.09.24", "15:30", 
                        new Consultorio (16, "Avenida das Águas/Águas-Claras")));
        System.out.println(M);
        
        Paciente P = new Paciente("252.363.141.12", "Joana", "Mansões Por do Sol", "(99)99999-9999", 
                new Prontuario (6, 
                        new Medico ("569.471.230.30", "David", "00000000-0/DF", "Clínica Médica", 
                                new Medicacao (2, "...", 270, "Fortalecer o Corpo", 302, 
                                        new Medicamento ("Vitamina C", 3)), 
                                        new Exame (3, "...", 150, "22.11.24", 
                                                new Consultorio (2, "Recanto d/Emas 14, lote 4")), 
                                        new Consulta (4, "...", 200, "11.11.24", "07:00", 
                                                new Consultorio (6, "Mansões Por do Sol")))), 
                                        new PlanoDeSaude ("12.345.678/0001-00", "Maria", "e-mail"));
                                        System.out.println(P);
    }
    
}
