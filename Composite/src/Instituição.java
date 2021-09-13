import java.util.ArrayList;
import java.util.List;

public class Instituição extends Participante {

    private final String nome;
    private final List<Participante> membros;

    public Instituição(String nome) {
        this.nome = nome;
        membros = new ArrayList<>();
    }

    @Override
    public void adicionar(Participante participante) {
        membros.add(participante);
    }

    @Override
    public void remover(Participante participante) {
        membros.remove(participante);
    }

    @Override
    public Participante getFilho(int index) {
        return membros.get(index);
    }

    @Override
    public String getNome() {
        return nome;
    }

    public List getMembros() {
        return membros;
    }

    @Override
    public String toString() {
        return "Instituição: " + this.nome;
    }

    public void imprimeMembros() {
        for (Participante membro : membros) {
            System.out.println(membro + " - Instituição: " + this.nome);
        }
    }
}