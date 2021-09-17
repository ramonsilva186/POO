import com.katyusco.padroes.adpater.servicos.Fio;

/**
 * @author Ramon Silva
 */

public class ClientePlugParaTomada2Pinos {

    public static void main(String[] args) {
        AdapterTomada tomada = new AdapterTomada(Fio.FASE, Fio.NEUTRO);
        tomada.conectar();
    }
}
