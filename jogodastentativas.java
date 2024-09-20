
import java.util.Random;
import java.util.Scanner;

public class jogodastentativas {

    public static void main(String[] args) {
        System.out.println("""
                Seja bem vindo ao jogo das tentativas! Nesse jogo, você deve digitar um numero de 1 a 100! Você tem 10 tentativas! Bom jogo!
                """);

        Scanner lerTeclado = new Scanner(System.in);

        Random geradorAleatorio = new Random();
        int numeroComputador = geradorAleatorio.nextInt(101);

        int contador = 0;

        while (contador < 10) {
            System.out.println("Digite o número escolhido: ");
            int numeroUsuario = lerTeclado.nextInt();
            contador ++;

            if (numeroUsuario > numeroComputador) {
                System.out.println("Seu número é menor! Tente novamente");
            } else if (numeroUsuario < numeroComputador) {
                System.out.println("Seu número é maior! Tente novamente");
            } else if (numeroUsuario == numeroComputador) {
                System.out.println("Parabéns, você venceu!! Seu numero de tentativas foi: " + contador);
                break;
            }

            if (contador == 10) {
                System.out.println("Você perdeu! Tente novamente!");
                break;
            }
        }
    }

}
