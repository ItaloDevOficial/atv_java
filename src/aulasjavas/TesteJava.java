package aulasjavas;
import java.util.Scanner;

public class TesteJava {
    public static void main(String[] args){

        int num1;
        int num2;
        int soma;

        Scanner valor = new Scanner(System.in);

        System.out.println("Entre com o Primeiro numero:");
        num1 = valor.nextInt();

        System.out.println("Entre com o Segundo numero:");
        num2 = valor.nextInt();

        soma = num1 + num2;


        System.out.println("O resultado de " + num1 + " e " + num2 + " é " + soma);

    }
}
