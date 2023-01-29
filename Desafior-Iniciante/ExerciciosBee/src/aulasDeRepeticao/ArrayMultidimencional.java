package aulasDeRepeticao;

import java.util.Random;

public class ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();
        int [] [] matriz = new int[3] [2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length ; j++) {
                matriz[i][j] = random.nextInt(9);
                
            }
        }
        for (int [] linha: matriz
             ) {
            for (int coluna:linha
                 ) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }
    }
    
}
