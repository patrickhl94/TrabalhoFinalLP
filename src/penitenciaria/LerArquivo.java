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

    public ArrayList<Pessoa> lerArqVisitas = new ArrayList<>();
    public ArrayList<Pessoa> lerArqDetento = new ArrayList<>();
    private Scanner lerScanVisita;
    private Scanner lerScanDetento;

    //CONSTRUTOR PARA LER ARQUIVO E GRAVAR NO ARRAY
    public LerArquivo() throws FileNotFoundException {
        try {
            this.lerScanVisita = new Scanner(new FileReader("CadastroVisita.txt"));
            this.lerScanDetento = new Scanner(new FileReader("CadastroDetento.txt"));

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("ARQUIVO NÃO ENCONTRADO!");
        }

    }

    // METODOS PARA LER, SEPARAR DADOS E LIMPAR ARQUIVOS DE VISITANTES
    public ArrayList<Pessoa> lerArquivoVisitas() {
        String linha;
        while (this.lerScanVisita.hasNext()) {
            linha = this.lerScanVisita.nextLine();
            lerArqVisitas.add(separarDadosVisitas(linha));
        }
        return lerArqVisitas;
    }

    private Pessoa separarDadosVisitas(String linha) {
        String[] dados;
        dados = linha.split(";");
        int idadeInt = Integer.parseInt(dados[2]);
        int crDetentoInt = Integer.parseInt(dados[8]);
        return (new Visitante(dados[0], dados[1], idadeInt, dados[3], dados[4],
                dados[5], dados[6], dados[7], crDetentoInt));
    }

    public void limparArqVisitas() throws IOException {
        BufferedWriter escreveBuffer;
        try {
            escreveBuffer = new BufferedWriter(new FileWriter("CadastroVisita.txt", false));
            escreveBuffer.write("");
            escreveBuffer.flush();
            escreveBuffer.close();
        } catch (IOException ex) {

        }
    }

    // METODOS PARA LER, SEPARAR DADOS E LIMPAR ARQUIVOS DE DETENTOS
    public ArrayList<Pessoa> lerArquivoDetento() {
        String linha;
        while (this.lerScanDetento.hasNext()) {
            linha = this.lerScanDetento.nextLine();
            lerArqDetento.add(separarDadosDetento(linha));
        }
        return lerArqDetento;
    }

    private Pessoa separarDadosDetento(String linha) {
        String[] dados;
        dados = linha.split(";");
        int idadeInt = Integer.parseInt(dados[4]);
        int tempPena = Integer.parseInt(dados[2]);
        boolean conden = Cadastro.converterBool(dados[1]);

        return (new Detento(dados[0], conden, tempPena, dados[3], idadeInt, dados[5],
                dados[6], dados[7], dados[8], dados[9]));
    }

    public void limparArqDetento() throws IOException {
        BufferedWriter escreveBuffer;
        try {
            escreveBuffer = new BufferedWriter(new FileWriter("CadastroDetento.txt", false));
            escreveBuffer.write("");
            escreveBuffer.flush();
            escreveBuffer.close();
        } catch (IOException ex) {

        }
    }
    
    //METODO QUE PESQUISA DETENTO NO ARQUIVO ATRAVES DO CODIGO DO DETENTO, ELE RETORNA UM OBJETO DO TIPO DETENTO   
}
