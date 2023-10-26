
/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class exercicio16pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados:");
        double areaQueSeraPintada = teclado.nextDouble();

        double litrosNecessarios = areaQueSeraPintada / 3.0;
        int latasNecessarias = (int) Math.round(litrosNecessarios / 18.0);

        double precoPorLata;
        precoPorLata = 80.0;
        double precoTotal = latasNecessarias * precoPorLata;

        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
