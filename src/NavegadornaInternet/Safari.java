package NavegadornaInternet;

import Menu.Menu;

public class Safari extends Menu {
    private String homepage;
    private int numeroDeAbas;

    public Safari(String homepage) {
        super("Safari");
        this.homepage = homepage;
        this.numeroDeAbas = 0;
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        numeroDeAbas++;
        System.out.println("Nova aba adicionada. Total de abas: " + numeroDeAbas);
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void exibir() {
        System.out.println("Abrindo o navegador " + getNome() + ". Página inicial: " + homepage);
    }
}
