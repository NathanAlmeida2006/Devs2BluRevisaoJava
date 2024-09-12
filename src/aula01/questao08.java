package aula01;

import java.util.Scanner;

public class questao08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        int horas = sc.nextInt();

        int minutos = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Total de minutos: " + minutos);
        System.out.println("Total de segundos: " + segundos);
    }
}
