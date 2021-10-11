public class Director {

    public Pessoa buildRes(String nome, String id) {
        BuildPessoa builder = new BuildPessoa();
        builder.BuildNome(nome);
        builder.BuildId(id);
        return builder.getPessoa();
    }

    public Empresa builderEmpresa(String NomeRes, String IdRes) {
        Pessoa res = this.buildRes(NomeRes, IdRes);
        BuildEmpresa builder = new BuildEmpresa();
        builder.BuildNome(res.getNome());
        builder.BuildId(res.getId());
        return builder.getEmpresa();
    }
}
