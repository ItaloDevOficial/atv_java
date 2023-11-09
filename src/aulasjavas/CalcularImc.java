package aulasjavas;
import java.util.Scanner;

    public class CalcularImc {
        public static void main(String[] args) {

            float peso;
            float altura;
            float imc;

            Scanner valor = new Scanner(System.in);

            System.out.println("Digite seu peso: ");
            peso = valor.nextFloat();

            System.out.println("Digite sua altura: ");
            altura = valor.nextFloat();

            imc = peso/(altura * altura);

            System.out.println("O seu IMC é " + imc);

            if(imc < 18.5){
                System.out.println("Abaixo do peso");
            }else if(imc >= 18.6 & imc <= 24.9){
                System.out.println(" Peso ideal");
            }else{
                System.out.println(" Acima do peso");
            }
        }
    }
