/*Faça um Programa que peça a temperatura em graus Farenheit
 transforme e mostre a temperatura em graus Celsius.
usando a formúla abaixo:
C = (5 * (F-32) / 9).*/

import java.util.Scanner;

public class exercicio9pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Fahrenheit:");

        double temperaturaFahrenheit;
        temperaturaFahrenheit = teclado.nextDouble();

        double temperaturaCelsius;
        temperaturaCelsius = (5 * (temperaturaFahrenheit - 32)) / 9;

        System.out.println("A temperatura em graus Celsius é: " + temperaturaCelsius);
    }
}
