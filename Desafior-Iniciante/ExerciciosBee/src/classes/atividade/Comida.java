package classes.atividade;

public class Comida {
    String nomeComida;
    double pesoComida;
    Comida(String nome, double peso){
        this.nomeComida = nome;
        this.pesoComida = peso;

    }
    double getPesoComida(){
        return pesoComida;
    }
}
