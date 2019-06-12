package penitenciaria;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ControleVisitas extends Cadastro {

    //ATRIBUTO
    private ArrayList<Pessoa> bancoDados = new ArrayList<>();

    /* CONSTRUTOR QUE INICIA O ATRIBUTO bancoDados RECEBENDO O METODO lerArquivoVisitas DA CLASSE
    LerArquivo */
    public ControleVisitas() throws FileNotFoundException {
        LerArquivo arqTxt = new LerArquivo();
        this.bancoDados = arqTxt.lerArquivoVisitas();
    }

    /* INSERIR VISITAS NO SISTEMA. ESTE METODO VAI VEIRIFICAR SE JA EXISTE O USUARIO NO ATRIBUTO 
    bancoDados E VAI RETORNAR NULL SE NÃO ENCONTRAR OU SE ENCONTRAR VAI RETORNAR O OBJETO ENCONTRADO*/
    public Visitante pesquisaVisitas(String rg) {
        /*O presidio terá um numero maximo de visitantes por dia, essse valor
            será definido no final do projeto, a principio ficará 5 para testes */

        Visitante novo;
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

    //TO STRING
    @Override
    public String toString() {
        return "ControleVisitas{" + "visitas=" + bancoDados + '}';
    }
}
