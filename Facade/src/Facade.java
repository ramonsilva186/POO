import java.util.ArrayList;
import java.util.List;

public class Facade {

    public Turma matricular(Integer codAluno, Integer codCurso, Turma turma) {
        if (turma == null) {
            turma = new Turma();
            Curso c = Escola.getCurso(codCurso);
            for (Turma t : Escola.turmas) {
                if (t.getCurso() == c) {
                    turma = t;
                }
            }
        }
        Aluno rex = Escola.getAluno(codAluno);
        turma.addAluno(rex);
        return turma;
    }

    public void exibirStatus(Turma turma) {
        System.out.println(turma.getCurso().getNomeCurso());
        turma.getAlunos().forEach(System.out::println);
    }

    public List<Turma> inicializarSubsistemas(){

        Aluno a1  = new Aluno("Ramon Silva", 1, "20211001");
        Aluno a2  = new Aluno("Leandro Silva", 2, "20211002");
        Aluno a3  = new Aluno("Elly Santos", 3, "20211003");
        Aluno a4  = new Aluno("Laudivan Gouveia", 4, "20211004");
        Aluno a5  = new Aluno("Meyre Barros", 5, "20211005");

        Curso c1 = new Curso("Engenharia de Computação", 123);
        Curso c2 = new Curso("Engenharia de Mecanica", 124);

        Turma t1 = new Turma(c1);
        Turma t2 = new Turma(c2);

        Escola.addAluno(a1);
        Escola.addAluno(a2);
        Escola.addAluno(a3);
        Escola.addAluno(a4);
        Escola.addAluno(a5);

        Escola.addCurso(c1);
        Escola.addCurso(c2);

        Escola.addTurma(t1);
        Escola.addTurma(t2);

        List<Turma> lista = new ArrayList<>();

        lista.add(t1);
        lista.add(t2);

        return lista;

    }
}
