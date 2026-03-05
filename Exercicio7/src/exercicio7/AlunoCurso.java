
package exercicio7;

public class AlunoCurso {
     private String nome;
    private String curso;
    private int semestre;
    private int matricula;


    public AlunoCurso(String nome, String curso, int semestre, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.semestre = semestre;
        this.matricula = matricula;
    }


    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getMatricula() {
        return matricula;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

