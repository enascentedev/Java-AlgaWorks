package modulo_05_POO.modulo_05_02;

public class IndiceMassaCorporal {

    double resultado;
    double altura;
    double peso;

    boolean estaComObesidade(){
        return resultado >=30;
    }
    boolean estaAbaixoDoPesoIdeal(){
        return resultado >=18.5;
    }

}
