public class Main {
    public static void main(String[] args) throws Exception {
        int comprimento = 25;

        Iphone iphone = new Iphone();

        // Reprodutor musical
        System.out.println("\nTestando reprodutor musical:\n");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Teatro de Vampiros");

        for (int i = 0; i < comprimento; i++) {
            System.out.print("-*");
        }

        // Aparelho telefônico
        System.out.println("\n\nTestando aparelho telefônico:\n");
        iphone.ligar("(99) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        for (int i = 0; i < comprimento; i++) {
            System.out.print("-*");
        }

        // Navegador de Internet
        System.out.println("\n\nTestando navegador de internet:\n");
        iphone.exibirPagina("https://www.dio.me/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println();

    }
}
