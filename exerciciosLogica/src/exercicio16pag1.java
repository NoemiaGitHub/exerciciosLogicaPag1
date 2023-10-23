
/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados
da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class exercicio16pag1 {
    public static void main(String[] args) {
        // Crie um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o tamanho em metros quadrados da área a ser pintada
        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double areaParaPintar = scanner.nextDouble();

        // Calcule a quantidade de latas de tinta necessárias
        double litrosNecessarios = areaParaPintar / 3.0;
        int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18.0); // Arredonda para cima

        // Calcule o preço total das latas de tinta
        double precoPorLata = 80.0;
        double precoTotal = latasNecessarias * precoPorLata;

        // Exiba os resultados
        System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
        System.out.println("Preço total: R$ " + precoTotal);
    }
}
