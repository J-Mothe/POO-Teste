//1. Escreva um algoritmo em Java que leia um texto informado pelo usuário
// e realize as seguintes operações relacionadas a essa entrada:
//a) Substitua todas as ocorrências de vogais por #.
//b) Encontre o índice da última ocorrência do caractere espaço
// e armazene em uma variável ocorrencia. Caso não for encontrado, armazene em ocorrencia -1.

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        // a) Substituir vogais por #
        String textoNovo = substituirvogal(texto, '#');
        System.out.println("Texto com vogais substituídas por #: " + textoNovo);

        // b) Encontrar o indice da última ocorrência do caractere espaço
        int ocorrencia = indiceultimoespaço(texto);
        System.out.println("Indice da ultima ocorrencia de espaço: " + ocorrencia);

        scanner.close();
    }

    public static String substituirvogal(String texto, char simbolo) {
        texto = texto.replaceAll("[aeiouAEIOU]", String.valueOf(simbolo));
        return texto;
    }

    public static int indiceultimoespaço(String texto) {
        int indice = texto.lastIndexOf(' ');
        return indice;
    }
}
