
package exercicio8;


public class CarroAluguel {
     private String modelo;
    private String marca;
    private int ano;
    private double valorDiaria;


    public CarroAluguel(String modelo, String marca, int ano, double valorDiaria) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }


    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }


    public void exibirCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Valor da diária: R$ " + valorDiaria);
        System.out.println("------------------------");
    }
}

