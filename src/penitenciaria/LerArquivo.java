package penitenciaria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LerArquivo {

    public ArrayList<Pessoa> lerArq = new ArrayList<>();
    private Scanner lerScan;

    //CONSTRUTOR PARA LER ARQUIVO E GRAVAR NO ARRAY
    public LerArquivo() throws FileNotFoundException {
        try {
            this.lerScan = new Scanner(new FileReader("Cadastro.txt"));

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("ARQUIVO NÃO ENCONTRADO!");
        }

    }

    public ArrayList<Pessoa> lerArquivo() {
        String linha;
        while (this.lerScan.hasNext()) {
            linha = this.lerScan.nextLine();
            lerArq.add(separarDados(linha));
        }
        return lerArq;
    }

    private Pessoa separarDados(String linha) {
        String[] dados;
        dados = linha.split(";");
        int idadeInt = Integer.parseInt(dados[2]);
        int crDetentoInt = Integer.parseInt(dados[8]);
        return (new Visitante(dados[0], dados[1], idadeInt, dados[3], dados[4],
                dados[5], dados[6], dados[7], crDetentoInt));
    }

    public void limparArq() throws IOException {
        BufferedWriter escreveBuffer;
        try {
            escreveBuffer = new BufferedWriter(new FileWriter("Cadastro.txt", false));
            escreveBuffer.write("");
            escreveBuffer.flush();
            escreveBuffer.close();
        } catch (IOException ex) {

        }
    }
}
