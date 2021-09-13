import java.util.ArrayList;
import java.util.List;

public class Turma {

    private final List<Aluno> alunos = new ArrayList<>();
    private Curso curso;

    public Turma(){ }

    public Turma(Curso curso){
        this.curso = curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

}
