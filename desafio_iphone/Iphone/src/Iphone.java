public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    private String musicaAtual;
    private String numeroLigacao;
    private String urlPagina;

    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Selecionando musica " + musicaAtual + "...");
    }

    public void ligar(String numero) {
        this.numeroLigacao = numero;
        System.out.println("Ligando para " + numeroLigacao + "...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de Voz...");
    }

    public void exibirPagina(String url) {
        this.urlPagina = url;
        System.out.println("Exibindo Página " + urlPagina + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

}
