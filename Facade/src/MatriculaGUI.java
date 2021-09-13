import java.util.List;

public class MatriculaGUI {

    public static void main(String[] args) {

        List<Turma> lista_turma;
        Facade f = new Facade();

        lista_turma = f.inicializarSubsistemas();

        f.matricular(1,123, null);
        f.matricular(2, 123, null);
        f.matricular(3, 123, null);
        f.matricular(4, 124, null);
        f.matricular(5, 124,null);

        for (Turma i : lista_turma){
            f.exibirStatus(i);
        }
    }
}
