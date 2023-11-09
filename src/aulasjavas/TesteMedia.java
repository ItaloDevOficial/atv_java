package aulasjavas;
import java.util.Scanner;

public class TesteMedia {
    public static void main(String[] args) {

        float nota1, nota2, nota3, nota4;
        float media;

        Scanner soma = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        nota1 = soma.nextInt();

        System.out.println("Entre com a segunda nota:");
        nota2 = soma.nextInt();

        System.out.println("Entre com a terceira nota:");
        nota3 = soma.nextInt();

        System.out.println("Entre com a quarta nota:");
        nota4 = soma.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) /4;

        System.out.println("A media do aluno é " + media);
        if(media >= 6){
            System.out.println("O aluno está aprovado");
        }else if(media == 5){
            System.out.println("O aluno está de recuperação");
        }else{
            System.out.println("O aluno está reprovado");
        }
    }
}
