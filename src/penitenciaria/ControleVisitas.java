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
            JOptionPane.showMessageDialog(null, "teste 01");
            for (Pessoa pess : this.bancoDados) {
                JOptionPane.showMessageDialog(null, "teste 02");
                if (pess instanceof Visitante) {
                    Visitante novo = (Visitante) pess;

                    if (rg.equalsIgnoreCase(novo.getRg())) {
                        if (TelaGerenciamentoVisitas.tabela.getRowCount() == 0) {
                            JOptionPane.showMessageDialog(null, "teste 03");
                            TelaGerenciamentoVisitas.tabela.addRow(new Object[]{novo.getRg(), novo.getNome(), novo.getIdade(),
                                novo.getSexo(), novo.getCrDetento(), novo.getParentesco(), novo.getAla(),
                                novo.getSetor(), novo.getCela()});
                            achou = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "teste 04-1");
                            int i = 0;
                            for (int j = 0; j < TelaGerenciamentoVisitas.tabela.getRowCount(); j++) {
                                if (rg.equals(TelaGerenciamentoVisitas.tabela.getValueAt(j, 0).toString())) {
                                    JOptionPane.showMessageDialog(null, "Já cadastrado");
                                } else {
                                    TelaGerenciamentoVisitas.tabela.addRow(new Object[]{novo.getRg(), novo.getNome(), novo.getIdade(),
                                        novo.getSexo(), novo.getCrDetento(), novo.getParentesco(), novo.getAla(),
                                        novo.getSetor(), novo.getCela()});
                                    achou = true;
                                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
                                }
                            }

                            /* while (i < TelaGerenciamentoVisitas.tabela.getRowCount() && !rg.equals(TelaGerenciamentoVisitas.tabela.getValueAt(i, 0).toString())) {
                                JOptionPane.showMessageDialog(null, "teste 04");
                                JOptionPane.showMessageDialog(null, "teste 05");

                                i++;
                                if (i > TelaGerenciamentoVisitas.tabela.getRowCount()) {
                                    TelaGerenciamentoVisitas.tabela.addRow(new Object[]{novo.getRg(), novo.getNome(), novo.getIdade(),
                                        novo.getSexo(), novo.getCrDetento(), novo.getParentesco(), novo.getAla(),
                                        novo.getSetor(), novo.getCela()}); */
                        }

                    }

                }
            }
            return achou; //NÃO ACHOU, CHAMAR TELA DE CADASTRO
        } else {
            JOptionPane.showMessageDialog(null, "Presídio com lotação máxima");
            return false;
        }

    }

}
