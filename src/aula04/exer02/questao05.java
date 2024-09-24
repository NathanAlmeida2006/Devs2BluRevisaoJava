package aula04.exer02;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEscolhido = (int) (Math.random() * 10) + 1;
        int numDigitado;

        do {
            System.out.println("Digite um valor: ");
            numDigitado = sc.nextInt();

        } while (numDigitado != numEscolhido);

        System.out.println("Acertou!: " + numEscolhido);
    }
}
