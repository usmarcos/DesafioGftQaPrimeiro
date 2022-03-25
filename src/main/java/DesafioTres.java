import java.io.IOException;
import java.util.Scanner;

//Desafio
//        Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.
//
//        Entrada
//        A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.
//
//        Saída
//        Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

public class DesafioTres {
    public static void main(String[] args) throws IOException {
        //complete os espaços com sua solução
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        double X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextDouble();
            Y = leitor.nextDouble();
            if (Y == 0) System.out.println("divisao impossivel");
            else  System.out.printf("%.1f\n", (double)(X/Y));
        }
    }
}
