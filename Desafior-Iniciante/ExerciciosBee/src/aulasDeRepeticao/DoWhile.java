package aulasDeRepeticao;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int count = 0;
        double media = 0;
        int maiorNumero = 0;

        do {
            System.out.println("Qual o número: ");
            numero = input.nextInt();

            media = media + numero;
            count++;
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }while (count < 5);
        double mediaFinal = media/count;
        System.out.println("O maior número é " + maiorNumero);
        System.out.println("A média é: " + mediaFinal);


    }
}
