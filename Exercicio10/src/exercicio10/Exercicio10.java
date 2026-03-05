
package exercicio10;


public class Exercicio10 {


    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("iPhone 14", "Apple", 128, 7000.00);
        Smartphone s2 = new Smartphone("Galaxy S23", "Samsung", 256, 5000.00);


        s1.setArmazenamento(256);


        s1.exibirSmartphone();
        s2.exibirSmartphone();
    }
}
    
    

