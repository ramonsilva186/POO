import java.util.ArrayList;
import java.util.List;

public class Congresso {

    private final String nome;
    private final int totalAssentos;
    private final List <Participante> participantes;

    public Congresso(String nome, int totalAssentos) {
        this.nome = nome;
        this.totalAssentos = totalAssentos;
        participantes = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public int getTotalAssentos() {
        return totalAssentos - getTotalParticipantes();
    }

    public int getTotalParticipantes() {
        int totalParticipantes = 0;

        for (Participante participante : participantes) {
            if (participante instanceof Individuo) {
                totalParticipantes++;

            } else if (participante instanceof Instituição) {
                Instituição instituicao = (Instituição) participante;
                totalParticipantes += instituicao.getMembros().size();
            }
        }
        return totalParticipantes;
    }

    public void adicionarParticipante(Participante participante) {

        if (participante instanceof Individuo) {

            if (totalAssentos > participantes.size()) {
                participantes.add(participante);
            } else {
                throw new UnsupportedOperationException("Congresso não possui assentos livres!");
            }

        } else if (participante instanceof Instituição) {

            Instituição t = (Instituição) participante;

            if (totalAssentos > participantes.size() + t.getMembros().size()) {
                participantes.add(participante);
            } else {
                throw new UnsupportedOperationException("Não possui quantidade de assentos livres para a Instituição ");
            }
        }
    }

    public void imprimeParticipantes() {
        System.out.println();
        System.out.println("----- Participantes -----");
        System.out.println();

        for (Participante participante : participantes) {
            if (participante instanceof Individuo) {
                System.out.println(participante + " - Instituição: Sem Filiação");

            } else if (participante instanceof Instituição) {
                Instituição instituicao = (Instituição) participante;
                instituicao.imprimeMembros();
            }
        }
    }

    @Override
    public String toString() {
        return "\n" + getNome() + " - Assentos: " + this.totalAssentos
                + " - Participantes: " + getTotalParticipantes()
                + " - Total de Assentos: " + getTotalAssentos();
    }

    public static void main(String[] args) {

        Congresso congresso = new Congresso("Congresso Cientifico", 5);

        Participante Ramon = new Individuo("Ramon Silva", 1);

        Participante Leandro = new Individuo("Leandro Silva", 2);

        congresso.adicionarParticipante(Ramon);
        congresso.adicionarParticipante(Leandro);

        Participante Allan = new Individuo("Allan Bahia", 3);
        Participante IFPB = new Instituição("IFPB");
        IFPB.adicionar(Allan);
        congresso.adicionarParticipante(IFPB);

        System.out.println(congresso);
        congresso.imprimeParticipantes();

        congresso.participantes.remove(Ramon);

        System.out.println(congresso);
        congresso.imprimeParticipantes();

    }
}