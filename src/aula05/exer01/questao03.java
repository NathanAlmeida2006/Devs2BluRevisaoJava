package aula05.exer01;

public class questao03 {
    public static void main(String[] args) {
        int[][][] matriz = new int[3][3][3];
        int total = 0;
        int totalPares = 0;
        int totalImpares = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    total += matriz[i][j][k] = i + j + k;

                    if (matriz[i][j][k] % 2 == 0) {
                        totalPares += matriz[i][j][k];
                    } else {
                        totalImpares += matriz[i][j][k];
                    }
                }
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Camada " + (i + 1) + ":");
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz[i][j].length; k++) {
                    System.out.print(matriz[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Soma total: " + total);
        System.out.println("Soma dos pares: " + totalPares);
        System.out.println("Soma dos ímpares: " + totalImpares);
    }
}
