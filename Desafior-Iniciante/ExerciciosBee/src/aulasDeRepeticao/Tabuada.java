package aulasDeRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroTabuada =0, count = 0;
        do{
        System.out.println("Informe o numero que desejado");
        numeroTabuada = input.nextInt();
        if (numeroTabuada > 0 && numeroTabuada < 11){
            count++;
        }else {
            System.out.println("Número inválido, informe um novo número!");
        }
        }while (count<1);
        System.out.println("--------Tabuada do "+ numeroTabuada + "------------");
        for (int i = 1; i < 11; i++) {
            System.out.println(numeroTabuada+ " x " + i +" = " + (i * numeroTabuada));
        }
    }
}
