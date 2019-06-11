package penitenciaria;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class LerArquivo {

    //ATRIBUTOS
    public ArrayList<Pessoa> lerArqVisitas = new ArrayList<>();
    public ArrayList<Pessoa> lerArqDetento = new ArrayList<>();
    private Scanner lerScanVisita;
    private Scanner lerScanDetento;

    /*CONSTRUTOR PARA LER ARQUIVO E GRAVAR NO ARRAY. INSTANCIA OBJETO DO TIPO SCANNER E ENCAPSULA
     UM FILEREADER DO ARQUIVO TXT*/
    public LerArquivo() throws FileNotFoundException {
        try {
            this.lerScanVisita = new Scanner(new FileReader("CadastroVisita.txt"));
            this.lerScanDetento = new Scanner(new FileReader("CadastroDetento.txt"));

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("ARQUIVO NÃO ENCONTRADO!");
        }
    }

    /* METODO QUE CRIA UMA VARIÁVEL DO TIPO STRING PARA RECEBER CADA LINHA DO ARQUIVO TXT, INICIA UM WHILE QUE IRÁ 
    RODAR ATÉ NÃO EXISTIR MAIS LINHAS PREENCHIDAS. A CADA LOOP ELE CHAMA O METODO separarDadosVisitas PASSANDO POR PARAMETRO A LINHA
    E GRAVA NO INDICE DO ARRAY lerArqDetento, O RETORNO DO METODO separarDadosVisitas*/
    public ArrayList<Pessoa> lerArquivoVisitas() {
        String linha;
        while (this.lerScanVisita.hasNext()) {
            linha = this.lerScanVisita.nextLine();
            lerArqVisitas.add(separarDadosVisitas(linha));
        }
        return lerArqVisitas;
    }

    /* METODO PARA SEPARAR OS DADOS DO TXT E INSTANCIA-LOS EM UM OBJETO DO TIPO STRING PARA ADCIONA-LOS 
     NO ARRAY DO TIPO VISITANTES. ESTE METODO CRIA UM ODJETO DO TIPO STRING, QUE IRÁ RECEBER A linha.split 
    QUE SEPARA UMA LINHA PELOS PONTOS E VIRGULA, E COLOCA SEPARADAMENTE POR INDICE DENTRO DO OBJETO. POSTERIORMENTE
    SALVA ESSES DADOS EM UM OBJETO DO TIPO VISITANTE E RETORNA A FUNÇÃO*/
    private Pessoa separarDadosVisitas(String linha) {
        String[] dados;
        dados = linha.split(";");
        int idadeInt = Integer.parseInt(dados[2]);
        int crDetentoInt = Integer.parseInt(dados[8]);
        return (new Visitante(dados[0], dados[1], idadeInt, dados[3], dados[4],
                dados[5], dados[6], dados[7], crDetentoInt));
    }

    //METODO PARA LIMPAR TODO O ARQUIVO TXT
    public void limparArqVisitas() throws IOException {
        BufferedWriter escreveBuffer;
        try {
            escreveBuffer = new BufferedWriter(new FileWriter("CadastroVisita.txt", false));
            escreveBuffer.write("");
            escreveBuffer.flush();
            escreveBuffer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir, ou fechar arquivo");
        }
    }

    /* METODO QUE CRIA UMA VARIÁVEL DO TIPO STRING PARA RECEBER CADA LINHA DO ARQUIVO TXT, INICIA UM WHILE QUE IRÁ 
    RODAR ATÉ NÃO EXISTIR MAIS LINHAS PREENCHIDAS. A CADA LOOP ELE CHAMA O METODO separarDadosDetento PASSANDO POR PARAMETRO A LINHA
     E GRAVA NO INDICE DO ARRAY lerArqDetento, O RETORNO DO METODO separarDadosDetento*/
    public ArrayList<Pessoa> lerArquivoDetento() {
        String linha;
        while (this.lerScanDetento.hasNext()) {
            linha = this.lerScanDetento.nextLine();
            lerArqDetento.add(separarDadosDetento(linha));
        }
        return lerArqDetento;
    }

    /*METODO PARA SEPARAR OS DADOS DO TXT E INSTANCIA-LOS EM UM OBJETO DO TIPO STRING PARA ADCIONA-LOS 
     NO ARRAY DO TIPO DETENTO. METODO PARA SEPARAR OS DADOS DO TXT E INSTANCIA-LOS EM UM OBJETO DO TIPO STRING PARA ADCIONA-LOS 
     NO ARRAY DO TIPO VISITANTES. ESTE METODO CRIA UM ODJETO DO TIPO STRING, QUE IRÁ RECEBER A linha.split 
    QUE SEPARA UMA LINHA PELOS PONTOS E VIRGULA, E COLOCA SEPARADAMENTE POR INDICE DENTRO DO OBJETO. POSTERIORMENTE
    SALVA ESSES DADOS EM UM OBJETO DO TIPO DETENTO E RETORNA A FUNÇÃO*/
    private Pessoa separarDadosDetento(String linha) {
        String[] dados;
        dados = linha.split(";");
        int idadeInt = Integer.parseInt(dados[4]);
        int tempPena = Integer.parseInt(dados[2]);

        return (new Detento(dados[0], dados[1], tempPena, dados[3], idadeInt, dados[5],
                dados[6], dados[7], dados[8], dados[9]));
    }

    /* METODO PARA LIMPAR TODO O ARQUIVO TXT. */
    public void limparArqDetento() throws IOException {
        BufferedWriter escreveBuffer;
        try {
            escreveBuffer = new BufferedWriter(new FileWriter("CadastroDetento.txt", false));
            escreveBuffer.write("");
            escreveBuffer.flush();
            escreveBuffer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir, ou fechar arquivo");
        }
    }
}
