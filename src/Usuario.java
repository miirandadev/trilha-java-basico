public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("Canal Atual : " + smartTv.canal);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo Status -> Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.mudarDeCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);

       smartTv.aumentarCanal();
       System.out.println("Canal Atual" + smartTv.canal);

    }
}
