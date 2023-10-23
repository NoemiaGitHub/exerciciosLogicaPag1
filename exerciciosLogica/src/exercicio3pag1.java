import java.util.Scanner;
//Faça um Programa que peça dois números e imprima a soma.
public class exercicio3pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número:");
        int primeironumero;
        primeironumero = teclado.nextInt();
        System.out.println("Informe um segundo número:");
        int segundonumero;
        segundonumero = teclado.nextInt();

        int soma;
        soma = primeironumero + segundonumero;
        System.out.println("A Soma dos dois números informados é:" + soma);

    }
}