import java.util.Scanner;

/* Tendo como dados de entrada a altura de uma pessoa,construa um algoritmo que calcule seu peso ideal,
usando a seguinte fórmula: (72.7*altura) - 58 */

public class exercicio12pag1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a sua altura:");
        float altura;
        altura = teclado.nextFloat();

        double pesoIdeal;
        pesoIdeal = (72.7*altura)-58;
        System.out.println("Peso ideal:"+pesoIdeal);

    }
}