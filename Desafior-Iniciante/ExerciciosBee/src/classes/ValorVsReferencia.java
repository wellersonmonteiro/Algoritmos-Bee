package classes;

import java.sql.SQLOutput;

public class ValorVsReferencia {
    public static void main(String[] args) {


        double a = 2;
        double b = a; // Atribuição por valor.

        a++;
        b--;
        System.out.println(a+" " +b);

        Data d1 = new Data(1,8,1995);
        Data d2 = d1; // Atribuição por referência (Objeto)
        d2.dia = 31;
        d2.mes  =   12;
        d2.ano = 2025;
        System.out.println(d1.dataNova());
        System.out.println(d2.dataNova());

        voltarDataParaValorPadrao(d1);
        System.out.println(d1.dataNova());
        System.out.println(d2.dataNova());
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
}