package modulo_05.modulo_05_02;

public class Principal {
    public static void main(String[] args) {
       CalculadoraImc calculadoraImc = new CalculadoraImc();

        Paciente joao=new Paciente();

        joao.peso = 75;
        joao.altura = 1.82;


     IndiceMassaCorporal imc= calculadoraImc.Calcular(joao);

     if(imc.estaComObesidade()){

         System.out.printf("Paciente com altura de %.2f %n e peso de %.2f"+ "está com obesidade", imc.altura, imc.peso);
     }
     if(imc.estaAbaixoDoPesoIdeal()){

         System.out.printf("Paciente com altura de %.2f  e peso de %.2f "+ "está abaixo do peso ", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f %n", imc.resultado);
    }
}
