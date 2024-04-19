package modulo_08.Desafio_1;

public class Calendario {

    static String obterNomeMes(int numeroMes) {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        return (numeroMes >= 1 && numeroMes <= 12) ? meses[numeroMes - 1] : null;
    }

    public static void main(String[] args) {
        String mes = Calendario.obterNomeMes(8);
        System.out.println(mes);
    }
}
