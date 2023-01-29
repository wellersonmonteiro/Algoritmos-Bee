package classes.atividade;

public class Jantar {
    public static void main(String[] args) {
    Pessoa novaPessoa = new Pessoa("Lucas", 68 );
    Comida novaComida = new Comida("Frango empanado",0.5);

    System.out.println(novaPessoa.apresentar());
    System.out.println("O nome da comida é " + novaComida.nomeComida);
        System.out.println("O peso inicial do cliente é " + novaPessoa.peso);
        novaPessoa.comer(novaComida);

        System.out.println(novaPessoa.apresentar());

    }
}
