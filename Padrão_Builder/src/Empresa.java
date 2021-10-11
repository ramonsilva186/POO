public class Empresa {

    private final Pessoa NomeRes;

    public Empresa() {
        this.NomeRes = new Pessoa();
    }

    public Pessoa getNomeRes() {
        return NomeRes;
    }

    @Override
    public String toString() {
        return "Empresa {" +
                "NomeRes= " + this.getNomeRes().getNome() + " |" +
                " Identidade= " + this.getNomeRes().getId() +
                "}";
    }
}
