package penitenciaria;

import java.util.ArrayList;

public class ControleVisitas {

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

    
}
