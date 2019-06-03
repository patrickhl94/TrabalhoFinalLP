package penitenciaria;

import java.util.ArrayList;

public class ControleVisitas extends Cadastro{

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
}
