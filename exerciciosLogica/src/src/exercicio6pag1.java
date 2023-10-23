package src;
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área :

import java.util.Scanner;

public class exercicio6pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = teclado.nextDouble();

        double pi;
        pi =3.14;
        double area = (raio * raio) * 3.14;

        System.out.println("A área do círculo é: " + area);

    }
}
