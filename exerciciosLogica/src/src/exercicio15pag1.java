package src;/*Faça um Programa que pergunte quanto você ganha por hora
e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês
sabendo-se que são descontados 11% para o Imposto de Renda
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:

salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/


import java.util.Scanner;

public class exercicio15pag1 {
    public static void main(String[] args) {
        // Crie um Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o valor do salário por hora
        System.out.print("Informe o valor do salário por hora: R$ ");
        double salarioPorHora = scanner.nextDouble();

        // Solicite ao usuário que insira o número de horas trabalhadas no mês
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        // Feche o Scanner após a leitura
        scanner.close();

        // Calcule o salário bruto
        double salarioBruto = salarioPorHora * horasTrabalhadas;

        // Calcule o valor do desconto de IR (11%)
        double descontoIR = salarioBruto * 0.11;

        // Calcule o valor do desconto de INSS (8%)
        double descontoINSS = salarioBruto * 0.08;

        // Calcule o valor do desconto para o sindicato (5%)
        double descontoSindicato = salarioBruto * 0.05;

        // Calcule o salário líquido
        double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        // Exiba os resultados
        System.out.println("+ Salário Bruto : R$ " + salarioBruto);
        System.out.println("- IR (11%) : R$ " + descontoIR);
        System.out.println("- INSS (8%) : R$ " + descontoINSS);
        System.out.println("- Sindicato (5%) : R$ " + descontoSindicato);
        System.out.println("= Salário Líquido : R$ " + salarioLiquido);
    }
}
