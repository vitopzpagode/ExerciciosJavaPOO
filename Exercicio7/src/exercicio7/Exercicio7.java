
package exercicio7;


public class Exercicio7 {

    public static void main(String[] args) {
         
        AlunoCurso aluno1 = new AlunoCurso("Vitor", "Informática", 3, 2023001);
        AlunoCurso aluno2 = new AlunoCurso("Felipe", "Medicina", 2, 2023002);

        
        System.out.println("Nome: " + aluno1.getNome() + " | Curso: " + aluno1.getCurso());
        System.out.println("Nome: " + aluno2.getNome() + " | Curso: " + aluno2.getCurso());
    }
}
