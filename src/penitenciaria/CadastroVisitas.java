package penitenciaria;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroVisitas {

    public static StringBuffer memoriaVisit = new StringBuffer();

    //APAGA TUDO OQUE ESTÁ NA MEMORIA E INICIA ELA RECEBENDO TODO CONTEUDO DO ARQUIVO
    public static void iniciarMemoria() {
        String linha = "";

        try {
            FileReader lerArquivo = new FileReader("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt");
            BufferedReader lerBuffer = new BufferedReader(lerArquivo);

            memoriaVisit.delete(0, memoriaVisit.length());

            linha = lerBuffer.readLine();
            while (linha != null) {
                memoriaVisit.append(linha + "\n");
                linha = lerBuffer.readLine();
            }

        } catch (FileNotFoundException erro1) {
            JOptionPane.showMessageDialog(null, "Erro! Arquivo não encontrado");
        } catch (IOException erro2) {
            JOptionPane.showMessageDialog(null, "Erro na leitura");
        }

    }

    public static void gravarDadosArq() {
        try {
            FileWriter entrada = new FileWriter("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt");
            BufferedWriter lerBuffer = new BufferedWriter(entrada);

            lerBuffer.write(memoriaVisit.toString());
            lerBuffer.flush();
            lerBuffer.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível ler Arquivo");
        }

    }

//    METODO PARA CADASTRAR VISITANTES QUE IRA SER CHAMADA DO JFRAME TelaCadastroVisit,
//    QUE IRÁ PASSAR POR PARAMETRO OS DADOS OBTIDOS PELA TELA.
    public static void cadastroVisitante(String nome, int codigo, int idade, String sexo, String ala, String setor, String cela,
            String crDetento, String parentesco) {
            JOptionPane.showMessageDialog(null, " " + nome);
            /*
        try {
            FileWriter escreverArquivo = new FileWriter("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt");
            BufferedWriter escreverBuffer = new BufferedWriter(escreverArquivo);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível gravar");
        }*/
    }

}
