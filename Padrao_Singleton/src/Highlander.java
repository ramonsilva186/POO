public class Highlander {

    private static int contChamadas = 0;
    private static Highlander instancia;

    private Highlander(){}

    public static Highlander obterInstancia(){
        contChamadas++;
        if (instancia == null){
            instancia = new Highlander();
        }
        return instancia;
    }

    public static int getContChamadas() {
        return contChamadas;
    }

    public int pegaChamadas() {
        return contChamadas;
    }
}
