import com.katyusco.padroes.adpater.servicos.Fio;
import com.katyusco.padroes.adpater.servicos.ServicoTomada3Pinos;

/**
 * @author Ramon Silva
 */

public class AdapterTomada extends ServicoTomada3Pinos implements InterfaceTomada2Pinos{

    public AdapterTomada(Fio pinoFase, Fio pinoNeutro) {
        super(pinoFase, pinoNeutro, pinoNeutro);
    }

    public void conectar(){
        this.forneceEnergia();
    }

}
