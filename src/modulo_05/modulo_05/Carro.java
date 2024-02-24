package modulo_05.modulo_05;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;

    Pessoa proprietario;

    double calcularIpva(){
        int tempoDeUsoEmAnos= calcularTempoDeUsoEmAnos();
        if(tempoDeUsoEmAnos > 10){
            return 0;
        }
        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos(){
        return 2022 -anoFabricacao;
    }

    double calcularValorRevenda() {
//
        int tempoDeUsoEmAnos = 2022 -anoFabricacao;
        int vidaUtilEmAnos= 20;

        double valorRevenda = (precoCompra/vidaUtilEmAnos) * (vidaUtilEmAnos-tempoDeUsoEmAnos);
        if (valorRevenda <0){
            valorRevenda=0;
        }

        return valorRevenda;
    }
    void imprimirResumoDepreciacao(){
        double valorRevendaMeuCarro= calcularValorRevenda();
        int tempoDeUsoMeuCarro= calcularTempoDeUsoEmAnos();

        if(precoCompra <=0 ){
            System.out.println("Carro com preço de compra zerado " +
                    "não foi possível imprimir resumo de depreciação");
            return;
        }

        System.out.printf("Tempo de uso (anos): %d%n ", tempoDeUsoMeuCarro);
        System.out.printf("Valor de revenda: %6.2f%n", valorRevendaMeuCarro);
    }
}
