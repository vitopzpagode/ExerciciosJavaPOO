
package exercicio5;


public class Filme {
     private String titulo;
    private String diretor;
    private int duracao;
    private String classificacao;


    public Filme(String titulo, String diretor, int duracao, String classificacao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void exibirFilme() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificação indicativa: " + classificacao);
        System.out.println("------------------------");
    }
}

