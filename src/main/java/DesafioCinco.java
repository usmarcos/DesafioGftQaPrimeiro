import java.util.Scanner;

//Desafio
//        Leia 2valores inteiros(A e B).Após,o programa deve mostrar uma mensagem"Sao Multiplos"ou"Nao sao Multiplos",indicando se os valores lidos são múltiplos entre si.
//
//        Entrada
//        A entrada contém valores inteiros.
//
//        Saída
//        A saída deve conter uma das mensagens conforme descrito acima.

public class DesafioCinco {

        public static void main(String[] args)  {
            Scanner leitor = new Scanner(System.in);
            //continue a solucao
            int a = leitor.nextInt();
            int b = leitor.nextInt();
            if ((a % b == 0) | (b % a == 0)) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
    }
