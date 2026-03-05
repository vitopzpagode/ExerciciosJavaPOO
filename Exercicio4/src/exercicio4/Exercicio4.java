
package exercicio4;


public class Exercicio4 {


    public static void main(String[] args) {
        
        FuncionarioEmpresa f1 = new FuncionarioEmpresa("Vitor", "Analista", 3500.00, "Financeiro");
        FuncionarioEmpresa f2 = new FuncionarioEmpresa("Ricardo", "Gerente", 7000.00, "TI");
        FuncionarioEmpresa f3 = new FuncionarioEmpresa("Murilo", "Assistente", 2800.00, "RH");


        System.out.println("Nome: " + f1.getNome() + " | Cargo: " + f1.getCargo());
        System.out.println("Nome: " + f2.getNome() + " | Cargo: " + f2.getCargo());
        System.out.println("Nome: " + f3.getNome() + " | Cargo: " + f3.getCargo());
    }
}
