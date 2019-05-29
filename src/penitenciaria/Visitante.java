package penitenciaria;

public class Visitante extends Pessoa {

    private String parentesco;
    private int crDetento;

    public Visitante(String parentesco, String nome, int idade, String rg, String sexo, String ala, String setor, String cela, int crDeten) {
        super(nome, idade, rg, sexo, ala, setor, cela);
        this.parentesco = parentesco;
        this.crDetento = crDeten;
    }

    public Visitante(String parentesco, int crDetento) {
        this.parentesco = parentesco;
        this.crDetento = crDetento;
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
        return this.getCod_pessoa() + "\t" + this.getNome() + "\t" + this.getSexo() + "\t"
                + this.getIdade() + "\t" + this.parentesco + "\t" + this.getRg() + "\t"
                + this.getAla() + "\t" + this.getSetor() + "\t" + this.getCela() + "\t"
                + this.crDetento + "\n";
    }

}
