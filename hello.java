import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        // scanner para verificar o que o usuário informar
        Scanner ler = new Scanner(System.in);

        double n1, n2;

        // verificação da primeira nota

        // imprimir o que quero
        System.out.println("Informa a primeira nota:");

        // leitura do valor do usuário
        n1 = ler.nextDouble();

        while ((n1 < 0) || (n1 > 10) || (n1 == -0)) {

            System.out.println("Informa a primeira nota novamente:");
            n1 = ler.nextDouble();
        }

        // verificação da segunda nota
        System.out.println("Informa a segunda nota:");
        n2 = ler.nextDouble();

        while ((n2 < 0.0) || (n2 > 10.0) || (n2 == -0.0)) {

            System.out.println("Informa a segunda nota novamente:");
            n2 = ler.nextDouble();
        }

        double media = (n1 + n2) / 2;

        if (media < 3.0) {
            System.out.println("O aluno foi reprovado");
        } else if ((media >= 3.0) && (media < 6.0)) {
            System.out.println("O aluno está de recuperação");
        }

        else if (media >= 6.0) {
            System.out.println("O aluno está aprovado");
        }

        System.out.println("Conforme a situação informada, dirija-se a secretaria da escola");

    }
}