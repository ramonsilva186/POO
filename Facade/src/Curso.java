import java.util.Objects;

public class Curso {

    private final String nomeCurso;
    private final Integer codCurso;

    public Curso(String nomeCurso, Integer codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Curso other = (Curso) o;
        return Objects.equals(codCurso, other.codCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

}
