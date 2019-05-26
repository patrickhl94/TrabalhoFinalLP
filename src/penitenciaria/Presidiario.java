package penitenciaria;

public class Presidiario extends Pessoa {
    //static final String 121 = "Homicidio";

    private String crime;
    private boolean pena;
    private int tempoPena;

    public Presidiario(String crime, boolean pena, int tempoPena,
            String nome, int idade, int cod_pessoa, String sexo,
            String ala, String setor, String cela) {

        super(nome, idade, cod_pessoa, sexo, ala, setor, cela);
        this.crime = crime;
        this.pena = pena;
        this.tempoPena = tempoPena;
    }

    public Presidiario() {
        super();
        this.crime = "";
        this.pena = false;
        this.tempoPena = 0;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public boolean isPena() {
        return pena;
    }

    public void setPena(boolean pena) {
        this.pena = pena;
    }

    public int getTempoPena() {
        return tempoPena;
    }

    public void setTempoPena(int tempoPena) {
        this.tempoPena = tempoPena;
    }

    @Override
    public String toString() {
        return "Presidiario{" + "crime=" + crime + ", pena=" + pena + ", tempoPena=" + tempoPena + '}';
    }

}
