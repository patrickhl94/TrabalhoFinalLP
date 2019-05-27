package penitenciaria;

public class Presidiario extends Pessoa {
    //static final String 121 = "Homicidio";

    private String crime;
    private boolean condenacao;
    private int tempoPena;

    public Presidiario(String crime, boolean condenacao, int tempoPena,
            String nome, int nascimento, int cod_pessoa, String sexo,
            String ala, String setor, String cela) {

        super(nome, nascimento, cod_pessoa, sexo, ala, setor, cela);
        this.crime = crime;
        this.condenacao = condenacao;
        this.tempoPena = tempoPena;
    }

    public Presidiario() {
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
        return this.getCod_pessoa() + "\t" + this.getNome() + "\t" + this.getSexo() + "\t"
                + this.getIdade() + "\t" + this.getAla() + "\t" + this.getSetor() + "\t"
                + this.getCela() + "\t" + this.crime + "\t" + this.condenacao + "\t"
                + this.tempoPena + "\n";
    }

}
