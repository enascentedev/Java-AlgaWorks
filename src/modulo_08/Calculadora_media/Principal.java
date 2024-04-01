package modulo_08.Calculadora_media;

public class Principal {
    public static void main(String[] args) {
        int [] notas= {8,5,4,9,10,10,10,20,30,10};

        double media= Calculadora.calcularMedia(notas);
        System.out.println(media);
    }
}
