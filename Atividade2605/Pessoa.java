public abstract class Pessoa {
    private String nome;
    private int iadd; // Mantido de acordo com o diagrama (idade)
    private String matricula;

    public Pessoa(String nome, int idade, String matricula) {
        this.nome = nome;
        this.iadd = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return iadd;
    }

    public void setIdade(int idade) {
        this.iadd = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + iadd);
        System.out.println("Matrícula: " + matricula);
    }

    public abstract double calcularBonus();
}
