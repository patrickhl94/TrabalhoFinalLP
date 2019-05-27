package penitenciaria;

import java.util.ArrayList;

public class ControleVisitas extends CadastroVisitas{

    private ArrayList<Visitante> visitas;

    public ControleVisitas(ArrayList<Visitante> visitas) {
        this.visitas = visitas;
    }

    public Visitante getVisitas(int indice) {
        return visitas.get(indice);
    }

    public void setVisitas(ArrayList<Visitante> visitas) {
        this.visitas = visitas;
    }

    @Override
    public String toString() {
        return "ControleVisitas{" + "visitas=" + visitas + '}';
    }

    // INSERIR VISITAS NO SISTEMA.
    public boolean inserirVisitas(Visitante novo) {
        /*O presidio terá um numero maximo de visitantes por dia, essse valor 
        será definido no final do projeto, a principio ficará 5 para testes */

        if (this.visitas.size() <= 5) {
            this.visitas.add(novo);
            return true;
        } else {
            return false;
        }
    }

    // PESQUISAR VISITAS
    /* Está pesquisa é lenta tendo em vista que irá percorrer sequencialmente o array
    até encontrar o codigo diferente (VERIFICAR COM A PROFESSORA SE EXISTE UMA FORMA MAIS RAPIDA)*/
    public int pesquisarVisitas(String codigo) {
        int i = 0;
        while (!codigo.equals(this.visitas.get(i).getCod_pessoa()) || i < this.visitas.size()) {
            i++;
        }
        return i;
    }

    // REMOVER VISITAS
    /*VERIFICAR COM A PROFESSORA COMO REMOVER PELO OBJETO AO INVES DE REMOVER PELO INDICE*/
    public boolean removerVisitas(String codigo) {
        int indice = this.pesquisarVisitas(codigo);

        if (indice != this.visitas.size()) {
            this.visitas.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    //ALTERAR DADOS DO VISITANTE
    public boolean alterarDadosVisit(String codigo, Visitante novo) {
        int indice = this.pesquisarVisitas(codigo);

        if (indice != this.visitas.size()) {
            this.visitas.set(indice, novo);
            return true;
        } else {
            return false;
        }
    }    
}
