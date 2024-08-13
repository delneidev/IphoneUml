package Menu;

public abstract class Menu {
    private String nome;

    public Menu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibir();
}
