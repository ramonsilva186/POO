public class JanelaDownload extends JanelaAbstrata {

    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar(){
        desenharJanela("Janela de Download");

        desenharBotao("Botão - Onde o Download deve ser realizado ?");
        desenharBotao("Botão Continuar - Download Sim");
        desenharBotao("Botão Continuar - Download Não");
    }
}
