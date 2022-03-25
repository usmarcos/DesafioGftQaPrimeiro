import java.util.Scanner;

//Desafio
//        Tento como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.
//
//        Entrada
//        A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
//
//        Saída
//        Apresente a duração do jogo conforme exemplo abaixo.

public class Desafio6 {
    public static void main(String[] args){

        //complete os espaços em branco com sua solução para o problema

        Scanner leitor = new Scanner(System.in);

        int inicioJogo = leitor.nextInt();
        int fimJogo = leitor.nextInt();

        if (inicioJogo > fimJogo) {
            System.out.println("O JOGO DUROU " + (24 - (inicioJogo - fimJogo)) + " HORA(S)");
        } else if (fimJogo > inicioJogo) {
            System.out.println("O JOGO DUROU " + (fimJogo - inicioJogo) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
