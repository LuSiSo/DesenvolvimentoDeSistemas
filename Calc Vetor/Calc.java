import java.util.Scanner;

public class CalculadoraVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner escolhaMetodo = new Scanner(System.in);

        double[] registros = new double[10];

        int posicao = 0;
        boolean ativo = true;
        double resultado = 0;

        while (ativo) {
            
            System.out.println("Informe o primeiro número:");
            double primeiroNumero = input.nextDouble();
            
            System.out.println("Informe o segundo número:");
            double segundoNumero = input.nextDouble();
            
            System.out.println("Qual operação deseja realizar?\n 1) Adição \n 2) Subtração \n 3) Multiplicação \n 4) Divisão");
            int operacao = escolhaMetodo.nextInt();
            
            switch (operacao) {
                case 1:
                    resultado = primeiroNumero + segundoNumero;
                    System.out.println("Resultado da adição: " + resultado);
                    registros[posicao] = resultado;
                    break;
                    
                case 2:
                    resultado = primeiroNumero - segundoNumero;
                    System.out.println("Resultado da subtração: " + resultado);
                    registros[posicao] = resultado;
                    break;
                        
                case 3:
                    resultado = primeiroNumero * segundoNumero;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    registros[posicao] = resultado;
                    break;
                            

                case 4:
                    resultado = primeiroNumero / segundoNumero;
                    System.out.println("Resultado da divisão: " + resultado);
                    registros[posicao] = resultado;
                    break;
                                 
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            System.out.println("Deseja continuar?\n 1 -> Sim\n 2 -> Não");
            int decisao = escolhaMetodo.nextInt();
            if (decisao == 1) {
                continue;
            } else {
                System.out.println("Até logo!");
                ativo = false;
            }

            if (posicao != 9) {
                posicao++;
            }
            
            System.out.println("Gostaria de verificar o histórico?");
            String consultaHistorico = input.nextLine().toLowerCase();
            if (consultaHistorico.equals("sim")) {
                System.out.println("Qual das 10 últimas operações você gostaria de ver?");
                int local = input.nextInt();
                System.out.println(registros[local]);
            } else {
                continue;
            }
        }
        
        input.close();
        escolhaMetodo.close();
    }
}
