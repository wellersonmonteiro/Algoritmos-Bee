package aulasDeRepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("digite um número; ");
        int numero = input.nextInt();
        int fatorado = 1;

        for (int i = numero; i >= 1; i--) {
            fatorado = fatorado * i;

        }
        System.out.println("A fatoração de "+ numero + " é igual a  " + fatorado );
    }
}
