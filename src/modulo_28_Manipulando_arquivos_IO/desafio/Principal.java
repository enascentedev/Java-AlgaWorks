package modulo_28_Manipulando_arquivos_IO.desafio;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {
    //criando arquivo.txt na raiz do projeto
    public static void main(String[] args) {
        File arquivo = null;
        try {
            arquivo = new File("meu_arquivo.txt");
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Falha ao criar o arquivo.");
            ((Throwable) e).printStackTrace();
        }

        //abrindo arquivo e escrevendo emanuel
        try (FileWriter writer = new FileWriter(arquivo, true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            String novoConteudo = "emanuel";
            bw.write(novoConteudo);
            System.out.println("Conteúdo \"" + novoConteudo + "\" adicionado ao arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Falha ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}
