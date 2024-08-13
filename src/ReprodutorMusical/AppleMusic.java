package ReprodutorMusical;

import Menu.Menu;

public class AppleMusic extends Menu {
    public AppleMusic() {
        super("Apple Music");
    }

    public void tocar() {
        System.out.println("Música em reprodução.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void exibir() {
        System.out.println("Abrindo o aplicativo " + getNome() + ".");
    }
}
