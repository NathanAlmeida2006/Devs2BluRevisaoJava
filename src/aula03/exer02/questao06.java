package aula03.exer02;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.nextLine().charAt(0);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println(letra + " é VOGAL!");

        } else {
            System.out.println(letra + " é CONSOANTE!");

        }
    }
}
