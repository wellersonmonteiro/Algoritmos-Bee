package classes;

public class Datateste {
    public static void main(String[] args) {
        Data primeiraData = new Data();
        primeiraData.dia = 1;
        primeiraData.mes = 8;
        primeiraData.ano = 1995;

        Data segundaData = new Data();
        segundaData.dia = 10;
        segundaData.mes = 05;
        segundaData.ano = 2003;

        Data terceiraData = new Data();

        Data quartaData = new Data(1,8,1995);
        System.out.println(segundaData.dataNova());
        System.out.println(terceiraData.dataNova());
        System.out.println(quartaData.dataNova());
        System.out.println(segundaData.dia * Data.PIS);

    }
}
