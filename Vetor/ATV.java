import java.util.Scanner;

public class VetorJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int index = 0;
        double[] temperaturas = new double[10];
        boolean coletandoDados = true;

        System.out.println("Vetor criado! Insira 10 valores:");

        while (coletandoDados) {
            double grau = scanner.nextDouble();
            temperaturas[index] = grau;
            index++;

            if (index == 10) {
                coletandoDados = false;
                System.out.println("Todos os valores foram atribuídos!");
                index--;
            } else {
                System.out.println("Valor atribuído com sucesso!");
            }
        }

        while (index >= 0) {
            System.out.println("Valor número " + (index + 1) + ": " + temperaturas[index]);
            index--;
        }

        scanner.close();
    }
}
