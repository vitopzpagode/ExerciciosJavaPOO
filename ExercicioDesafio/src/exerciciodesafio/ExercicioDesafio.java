
package exerciciodesafio;

public class ExercicioDesafio {


    public static void main(String[] args) {
         UsuarioSistema usuario = new UsuarioSistema(
                "Vitor",
                "vitor@email.com",
                "ADMIN"
        );
         
        usuario.setSenha("123");

        usuario.setSenha("123456");

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Nível de acesso: " + usuario.getNivelAcesso());
        System.out.println("Senha: " + usuario.getSenha());
    }
}
