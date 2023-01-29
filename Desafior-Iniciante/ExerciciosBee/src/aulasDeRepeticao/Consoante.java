package aulasDeRepeticao;

import java.util.Scanner;

public class Consoante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           String[] consoante = new String[6];
           int count =0;

           do{
               System.out.println("Letra: ");
               String letra = input.next();
               if(letra.equalsIgnoreCase("a") |
                       letra.equalsIgnoreCase("e") |
                       letra.equalsIgnoreCase("i") |
                       letra.equalsIgnoreCase("o") |
                       letra.equalsIgnoreCase("u") ){
               System.out.println("Letra inválida, digite novamente!");
               }
               else {
                   consoante[count] = letra;
                   count++;
               }
           }while (count < consoante.length);

        System.out.println("Consoantes: ");
        for (String cons:consoante
             ) {
            System.out.print(cons+ " ");

        }
    }
}

