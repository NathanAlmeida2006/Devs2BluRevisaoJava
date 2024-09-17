package aula02;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a área do terreno em metros quadrados:");
        double area = sc.nextDouble();

        double acre = area / 4046.86;
        double pesQuadrados = area * 10.7639;
        double hectares = area / 10000;

        System.out.println("Acre: " + acre);
        System.out.println("Pés: " + pesQuadrados);
        System.out.println("Hectares: " + hectares);
    }
}
