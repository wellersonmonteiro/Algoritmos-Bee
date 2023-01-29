package classes;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto primeiroProduto = new Produto("Notebook");
        //primeiroProduto.nome = "Notebook";
        primeiroProduto.preco = 4356.86;
       // primeiroProduto.desconto = 0.25;

        var segundoProduto = new Produto("Caneta preta",12.56);
       // segundoProduto.nome = "Canete preta";
        //segundoProduto.preco = 12.56;
        //segundoProduto.desconto = 0.29;

        Produto terceiroProduto = new Produto();

        System.out.println(primeiroProduto.nome);
        System.out.println(primeiroProduto.precoComDescomnto(0.25));
        System.out.println(segundoProduto.nome);
        System.out.println(segundoProduto.precoComDescomnto());

    }
}

