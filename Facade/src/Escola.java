import java.util.ArrayList;
import java.util.List;

public interface Escola {

    List<Curso> cursos = new ArrayList<>();
    List<Turma> turmas = new ArrayList<>();
    List<Aluno> alunos = new ArrayList<>();

    static Curso getCurso(Integer codigo) {
        Curso curso = null;
        for (Curso c : cursos) {
            if (c.getCodCurso().equals(codigo))
                curso = c;
        }
        return curso;
    }

    static Aluno getAluno(Integer codigo) {
        Aluno a = null;
        for (Aluno aluno : alunos) {
            if(aluno.getCodAluno().equals(codigo))
                a = aluno;
        }
        return a;
    }

    static void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    static void addCurso(Curso curso) {
        cursos.add(curso);
    }

    static void addTurma(Turma turma) {
        turmas.add(turma);
    }
}
