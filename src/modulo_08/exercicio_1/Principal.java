package modulo_08.exercicio_1;

public class Principal {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        int max = numeros[0];
        int min = numeros[0];
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > max) {
                max = numeros[i];
            }
            if(numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);

    }
}
