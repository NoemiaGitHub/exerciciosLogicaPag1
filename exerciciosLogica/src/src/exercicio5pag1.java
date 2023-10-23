package src;
//Faça um Programa que converta metros para centímetros:

import java.util.Scanner;

public class exercicio5pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros: ");
        double metros = teclado.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros é igual a " + centimetros + " centímetros.");

    }
}
