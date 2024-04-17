package modulo_05_POO.modulo_05_02;


public class CalculadoraImc {

   IndiceMassaCorporal Calcular(Paciente paciente){
       IndiceMassaCorporal imc= new IndiceMassaCorporal();
        imc.resultado= paciente.peso / (paciente.altura*paciente.altura);
        imc.peso= paciente.peso;
        imc.altura= paciente.altura;

        return imc;
    }
}
