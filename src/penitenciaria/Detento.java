package penitenciaria;

public class Detento extends Pessoa {

    //CONSTRUTORES
    private String crime;
    private String condenacao;
    private int tempoPena;

    //CONSTRUTOR PADRAO
    public Detento(String crime, String condenacao, int tempoPena, String nome, int idade, String rg, String sexo, String ala, String setor, String cela) {
        super(nome, idade, rg, sexo, ala, setor, cela);
        this.crime = crime;
        this.condenacao = condenacao;
        this.tempoPena = tempoPena;
    }

    //CONSTRUTOR VAZIO
    public Detento() {
        super();
        this.crime = "";
        this.condenacao = "";
        this.tempoPena = 0;
    }

    //GETS E SETS
    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getCondenacao() {
        return condenacao;
    }

    public void setCondenacao(String condenacao) {
        this.condenacao = condenacao;
    }

    public int getTempoPena() {
        return tempoPena;
    }

    public void setTempoPena(int tempoPena) {
        this.tempoPena = tempoPena;
    }

    //TO STRING SEPARADOS POR ; PARA GRAVAR EM ARQUIVO TXT
    @Override
    public String toString() {
        return this.crime + ";" + this.condenacao + ";" + this.tempoPena + ";" + this.getNome() + ";" + this.getIdade() + ";"
                + this.getRg() + ";" + this.getSexo() + ";" + this.getAla() + ";"
                + this.getSetor() + ";" + this.getCela() + "\n";
    }

}
