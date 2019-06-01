package penitenciaria;

public class Visitante extends Pessoa {

    private String parentesco;
    private int crDetento;

    public Visitante(String parentesco, String nome, int idade, String rg, String sexo, String ala, String setor, String cela, int crDeten) {
        super(nome, idade, rg, sexo, ala, setor, cela);
        this.parentesco = parentesco;
        this.crDetento = crDeten;
    }

    public Visitante() {

    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getCrDetento() {
        return crDetento;
    }

    public void setCrDetento(int crDetento) {
        this.crDetento = crDetento;
    }

    @Override
    public String toString() {
        return this.parentesco + ";" + this.getNome() + ";" + this.getIdade() + ";"
                + this.getRg() + ";" + this.getSexo() + ";" + this.getAla() + ";"
                + this.getSetor() + ";" + this.getCela() + ";" + this.crDetento + "\n";
    }

}
