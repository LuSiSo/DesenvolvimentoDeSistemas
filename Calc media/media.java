package mynombreescarlo;
import java.util.Scanner;

public class Mynombreescarlo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Coleta de dados do aluno
        System.out.print("Informe o nome do aluno: ");
        String alunoNome = scanner.nextLine();
        
        System.out.print("Informe o nome da escola: ");
        String nomeEscola = scanner.nextLine();
        
        double somaDasNotas = 0;
        int quantidadeDeNotas = 6;
        
        // Loop para captura das notas
        for (int i = 1; i <= quantidadeDeNotas; i++) {
            double nota;
            
            // Validação da nota
            while (true) {
                System.out.print("Digite a nota " + i + " (de 0 a 10): ");
                nota = scanner.nextDouble();
                
                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.println("ERRO! A nota deve estar entre 0 e 10. Tente novamente.");
                }
            }
            
            somaDasNotas += nota;
        }
        
        // Cálculo da média
        double mediaFinal = somaDasNotas / quantidadeDeNotas;
        
        // Exibição do boletim
        System.out.println("\n--- Boletim Escolar ---");
        System.out.println("Escola: " + nomeEscola);
        System.out.println("Aluno: " + alunoNome);
        System.out.println("Média Final: " + mediaFinal);
        
        // Verificação do status do aluno
        if (mediaFinal >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
        
        scanner.close();
    }
}
