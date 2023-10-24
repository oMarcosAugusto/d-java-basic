
public class User {
    private static int novoCanal;

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        
        smartTv.mudarCanal(novoCanal);
        smartTv.aumentarCanal();
      

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
                System.out.println("TV ligada? " + smartTv.ligada);

    }
}
