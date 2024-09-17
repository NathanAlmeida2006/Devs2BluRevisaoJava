package aula02;

public class questao03 {
    public static void main(String[] args) {
        double totalAcoes = 1000;
        double primeiroValor = 32.87;
        double segundoValor = 33.92;
        double taxa = 0.02;

        double quantiaTotalPaga = totalAcoes * primeiroValor;
        double comissaoCompra = quantiaTotalPaga * taxa;
        double quantiaTotalVendida = totalAcoes * segundoValor;
        double comissaoVenda = quantiaTotalVendida * taxa;
        double perda = quantiaTotalVendida - quantiaTotalPaga - comissaoCompra - comissaoVenda;

        System.out.println("Quantia total paga: " + quantiaTotalPaga);
        System.out.println("Valor da comissão que José pagou ao seu corretor quando ele comprou as ações: " + comissaoCompra);
        System.out.println("A quantia pela qual José vendeu as ações: " + quantiaTotalVendida);
        System.out.println("A quantia de comissão que José pagou ao seu corretor quando ele vendeu as ações: " + comissaoVenda);
        System.out.println("Perdeu: " + perda);
    }
}
