package modulo_05.exercicio_OO.exercicio_5;

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
