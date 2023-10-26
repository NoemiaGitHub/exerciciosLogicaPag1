/*Faça um Programa que pergunte quanto você ganha por hora
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
       Scanner teclado  = new Scanner(System.in);

        System.out.print("Informe o valor do salário por hora: ");
        double salarioPorHora = teclado.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = teclado.nextDouble();

        double salarioBruto = salarioPorHora * horasTrabalhadas;

        double descontoIR = salarioBruto * 0.11;

        double descontoINSS = salarioBruto * 0.08;

        double descontoSindicato = salarioBruto * 0.05;

        double salarioLiquido = salarioBruto - descontoIR - descontoINSS - descontoSindicato;

        System.out.println("+ Salário Bruto : R$ " + salarioBruto);
        System.out.println("- IR (11%) : R$ " + descontoIR);
        System.out.println("- INSS (8%) : R$ " + descontoINSS);
        System.out.println("- Sindicato (5%) : R$ " + descontoSindicato);
        System.out.println("= Salário Líquido : R$ " + salarioLiquido);
    }
}
