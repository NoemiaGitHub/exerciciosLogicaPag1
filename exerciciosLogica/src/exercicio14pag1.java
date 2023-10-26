/*João Papo-de-Pescador, homem de bem, comprou um microcomputador
para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de SP (50 quilos)
deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes)
e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
e na variável multa o valor da multa que João deverá pagar.
Imprima os dados do programa com as mensagens adequadas:
 */

import java.util.Scanner;

public class exercicio14pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes em quilos: ");
        double pesoPeixes = teclado.nextDouble();

       double limitePeso = 50.0;

        if (pesoPeixes > limitePeso) {
            double excesso = pesoPeixes - limitePeso;

            double multa = excesso * 4.0;

            System.out.println("Peso de peixes: " + pesoPeixes + " quilos");
            System.out.println("Limite de peso permitido: " + limitePeso + " quilos");
            System.out.println("Excesso de peso: " + excesso + " quilos");
            System.out.println("Multa a ser paga: R$" + multa);
        } else {
            System.out.println("Peso de peixes dentro do limite permitido. Sem multa.");
        }

    }
}
