package classes;

public class Data {
    int dia;
    int mes;
    int ano;
    Data(){
        dia =1;
        mes = 1;
        ano = 1970;

    }
    Data(int novoDia, int novoMes, int novoAno){
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
    }
    String dataNova () {
        return String.format("%d/%d/%d", dia, mes, ano);

    }
    static double PIS =  3.14;

}
