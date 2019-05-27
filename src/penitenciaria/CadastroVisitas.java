package penitenciaria;

import java.io.*;
import javax.swing.JOptionPane;

public class CadastroVisitas {

    static StringBuffer memoriaVist = new StringBuffer();

    //APAGA TUDO OQUE ESTÁ NA MEMORIA E INICIA ELA RECEBENDO TODO CONTEUDO DO ARQUIVO
    public static void iniciarMemoria() {
        String linha = "";

        try {
            FileReader entrada = new FileReader("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt");
            BufferedReader lerBuffer = new BufferedReader(entrada);

            memoriaVist.delete(0, memoriaVist.length());

            while ((linha = lerBuffer.readLine()) != null) {
                memoriaVist.append(linha + "\n");
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
            BufferedWriter escreveBuffer = new BufferedWriter(entrada);

            escreveBuffer.write(memoriaVist.toString());
            escreveBuffer.flush();
            escreveBuffer.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível gravar");
        }

    }

//    METODO PARA CADASTRAR VISITANTES QUE IRA SER CHAMADA DO JFRAME TelaCadastroVisit,
//    QUE IRÁ PASSAR POR PARAMETRO OS DADOS OBTIDOS PELA TELA.
    public static void cadastroVisitante(String nome) {
        JOptionPane.showMessageDialog(null, "DEU CERTO :D" + " Nome passado " +nome);
    }
}
