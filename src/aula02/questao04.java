package aula02;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a velocidade: ");
        double vel = sc.nextDouble();

        System.out.println("A distância que o carro percorrerá em 5 horas: " + vel * 5);
        System.out.println("A distância que o carro percorre em 8 horas: " + vel * 8);
        System.out.println("A distância que o carro percorrerá em 12 horas: " + vel * 12);
    }
}
