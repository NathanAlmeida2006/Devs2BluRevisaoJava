package aula03.exer02;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double compra = sc.nextDouble();

        System.out.print("Digite o valor do pagamento: ");
        double pagamento = sc.nextDouble();

        if (pagamento < compra) {
            System.out.println("Pagamento Negado!");
        } else {
            double troco = pagamento - compra;

            if (troco == 0) {
                System.out.println("Sem troco!");
            } else {
                System.out.printf("Valor do troco: R$ %.2f%n", troco);

                int valorRestante = (int) Math.round(troco);

                int notas100 = valorRestante / 100;
                valorRestante %= 100;

                int notas10 = valorRestante / 10;
                valorRestante %= 10;

                int notas1 = valorRestante;

                System.out.println("Notas de 100: " + notas100);
                System.out.println("Notas de 10: " + notas10);
                System.out.println("Notas de 1: " + notas1);
            }
        }

        sc.close();
    }
}
