package aula05.exer02;

public class questao01 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int totalImpares = 0;
        int denominador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) (Math.random() * 10) + 1;
            if (vetorA[i] % 2 != 0) {
                totalImpares += vetorA[i];
                denominador++;
            }
        }

        System.out.println("Matriz:");
        for (int valor : vetorA) {
            System.out.print(valor + "\t");
        }

        System.out.println();
        System.out.println("Média simples: " + totalImpares / denominador);
    }
}
