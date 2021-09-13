public class Aluno {

    private final String nome;
    private final Integer codAluno;
    private final String matricula;

    public Aluno(String nome, Integer codAluno, String matricula) {
        this.nome = nome;
        this.codAluno = codAluno;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    @Override
    public String toString() {
        return "Aluno { codigo: " + codAluno + ", matricula: " + matricula + ", nome: " + nome + " }";
    }
}
