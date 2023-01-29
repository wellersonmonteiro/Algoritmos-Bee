package aulasDeRepeticao;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
        while(true){
            System.out.println("Digite o valor da nota: ");
            nota = input.nextInt();
            if(nota >= 0 && nota <= 10){
                System.out.println("O valor da nota é " + nota);
                break;
            } else {
                System.out.println("Valor inválido! Informe um novo valor.");
            }


        }
    }
}
