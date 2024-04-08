package modulo_08.Array_Multidimensional;

public class Principal {
    public static void main(String[] args) {
        String[][] todasCidades =new String[3][];
        todasCidades[0]=new String[3];
        todasCidades[0][0]="uberlandia";
        todasCidades[0][1]="uberaba";
        todasCidades[0][2]="Belo Horizonte";

        todasCidades [1]= new String[2];
        todasCidades [1][0] ="são paulo";
        todasCidades [1][1] ="ribeiraõa preto";

        todasCidades [2]=new String[1];
        todasCidades[2][0]="fortaleza";


        for (String[] cidadesPorEstados : todasCidades) {
            for (String cidade : cidadesPorEstados) {
                System.out.println(cidade);
            }
            
        }
    }
}
