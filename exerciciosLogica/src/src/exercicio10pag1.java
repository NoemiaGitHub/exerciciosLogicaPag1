package src;

import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Celsius
 transforme e mostre em graus Fahrenheit.
 f = C * 1,8 + 32
 */

public class exercicio10pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius:");

        double celsius;
        celsius = teclado.nextDouble();

        double fahrenheit;
        fahrenheit = (celsius * 1.8 + 32);

        System.out.println("A temperatura em fahrenheit é:" + fahrenheit);
    }
}

