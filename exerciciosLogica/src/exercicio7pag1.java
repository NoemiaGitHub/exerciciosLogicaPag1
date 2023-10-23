//Faça um Programa que calcule a área de um quadrado,em seguida mostre o dobro desta área para o usuário

import java.util.Scanner;

    public class exercicio7pag1 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado:");
        double lado = teclado.nextDouble();

        double area;
        area = lado * lado;

        double dobroArea;
        dobroArea = area * 2;

        System.out.println("A área do quadrado é:" + area);
        System.out.println("O dobro da área do quadrado é :" + dobroArea);

    }
}
