// Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês.

import java.util.Scanner;

public class exercicio8pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor que você ganha por hora");
        float valor;
        valor = teclado.nextFloat();

        System.out.println("Digite o número de horas trabalhadas no mês");
        float horas;
        horas = teclado.nextFloat();

        float salario;
        salario = (valor * horas);
        System.out.println("O valor do seu salário é:" + salario);


    }
}