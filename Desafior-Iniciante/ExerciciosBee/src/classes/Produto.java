package classes;

public class Produto {
    String nome;
    double preco;
    double desconto;
    Produto(String nomeInicail) {
        nome = nomeInicail;
    }
    Produto () {

    }
    Produto(String nomeInicial, double precoInicail, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicail;
        desconto = descontoInicial;
    }
    double  precoComDescomnto() {
        return  preco * (1 - desconto);
    }
}
