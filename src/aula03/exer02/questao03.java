package aula03.exer02;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo médio no último ano: ");
        double saldoMedio = sc.nextDouble();

        double credito =
                (saldoMedio >= 0 && saldoMedio <= 200) ? 0 :
                        (saldoMedio >= 201 && saldoMedio <= 400) ? saldoMedio * 0.20 :
                                (saldoMedio >= 401 && saldoMedio <= 600) ? saldoMedio * 0.30 :
                                        saldoMedio * 0.40;

        System.out.printf("Saldo médio do cliente: R$ %.2f%n", saldoMedio);
        System.out.println((credito == 0) ? "Nenhum crédito disponível." : String.format("Valor do crédito: R$ %.2f", credito));

        sc.close();
    }
}
