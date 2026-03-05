
package exercicio10;


public class Smartphone {
     private String modelo;
    private String fabricante;
    private int armazenamento;
    private double preco;

    public Smartphone(String modelo, String fabricante, int armazenamento, double preco) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }


    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public double getPreco() {
        return preco;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void exibirSmartphone() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println("------------------------");
    }

}