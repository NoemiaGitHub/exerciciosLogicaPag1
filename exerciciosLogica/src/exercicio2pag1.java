import java.util.Scanner;
//Faça um Programa que peça um número e então mostre a mensagem O número informado foi:

public class exercicio2pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número:");

        int numero;
        numero = teclado.nextInt();
        System.out.println("o número informado foi:"+numero);
    }
}