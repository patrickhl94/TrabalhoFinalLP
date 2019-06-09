package penitenciaria;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.TelaCadastroDetento;

public class CadastroPresidi extends TelaCadastroDetento{

    static StringBuffer memoriaPres = new StringBuffer();

    //APAGA TUDO OQUE ESTÁ NA MEMORIA E INICIA ELA RECEBENDO TODO CONTEUDO DO ARQUIVO
    public static void iniciarMemoria() {
        String linha = "";
       
        try {
            FileReader entrada = new FileReader("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroPresidi.txt");
            BufferedReader lerBuffer = new BufferedReader(entrada);

            memoriaPres.delete(0, memoriaPres.length());

            while ((linha = lerBuffer.readLine()) != null) {
                memoriaPres.append(linha + "\n");
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
                    + "\\src\\arquivosTXT\\CadastroPresidi.txt");
            BufferedWriter escreveBuffer = new BufferedWriter(entrada);

            escreveBuffer.write(memoriaPres.toString());
            escreveBuffer.flush();
            escreveBuffer.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível gravar");
        }

    }
}
