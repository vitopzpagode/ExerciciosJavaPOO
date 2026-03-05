
package exercicio8;


public class Exercicio8 {


    public static void main(String[] args) {

        CarroAluguel carro = new CarroAluguel("Onix", "Chevrolet", 2022, 150.00);

        carro.setValorDiaria(170.00);

        carro.exibirCarro();
    }
}