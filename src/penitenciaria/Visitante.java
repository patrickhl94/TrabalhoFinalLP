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
        return this.getCod_pessoa() + ", " + this.getNome() + ", " + this.getSexo() + ", "
                + this.getIdade() + ", " + this.parentesco + ", " + this.getRg() + ", "
                + this.getAla() + ", " + this.getSetor() + ", " + this.getCela() + ", "
                + this.crDetento + "\n";
    }

}
