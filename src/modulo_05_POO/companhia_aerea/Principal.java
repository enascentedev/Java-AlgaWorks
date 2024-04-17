package modulo_05_POO.companhia_aerea;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol= new Aeronave();
        aviaoGol.totalAssentos=100;

        aviaoGol.ativo=false;
        aviaoGol.desativar();
//        aviaoGol.ativar();

        System.out.printf("Gol (%s) %d assentos disponíveis%n",
                aviaoGol.ativo? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());

        Aeronave aviaoLatam= new Aeronave();
        aviaoLatam.totalAssentos=100;

//        aviaoGol.ativo=false;
//        aviaoGol.desativar();
        aviaoLatam.ativar();

        aviaoLatam.reservarAssentos(20);

        System.out.printf("Latam (%s) %d assentos disponíveis%n",
                aviaoLatam.ativo? "Ativo" : "Inativo",
                aviaoLatam.calcularAssentosDisponiveis());
    }
}
