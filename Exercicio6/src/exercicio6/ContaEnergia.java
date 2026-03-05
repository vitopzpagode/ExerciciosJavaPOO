
package exercicio6;


public class ContaEnergia {
    
    private String nomeCliente;
    private int numeroInstalacao;
    private double consumoKwh;
    private double valorConta;


    public ContaEnergia(String nomeCliente, int numeroInstalacao, double consumoKwh, double valorConta) {
        this.nomeCliente = nomeCliente;
        this.numeroInstalacao = numeroInstalacao;
        this.consumoKwh = consumoKwh;
        this.valorConta = valorConta;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroInstalacao() {
        return numeroInstalacao;
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public double getValorConta() {
        return valorConta;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumeroInstalacao(int numeroInstalacao) {
        this.numeroInstalacao = numeroInstalacao;
    }

    public void setConsumoKwh(double consumoKwh) {
        this.consumoKwh = consumoKwh;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }


    public void exibirConta() {
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número da Instalação: " + numeroInstalacao);
        System.out.println("Consumo (kWh): " + consumoKwh);
        System.out.println("Valor da Conta: R$ " + valorConta);
        System.out.println("-------------------------");
    }
}