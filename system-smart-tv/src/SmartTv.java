import java.util.Scanner;

public class SmartTv {
    
    boolean ligada = false;
    int     volume = 25;
    int     canal  = 1;

     public void mudarCanal(int novoCanal){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o novo canal: ");
        int test = sc.nextInt();

        this.canal = test;
        System.out.println("Canal alterado para: " + test);
    }

    public void aumentarCanal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja aumentar o canal? (Sim ou Nao): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("Sim")) {
            canal++;
            System.out.println("Canal alterado novamente para o canal: " + canal);
        } else {
            System.out.println("O canal nao foi alterado");
        }
    }
    public void diminuirCanal(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Deseja diminuir o canal? (Sim ou Nao): ");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("Sim")) {
            canal--;
        } else {
            System.out.println("Canal atual : " + canal);
        }
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    
}
