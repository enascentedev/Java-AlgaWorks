package modulo_10.desafio_10_07;

public class Participante {
    String nome;
    int saldoDSePontos;

    public Participante(String nome, int saldoDSePontos) {
        this.nome = nome;
        this.saldoDSePontos = saldoDSePontos;
    }
    public void imprimirParticipante(){

        System.out.println("o nome do participante é "+ nome);
        System.out.println("o saldo é:"+ saldoDSePontos);
    }

}
