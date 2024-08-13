import java.util.Scanner;
import Menu.Menu;
import ReprodutorMusical.AppleMusic;
import AparelhoTelefonico.TruecallerImpl;
import NavegadornaInternet.Safari;

public class Iphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu smi = null;

        System.out.println("Escolha um aplicativo:");
        System.out.println("1 - Apple Music");
        System.out.println("2 - Safari");
        System.out.println("3 - Truecaller");
        System.out.print("Digite o número da sua escolha: ");

        int appEscolhido = scanner.nextInt();

        switch (appEscolhido) {
            case 1:
                smi = new AppleMusic();
                System.out.println("Você escolheu Apple Music.");
                ((AppleMusic) smi).tocar();
                break;
            case 2:
                smi = new Safari("https://www.exemplo.com");
                System.out.println("Você escolheu Safari.");
                ((Safari) smi).exibirPagina("https://www.exemplo.com");
                break;
            case 3:
                smi = new TruecallerImpl();
                System.out.println("Você escolheu Truecaller.");
                ((TruecallerImpl) smi).ligar("123456789");
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}
