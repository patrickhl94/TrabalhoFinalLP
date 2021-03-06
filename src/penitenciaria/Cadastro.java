package penitenciaria;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastro {

    /* ATRIBUTOS DO TIPO PESSOA, CRIADO UM ATRIBUTO PARA VISITANTE E UM PARA DETENTOS, TENDO EM VISTA QUE ELES SÃO 
    USADOS EM MAIS DE UM METODO*/
    public ArrayList<Pessoa> cadVisita = new ArrayList<>();
    public ArrayList<Pessoa> cadDetento = new ArrayList<>();

    /* TO STRING QUE SERÁ UTILIZADO PARA CADASTRAR O ARRAYLIST NO DOCUMENTO TXT
    RECEBE POR PARAMETRO UM OBJETO DO TIPO ARRAYLIST QUE SERÁ O cadDetento OU cadVisita, INICIA UM
    FOR, ONDE A VARIAVEL aux IRÁ RECEBER A CADA LOOP O TOSTRING DO OBJETO PASSADO PELO ATRIBUTO*/
    public String toString(ArrayList<Pessoa> cad) {
        String aux = "";
        for (Pessoa p : cad) {
            aux += p.toString();
        }
        return aux;
    }

    /* METODO PARA CADASTRAR VISITANTES QUE IRA SER CHAMADA DO JFRAME TelaCadastroVisit,
    QUE IRÁ RECEBER POR PARAMETRO OS DADOS OBTIDOS PELA TELA. */
    public void cadastroVisitante(String nome, String idade, String rg, String sexo, String ala, String setor,
            String cela, String crDetento, String parentesco) throws FileNotFoundException, IOException {

        BufferedWriter escreveBufferVisit;
        escreveBufferVisit = new BufferedWriter(new FileWriter("CadastroVisita.txt", true));

        //CONVERSÃO DAS VARIAVEIS PARA O TIPO DOS ATRIBUTOS DO OBJETO 
        int idadeInt = Integer.parseInt(idade);
        int crDetentoInt = Integer.parseInt(crDetento);

        /* INSTANCIA UM OBJETO DA CLASSE LerArquivo, E ATRIBUI O RETORNO DO METODO lerArquivoVisitas AO ATRIBUTO
        cadVisita*/
        LerArquivo leitura = new LerArquivo();
        cadVisita = leitura.lerArquivoVisitas();

        if (!this.cadVisita.isEmpty()) {
            boolean achou = false;

            for (int i = 0; i < this.cadVisita.size(); i++) {
                if (this.cadVisita.get(i).getRg().equals(rg)) {
                    achou = true;
                }
            }

            if (achou) {
                JOptionPane.showMessageDialog(null, "Já existe em nosso banco de dados um cadastro com este RG");

            } else {
                this.cadVisita.add(new Visitante(parentesco, nome, idadeInt, rg, sexo, ala, setor, cela, crDetentoInt));
                leitura.limparArqVisitas();
                escreveBufferVisit.write(toString(this.cadVisita));
                escreveBufferVisit.flush();
                escreveBufferVisit.close();
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
            }

        } else {
            this.cadVisita.add(new Visitante(parentesco, nome, idadeInt, rg, sexo, ala, setor, cela, crDetentoInt));
            leitura.limparArqVisitas();
            escreveBufferVisit.write(toString(this.cadVisita));
            escreveBufferVisit.flush();
            escreveBufferVisit.close();
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        }
    }

    /*METODO PARA ATUALIZAR */
    public void atualizaVisit(String nome, String idade, String rg, String sexo, String ala, String setor,
            String cela, String crDetento, String parentesco) throws IOException {

        BufferedWriter escreveBufferVisit;
        escreveBufferVisit = new BufferedWriter(new FileWriter("CadastroVisita.txt", true));

        //CONVERSÃO DAS VARIAVEIS PARA O TIPO DOS ATRIBUTOS DO OBJETO 
        int idadeInt = Integer.parseInt(idade);
        int crDetentoInt = Integer.parseInt(crDetento);

        LerArquivo leitura = new LerArquivo();
        this.cadVisita = leitura.lerArquivoVisitas();

        for (int i = 0; i < this.cadVisita.size(); i++) {
            if (this.cadVisita.get(i).getRg().equals(rg)) {
                this.cadVisita.remove(i);
            }
        }
        this.cadVisita.add(new Visitante(parentesco, nome, idadeInt, rg, sexo, ala, setor, cela, crDetentoInt));
        leitura.limparArqVisitas();
        escreveBufferVisit.write(toString(this.cadVisita));
        escreveBufferVisit.flush();
        escreveBufferVisit.close();
        JOptionPane.showMessageDialog(null, "Atualização Realizada com Sucesso!");

    }

    //CADASTRO DE DETENTOS
    public void cadastroDetento(String crime, String condenacao, String tempoPena, String nome, String idade, String rg, String sexo,
            String ala, String setor, String cela) throws IOException {

        BufferedWriter escreveBufferDeten;
        escreveBufferDeten = new BufferedWriter(new FileWriter("CadastroDetento.txt", true));

        //CONVERSÃO DAS VARIAVEIS PARA O TIPO DOS ATRIBUTOS DO OBJETO 
        int tempPena = Integer.parseInt(tempoPena);
        int idadeInt = Integer.parseInt(idade);

        LerArquivo leitura = new LerArquivo();
        cadDetento = leitura.lerArquivoDetento();

        if (!this.cadDetento.isEmpty()) {
            boolean achou = false;

            for (int i = 0; i < cadDetento.size(); i++) {
                if (this.cadDetento.get(i).getRg().equals(rg)) {
                    achou = true;
                }
            }

            if (achou) {
                JOptionPane.showMessageDialog(null, "Já existe em nosso banco de dados um cadastro com este Código de Detento");

            } else {
                this.cadDetento.add(new Detento(crime, condenacao, tempPena, nome, idadeInt, rg, sexo, ala, setor, cela));
                leitura.limparArqDetento();
                escreveBufferDeten.write(toString(this.cadDetento));
                escreveBufferDeten.flush();
                escreveBufferDeten.close();
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
            }

        } else {
            this.cadDetento.add(new Detento(crime, condenacao, tempPena, nome, idadeInt, rg, sexo, ala, setor, cela));
            leitura.limparArqDetento();
            escreveBufferDeten.write(toString(this.cadDetento));
            escreveBufferDeten.flush();
            escreveBufferDeten.close();
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        }

    }

    public void atualizaDetento(String nome, String codDeten, String idade, String sexo, String ala, String setor, String cela,
            String condenacao, String crime, String tempPena) throws IOException {

        BufferedWriter escreveBufferDeten;
        escreveBufferDeten = new BufferedWriter(new FileWriter("CadastroDetento.txt", true));

        //CONVERSÃO DAS VARIAVEIS PARA O TIPO DOS ATRIBUTOS DO OBJETO 
        int idadeInt = Integer.parseInt(idade);
        int tempoPena = Integer.parseInt(tempPena);

        LerArquivo leitura = new LerArquivo();
        this.cadDetento = leitura.lerArquivoDetento();

        for (int i = 0; i < this.cadDetento.size(); i++) {
            if (this.cadDetento.get(i).getRg().equals(codDeten)) {
                this.cadDetento.remove(i);
            }
        }

        this.cadDetento.add(new Detento(crime, condenacao, tempoPena, nome, idadeInt, codDeten, sexo, ala, setor, cela));
        leitura.limparArqDetento();
        escreveBufferDeten.write(toString(this.cadDetento));
        escreveBufferDeten.flush();
        escreveBufferDeten.close();
        JOptionPane.showMessageDialog(null, "Atualização Realizada com Sucesso!");

    }
}
