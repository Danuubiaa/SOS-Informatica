import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SOS INFORMÁTICA =====");
        System.out.println("1 - Computador sem vídeo");
        System.out.println("2 - Internet não funciona");
        System.out.println("3 - Computador lento");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch(opcao){
            case 1:
            System.out.println("Diagnóstico de computador sem vídeo");

            System.out.print("O computador liga? (sim/nao): ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {

            System.out.print("As ventoinhas giram? (sim/nao): ");
            String ventoinha = sc.nextLine();

            if (ventoinha.equalsIgnoreCase("sim")) {
            System.out.println("Verifique o cabo HDMI/VGA e teste outro monitor.");
        } else {
            System.out.println("Verifique a fonte de alimentação.");
        }

        } else {
        System.out.println("Verifique a tomada e a fonte.");
        }
        break;
        
            case 2:
                System.out.println("Diagnóstico de internet");
                break;

            case 3:
                System.out.println("Diagnóstico de computador lento");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}