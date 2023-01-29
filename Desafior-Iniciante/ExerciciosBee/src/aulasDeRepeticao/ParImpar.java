package aulasDeRepeticao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a quantidade de números desejados: ");
        int quantidade = input.nextInt();
        int numero;
        int impar = 0;
        int count = 0;
        do {
            System.out.println("informe um número:");
            numero = input.nextInt();
            count++;
            if(numero % 2 == 1 ){
                impar++;
            }
        }while (count <quantidade);
        System.out.println("A quantidade de números impares é " + impar);
        System.out.println("A quantidade de números pares é " + (quantidade - impar));

    }
}
