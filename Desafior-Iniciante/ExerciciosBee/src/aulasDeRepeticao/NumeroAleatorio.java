package aulasDeRepeticao;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int count = 0;
        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        for (int numeros: numerosAleatorios
             ) {
            count++;
            System.out.println(count+")");
            System.out.println(numeros);

        }
    }
}
