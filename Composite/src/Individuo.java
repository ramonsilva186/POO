public class Individuo extends Participante {

    private final String nome;
    private final int assento;

    public Individuo(String nome, int assento) {
        this.nome = nome;
        this.assento = assento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getAssento() {
        return assento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Assento: " + this.assento;
    }
}