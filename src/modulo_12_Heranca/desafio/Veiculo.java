package modulo_12_Heranca.desafio;

public class Veiculo {
    String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String modelo;

    public void exibirInformacoes(){
        System.out.println("modelo é :"+ modelo);
        System.out.println("marca é :"+marca);
    }
}
