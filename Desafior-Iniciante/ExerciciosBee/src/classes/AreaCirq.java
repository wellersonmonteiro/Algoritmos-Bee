package classes;

public class AreaCirq {
    double raio;
    static double pi = 3.14;

    AreaCirq(double raioInicial){

        raio = raioInicial;
    }
    double area() {
        return raio * raio * pi;
    }



    }

