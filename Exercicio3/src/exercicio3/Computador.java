
package exercicio3;


public class Computador {
    
     private String marca;
    private String processador;
    private int memoriaRAM; // em GB
    private double preco;


    public Computador(String marca, String processador, int memoriaRAM, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.preco = preco;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public double getPreco() {
        return preco;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public void exibirComputador() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println("------------------------");
    }
}
