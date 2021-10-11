public class BuildEmpresa implements Builder {

    private final Empresa empresa;

    public BuildEmpresa() {
        this.empresa = new Empresa();
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    @Override
    public void BuildNome(String nome) {
        this.empresa.getNomeRes().setNome(nome);
    }

    @Override
    public void BuildId(String id) {
        this.empresa.getNomeRes().setId(id);
    }
}
