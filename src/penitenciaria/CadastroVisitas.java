package penitenciaria;

import java.awt.HeadlessException;
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
            BufferedReader lerBuffer = new BufferedReader(new FileReader("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt"));

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

            BufferedWriter escreveBuffer = new BufferedWriter(new FileWriter("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt"));

            escreveBuffer.write(memoriaVisit.toString());
            escreveBuffer.flush();
            escreveBuffer.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível ler Arquivo");
        }

    }

//    METODO PARA CADASTRAR VISITANTES QUE IRA SER CHAMADA DO JFRAME TelaCadastroVisit,
//    QUE IRÁ PASSAR POR PARAMETRO OS DADOS OBTIDOS PELA TELA.
    public static void cadastroVisitante(String nome, String idade, String rg, String sexo, String ala, String setor,
            String cela, String crDetento, String parentesco) {

        iniciarMemoria();

        try {
            BufferedWriter escreveBuffer = new BufferedWriter(new FileWriter("C:\\Users\\patri\\OneDrive\\"
                    + "Área de Trabalho\\DEVELOPER\\Projeto NetBeans\\Trabalho_Final_LP"
                    + "\\src\\arquivosTXT\\CadastroVisit.txt", true));

            if (memoriaVisit.length() != 0) {

                if (memoriaVisit.indexOf(rg) == -1) {

                    Visitante novo = new Visitante(parentesco, nome, Integer.parseInt(idade), rg, sexo, ala, setor, cela, Integer.parseInt(crDetento));
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
                    escreveBuffer.write(novo.toString());
                    escreveBuffer.flush();
                    escreveBuffer.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Já existe em nosso banco de dados um cadastro com este RG");
                }

            } else {
                Visitante novo = new Visitante(parentesco, nome, Integer.parseInt(idade), rg, sexo, ala, setor, cela, Integer.parseInt(crDetento));
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
                escreveBuffer.write(novo.toString());
                escreveBuffer.flush();
                escreveBuffer.close();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível gravar");
        }

    }

    public static Visitante pesquisarVisitante(String rg) {
        String parentesco, nome, idade, sexo, ala, setor, cela, crDeten;
        int inicio, fim, primeiro, ultimo;

        iniciarMemoria();

        if (memoriaVisit.length() != 0) {
            // String codigoStr = Integer.toString(codigo);
            inicio = memoriaVisit.indexOf(rg);

            if (inicio != -1) {
                ultimo = memoriaVisit.indexOf("\t", inicio);
                rg = memoriaVisit.substring(inicio, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                nome = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                sexo = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                idade = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                parentesco = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                ala = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                setor = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                ultimo = memoriaVisit.indexOf("\t", primeiro);
                cela = memoriaVisit.substring(primeiro, ultimo);
                primeiro = ultimo + 1;
                fim = memoriaVisit.indexOf("\n", primeiro);
                crDeten = memoriaVisit.substring(primeiro, fim);

                //CONVERTENDO AS STRINGS PARA INT
                int idadeInt = Integer.parseInt(idade);
                int crDetenInt = Integer.parseInt(crDeten);
                Visitante pesquisa = new Visitante(parentesco, nome, idadeInt, rg, sexo, ala, setor, cela, crDetenInt);
                return pesquisa;
            } else {
                JOptionPane.showMessageDialog(null, "RG não cadastrado!");
                return null;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não existem visitantes cadastrados!");
            return null;
        }

    }

}
