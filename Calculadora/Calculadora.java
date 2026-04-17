package jaaj;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int[] resultados = new int[10];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < resultados.length; i++) {
            int resultado = 0;
            
            System.out.println("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
        
            System.out.println("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
        
            System.out.println("Qual operação você deseja realizar (+, -, *, /, %)?");
            char operacao = scanner.next().charAt(0);
        
            switch (operacao) {
                case '+':
                    resultado = numero1 + numero2;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case '/':
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case '%':
                    resultado = numero1 % numero2;
                    System.out.println("Resultado do módulo: " + resultado);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            
            resultados[i] = resultado;
        }
        
        System.out.println("Resultados das últimas operações:");
        for (int i = 0; i < resultados.length; i++) {
            System.out.print(resultados[i] + " ");
        }
        
        scanner.close();
    }
}
