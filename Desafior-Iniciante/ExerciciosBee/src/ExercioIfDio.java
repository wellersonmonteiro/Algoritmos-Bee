import java.util.Scanner;

public class ExercioIfDio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        String dia = input.next();


        if (mes == 1){
            System.out.println("O mês é janeiro.");
        }
        else if (mes ==2) {
            System.out.println("O mês é fevereiro.");

        }
        else if (mes == 3) {
            System.out.println("O mês é março.");

        }
        else if (mes == 4) {
            System.out.println("O mês é abril.");

        }
        else if (mes == 5) {
            System.out.println("O mês é maio.");

        }
        else if (mes == 6 ) {
            System.out.println("O mês é junho.");

        }
        else if ( mes == 7) {
            System.out.println("O mês é julho.");

        }
        else if (mes == 8) {
            System.out.println("O mês é agosto.");

        }
        else if (mes == 9) {
            System.out.println("O mês é setembro.");

        }
        else if (mes == 10) {
            System.out.println("O mês é outubro.");

        }
        else if ( mes == 11) {
            System.out.println("O mês é novembro.");

        }
        else if (mes == 12) {
            System.out.println("O mês é desembro.");

        }
        else {
            System.out.println("Mês inválido.");

        }
        if (mes == 7 || mes == 12 || mes == 1){
            System.out.println("Mês de férias.");

        }
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;

            case "Terça":
                System.out.println(3);
                break;

            case "Quarta":
                System.out.println(4);
                break;

        }
    }

    }

