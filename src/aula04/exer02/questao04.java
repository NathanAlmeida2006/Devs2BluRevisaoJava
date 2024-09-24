package aula04.exer02;

import java.util.Scanner;

public class questao04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaAcesso = 123;
        int tentativas = 0;

        do {
            System.out.println("Digite sua senha: ");
            int senha = sc.nextInt();

            if (senha != senhaAcesso) {
                System.out.println("Senha errada!");
                tentativas++;
            } else {
                System.out.println("Acessou!");
                break;

            }

        } while (tentativas != 3);

        if (tentativas == 3) {
            System.out.println("Bloqueado!");

        }
    }
}
