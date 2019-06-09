package penitenciaria;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.scripts.JO;
import telas.TelaGerenciamentoVisitas;

public class ControleVisitas extends Cadastro {

    private ArrayList<Pessoa> bancoDados = new ArrayList<>();

    public ControleVisitas() throws FileNotFoundException {
        LerArquivo arqTxt = new LerArquivo();
        this.bancoDados = arqTxt.lerArquivoVisitas();
    }

    @Override
    public String toString() {
        return "ControleVisitas{" + "visitas=" + bancoDados + '}';
    }

    // INSERIR VISITAS NO SISTEMA.
    public Visitante pesquisaVisitas(String rg) {
        /*O presidio terá um numero maximo de visitantes por dia, essse valor
            será definido no final do projeto, a principio ficará 5 para testes */

        Visitante novo = null;
        for (Pessoa pess : this.bancoDados) {
            if (pess instanceof Visitante) {

                novo = (Visitante) pess;
                if (rg.equalsIgnoreCase(novo.getRg())) {

                    return novo;
                }
            }
        }
        return null;
    }
}
