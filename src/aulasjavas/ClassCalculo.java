package aulasjavas;
import java.util.Scanner;

public class ClassCalculo {
    public static void main(String[] args) {

        int numb1, numb2;
        int mais, menos, vezes, dividir;

        Scanner soma = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        numb1 = soma.nextInt();

        System.out.println("Entre com o segundo numero:");
        numb2 = soma.nextInt();

        mais = numb1 + numb2;
        menos = numb1 - numb2;
        vezes = numb1 * numb2;
        dividir = numb1 / numb2;

        System.out.println("O resultado " + numb1 + " + " + numb2 + " = " + mais);
        System.out.println("O resultado " + numb1 + " - " + numb2 + " = " + menos);
        System.out.println("O resultado " + numb1 + " * " + numb2 + " = " + vezes);
        System.out.println("O resultado " + numb1 + " / " + numb2 + " = " + dividir);
    }
}
