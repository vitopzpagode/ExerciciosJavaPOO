
package exercicio6;


public class Exercicio6 {


    public static void main(String[] args) {

        ContaEnergia conta = new ContaEnergia("Vitor", 12345, 350.0, 280.50);


        conta.setConsumoKwh(400.0);

        conta.setValorConta(320.00);


        conta.exibirConta();
    }
}
