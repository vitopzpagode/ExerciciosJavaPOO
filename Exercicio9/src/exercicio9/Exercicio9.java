
package exercicio9;


public class Exercicio9 {

    public static void main(String[] args) {

        RestaurantePedido pedido = new RestaurantePedido("Vitor", "Pizza", "Refrigerante", 45.00);


        pedido.setBebida("Suco Natural");


        pedido.exibirPedido();
    }
}
