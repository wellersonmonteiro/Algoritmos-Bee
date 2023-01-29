package classes;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    Produto(String nomeInicail) {
        nome = nomeInicail;
    }
    Produto () {

    }
    Produto(String nomeInicial, double precoInicail){
        nome = nomeInicial;
        preco = precoInicail;

    }
    double  precoComDescomnto() {
        return preco * (1 - desconto);
    }
     double precoComDescomnto(double descontoGerente){
            desconto = descontoGerente + desconto;

            return preco * (1 - desconto);

    }
}
