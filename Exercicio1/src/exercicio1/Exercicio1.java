
package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        
        ProdutoTecnologia produto1 = new ProdutoTecnologia("Smartphone", "Samsung", 2500.00, 10);
        ProdutoTecnologia produto2 = new ProdutoTecnologia("Notebook", "Dell", 4500.00, 5);

        produto1.exibirProduto();
        produto2.exibirProduto();

    }
}
