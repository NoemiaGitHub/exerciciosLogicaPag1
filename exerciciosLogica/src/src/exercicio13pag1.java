package src;

import java.util.Scanner;

/* 	Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    utilizando as seguintes fórmulas:
o	Para homens: (72.7*h) - 58
o	Para mulheres: (62.1*h) - 44.7 */

public class exercicio13pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua altura:");
        float altura;
        altura = teclado.nextFloat();

        System.out.println("se for homem digite 1 e se for mulher digite 2:");
        int genero;
        genero = teclado.nextInt();

        if (genero == 1) {
            float pesoIdealHomens;
            pesoIdealHomens = (float) (72.7 * altura) - 58;
            System.out.println("Peso ideal:" + pesoIdealHomens);
        }
        else if (genero ==2) {
            float pesoIdealMulheres;
            pesoIdealMulheres = (float) (62.1 * altura) - 58;
            System.out.println("Peso ideal:" + pesoIdealMulheres);
        }
        else {
            System.out.println("Selecione uma opção válida!");
        }

    }
}