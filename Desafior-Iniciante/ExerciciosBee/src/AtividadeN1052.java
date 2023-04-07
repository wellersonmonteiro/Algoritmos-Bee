import java.util.Scanner;

public class AtividadeN1052 {

    static String month(int mes){
        String omes = null;
        switch (mes){
            case 1:
                omes = "January";
                break;
            case 2:
                omes = "February";
                break;
            case 3:
                omes = "March";
                break;
            case 4:
                omes = "April";
                break;
            case 5:
                omes = "May";
                break;
            case 6:
                omes = "June";
                break;
            case 7:
                omes = "July";
                break;
            case 8:
                omes = "August";
                break;
            case 9:
                omes = "September";
                break;
            case 10:
                omes = "October";
                break;
            case 11:
                omes = "November";
                break;
            case 12:
                omes = "December";
                break;
        }
            return omes;
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        System.out.println(month(mes));
    }
    }

