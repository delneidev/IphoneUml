package AparelhoTelefonico;

public class TruecallerImpl extends Truecaller {
    public TruecallerImpl() {
        super("Truecaller");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    @Override
    public void exibir() {
        System.out.println("Abrindo o aplicativo " + getNome() + ".");
    }
}
