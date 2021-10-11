public class BuildPessoa implements Builder{

    private final Pessoa pessoa;

    public BuildPessoa() {
        this.pessoa = new Pessoa();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    @Override
    public void BuildNome(String nome) {
        this.pessoa.setNome(nome);
    }

    @Override
    public void BuildId(String id) {
        this.pessoa.setId(id);
    }
}
