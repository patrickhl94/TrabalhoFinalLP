package penitenciaria;

public class Visitante extends Pessoa {

    private String parentesco;
    private Presidiario presidi;

    public Visitante(String parentesco, Presidiario presidi, String nome, int idade, int cod_pessoa, String sexo, String ala, String setor, String cela) {
        super(nome, idade, cod_pessoa, sexo, ala, setor, cela);
        this.parentesco = parentesco;
        this.presidi = presidi;
    }

    public Visitante(String parentesco, Presidiario presidi) {
        this.parentesco = parentesco;
        this.presidi = presidi;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Presidiario getPresidi() {
        return presidi;
    }

    public void setPresidi(Presidiario presidi) {
        this.presidi = presidi;
    }

    @Override
    public String toString() {
        return this.getCod_pessoa() + "\t" + this.getNome() + "\t" + this.getSexo() + "\t"
                + this.getIdade() + "\t" + this.parentesco + "\t" + this.presidi + "\t" 
                + this.getAla() + "\t" + this.getSetor() + "\t" + this.getCela() + "\n";
    }

}
