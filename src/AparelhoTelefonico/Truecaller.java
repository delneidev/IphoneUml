package AparelhoTelefonico;

import Menu.Menu;

public abstract class Truecaller extends Menu {
    public Truecaller(String nome) {
        super(nome);
    }

    public abstract void ligar(String numero);

    public abstract void atender();

    public abstract void iniciarCorreioVoz();
}
