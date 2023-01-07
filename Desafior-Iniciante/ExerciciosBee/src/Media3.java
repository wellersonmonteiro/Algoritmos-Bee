import java.text.DecimalFormat;
import java.util.Scanner;
public class Media3 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);
        //Receber os números que serão gerados pelo Scanner.

        double numero1, numero2, numero3, numero4;
        numero1 = input.nextDouble();
        numero2 = input.nextDouble();
        numero3 = input.nextDouble();
        numero4 = input.nextDouble();

        // Efetuando a média ponderada
        double media = ((numero1 * 2) +(numero2 * 3) + (numero3 * 4) + numero4 *1) /10;

        System.out.println("Media: "+ df.format(media));
        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 7 && media >= 5) {
            System.out.println("Aluno em exame.");
            double exame = input.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;
            if (media >= 5){
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: "+ df.format(media));
        }
       else if(media < 5.0) {
            System.out.println("Aluno reprovado.");
        }

    }
}
