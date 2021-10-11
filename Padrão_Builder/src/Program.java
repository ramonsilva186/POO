public class Program {
    public static void main(String[] args) {

        Director director = new Director();

        Empresa empresa = director.builderEmpresa("Ramon", "123");
        Empresa empresa2 = director.builderEmpresa("Leandro", "124");
        Empresa empresa3 = director.builderEmpresa("Elly", "125");
        Empresa empresa4 = director.builderEmpresa("Gustavo", "126");
        Empresa empresa5 = director.builderEmpresa("Nayra", "127");

        System.out.println(empresa);
        System.out.println(empresa2);
        System.out.println(empresa3);
        System.out.println(empresa4);
        System.out.println(empresa5);
    }
}
