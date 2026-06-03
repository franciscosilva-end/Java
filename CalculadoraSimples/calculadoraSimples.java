package CalculadoraSimples;
import java.util.Scanner;
public class calculadoraSimples {
    static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("CALCULADORA SIMPLES");
        System.out.println("=======================");
        System.out.println("Primeiro algarismo:");
            Scanner scanner1 = new Scanner(System.in);
            double primeiroAlgarismo = scanner1.nextDouble();
        System.out.println("Segundo algorismo:");
            Scanner scanner2 = new Scanner(System.in);
            double segundoAlgarismo = scanner2.nextDouble();
        System.out.println("Qual operação deseja evetuar?");
            Scanner scanner3 = new Scanner(System.in);
            String operacao = scanner3.next();
            scanner3.close();
                if(operacao.equals("+")){
                    double resultadoAdicao = primeiroAlgarismo + segundoAlgarismo;
                    System.out.println("O resultado da adição é " + resultadoAdicao);
                }else if(operacao.equals("-")){
                    double resultadoSubtracao = primeiroAlgarismo - segundoAlgarismo;
                    System.out.println("O resultado da subtração é " + resultadoSubtracao);
                }else if(operacao.equals("*")){
                    double resultadoMultiplicacao = primeiroAlgarismo * segundoAlgarismo;
                    System.out.println("O resultado da multiplicação é " + resultadoMultiplicacao);
                }else if(operacao.equals("/")){
                    double resultadoDivisao = primeiroAlgarismo / segundoAlgarismo;
                    System.out.println("O resultado da divisão é " + resultadoDivisao);
                }else{
                    System.out.println("ERRO DE SINTAX");
                }
    }
}
