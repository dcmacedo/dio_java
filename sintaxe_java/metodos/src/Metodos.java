public class Metodos {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada?: " + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada?: " + smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada?: " + smartTv.ligada);
    }
}
