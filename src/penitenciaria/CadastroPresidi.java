package penitenciaria;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroPresidi {

    static StringBuffer memoria = new StringBuffer();

    //APAGA TUDO OQUE ESTÁ NA MEMORIA E INICIA ELA RECEBENDO TODO CONTEUDO DO ARQUIVO
    public static void iniciarMemoria() {
        String linha = "";

        try {
            FileReader entrada = new FileReader("CadastroPresidi.txt");
            BufferedReader lerBuffer = new BufferedReader(entrada);

            memoria.delete(0, memoria.length());

            while ((linha = lerBuffer.readLine()) != null) {
                memoria.append(linha + "\n");
            }

        } catch (FileNotFoundException erro1) {
            JOptionPane.showMessageDialog(null, "Erro! Arquivo não encontrado");
        } catch (IOException erro2) {
            JOptionPane.showMessageDialog(null, "Erro na leitura");
        }

    }

    public static void gravarDadosArq() {
        try {
            FileWriter entrada = new FileWriter("CadastroPresidi.txt");
            BufferedWriter escreveBuffer = new BufferedWriter(entrada);

            escreveBuffer.write(memoria.toString());
            escreveBuffer.flush();
            escreveBuffer.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível gravar");
        }

    }
}
