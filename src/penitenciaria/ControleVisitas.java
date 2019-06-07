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
    public boolean inserirVisitas(String rg) {
        /*O presidio terá um numero maximo de visitantes por dia, essse valor
            será definido no final do projeto, a principio ficará 5 para testes */

        boolean achou = false;
        if (TelaGerenciamentoVisitas.tabela.getRowCount() < 5) {
            for (Pessoa pess : this.bancoDados) {
                if (pess instanceof Visitante) {
                    Visitante novo = (Visitante) pess;
                    if (rg.equalsIgnoreCase(novo.getRg())) {
                        TelaGerenciamentoVisitas.tabela.addRow(new Object[]{novo.getRg(), novo.getNome(), novo.getIdade(),
                        novo.getSexo(), novo.getCrDetento(), novo.getParentesco(), novo.getAla(),
                        novo.getSetor(), novo.getCela()});
                        achou = true;
                    }
                }
            }
            return achou; //NÃO ACHOU, CHAMAR TELA DE CADASTRO
        } else {
            JOptionPane.showMessageDialog(null, "Presídio com lotação máxima");
            return false;
        }

    }

//    public boolean retirarVisitante(String rg) {
//        boolean achou = false;
//        for (Visitante pess : this.visitas) {
//            if (rg.equalsIgnoreCase(pess.getRg())) {
//                this.visitas.remove(pess);
//                achou = true;
//            }
//        }
//        return achou;
//    }

}
