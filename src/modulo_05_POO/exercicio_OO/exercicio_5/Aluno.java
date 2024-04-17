package modulo_05_POO.exercicio_OO.exercicio_5;
/*
 Fazer uma classe Aluno que possua as seguintes características:
• dois atributos do tipo inteiro: primeira nota parcial (de 0 a 100) e Segunda
nota parcial (de 0 a 100)
• um atributo String representando o nome do aluno
• possua métodos para ler e escrever os atributos (ou uma construtora)


 */

public class Aluno {
    float primeiraNotaParcial;
    float segundaNotaParcial;
    String nomeAluno;

    public Aluno(String nomeAluno, float primeiraNotaParcial, float segundaNotaParcial) {
        this.nomeAluno = nomeAluno;
        this.primeiraNotaParcial = primeiraNotaParcial;
        this.segundaNotaParcial = segundaNotaParcial;
    }

    public float getPrimeiraNotaParcial() {

        return primeiraNotaParcial;
    }

    public void setPrimeiraNotaParcial(int primeiraNotaParcial) {

        this.primeiraNotaParcial = primeiraNotaParcial;
    }

    public float getSegundaNotaParcial() {

        return segundaNotaParcial;
    }

    public void setSegundaNotaParcial(int segundaNotaParcial) {

        this.segundaNotaParcial = segundaNotaParcial;
    }

    public String getNomeAluno() {

        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }




}
