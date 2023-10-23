
/*Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo*/

import java.util.Scanner;

public class exercicio11pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numeroInteiro1 = teclado.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numeroInteiro2 = teclado.nextInt();

        System.out.print("Digite um número real: ");
        double numeroReal = teclado.nextDouble();

        double resultado1;
        resultado1 = (2 * numeroInteiro1) + (numeroInteiro2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é:" + resultado1);

        double resultado2;
        resultado2 = (3 * numeroInteiro1) + numeroReal;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);

        double resultado3;
        resultado3 = numeroReal * numeroReal * numeroReal;
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);


    }
}
