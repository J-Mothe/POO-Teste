//1. Considere o seguinte array de inteiros: int[] numeros = {4, 8, 9, 5, 0, 3, 2, 7, 1};
//a) Encontre o maior e o menor número e os armazene nas variáveis maior e menor.
//b) Calcule a média de todos os números  maiores que 5.
//c) Identifique se a quantidade de números pares é maior que a quantidade de números impares, menor ou igual.

public class questao2 {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 9, 5, 0, 3, 2, 7, 1};

        // a) Encontrar o maior e o menor numero
        int maior = maiornumero(numeros);
        int menor = menornumero(numeros);

        // b) Calcular a media de todos os numeros maiores que 5
        double media = calcularmedia(numeros);

        // c) Identificar se a quantidade de números pares e maior, menor ou igual a quantidade de numeros impares
        String resultado = compararparimpar(numeros);

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media dos numeros maiores que 5: " + media);
        System.out.println(resultado);
    }

    public static int maiornumero(int[] numeros) {
        int maior = numeros[0];
        for (int elemento : numeros) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static int menornumero(int[] numeros) {
        int menor = numeros[0];
        for (int elemento : numeros) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static double calcularmedia(int[] numeros) {
        int soma = 0;
        int verificadormaiorque5 = 0;

        for (int num : numeros) {
            if (num > 5) {
                soma += num;
                verificadormaiorque5++;
            }
        }

        if (verificadormaiorque5 > 0) {
            return (double) soma / verificadormaiorque5;
        } else {
            return 0;
        }
    }

    public static String compararparimpar(int[] numeros) {
        int pares = 0;
        int impares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        if (pares > impares) {
            return "A quantidade de numeros pares é maior.";
        } else if (pares < impares) {
            return "A quantidade de numeros pares é menor.";
        } else {
            return "A quantidade de numeros pares é igual.";
        }
    }
}
