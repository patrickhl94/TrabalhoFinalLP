package penitenciaria;

public class Detento extends Pessoa {

    private String crime;
    private boolean condenacao;
    private int tempoPena;

    public Detento(String crime, boolean condenacao, int tempoPena, String nome, int idade, String rg, String sexo, String ala, String setor, String cela) {
        super(nome, idade, rg, sexo, ala, setor, cela);
        this.crime = crime;
        this.condenacao = condenacao;
        this.tempoPena = tempoPena;
    }

    public Detento() {
        super();
        this.crime = "";
        this.condenacao = false;
        this.tempoPena = 0;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public boolean isCondenacao() {
        return condenacao;
    }

    public void setCondenacao(boolean pena) {
        this.condenacao = pena;
    }

    public int getTempoPena() {
        return tempoPena;
    }

    public void setTempoPena(int tempoPena) {
        this.tempoPena = tempoPena;
    }

    @Override
    public String toString() {
        return this.crime + ";" + this.condenacao + ";" + this.tempoPena + ";" + this.getNome() + ";" + this.getIdade() + ";"
                + this.getRg() + ";" + this.getSexo() + ";" + this.getAla() + ";"
                + this.getSetor() + ";" + this.getCela() + "\n";
    }

}
