package src;

import java.util.Scanner;
//Faça um Programa que peça as 4 notas bimestrais e mostre a média:

public class exercicio4pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a primeira nota bimestral:");
        float nota1;
        nota1 = teclado.nextFloat();

        System.out.println("Informe a segunda nota bimestral:");
        float nota2;
        nota2 = teclado.nextFloat();

        System.out.println("Informe a terceira nota bimestral:");
        float nota3;
        nota3 = teclado.nextFloat();

        System.out.println("Informe a quarta nota bimestral:");
        float nota4;
        nota4 = teclado.nextFloat();

        float media;
        media = (nota1 + nota2 + nota3 + nota4) /4;

        System.out.println("a média das notas informadas é:" + media);


    }
}