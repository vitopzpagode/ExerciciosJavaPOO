
package exercicio1;

public class ProdutoTecnologia {
    
      private String nomeProduto;
    private String marca;
    private double preco;
    private int quantidadeEstoque;

    public ProdutoTecnologia(String nomeProduto, String marca, double preco, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("---------------------------");
    }
}

