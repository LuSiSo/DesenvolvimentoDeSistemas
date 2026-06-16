public class Main {
    public static void main(String[] args) {
        System.out.println("--- Dados do Aluno ---");
        Aluno aluno = new Aluno("Carlos Silva", 20, "A123", 7.5, 5.0);
        aluno.exibirDados();
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());
        System.out.println("Bônus do Aluno: R$ " + aluno.calcularBonus());

        System.out.println("\n--- Dados do Professor ---");
        Professor professor = new Professor("Ana Oliveira", 42, "P456", 5000.0, "Programação");
        professor.exibirDados();
    }
}
