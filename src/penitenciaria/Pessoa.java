package penitenciaria;

public abstract class Pessoa {

    //ATRIBUTOS
    private String nome;
    private int idade;
    private String rg;
    private String sexo;
    private String ala;
    private String setor;
    private String cela;

    // CONSTRUTOR PADRÃO
    public Pessoa(String nome, int idade, String rg, String sexo, String ala, String setor, String cela) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.sexo = sexo;
        this.ala = ala;
        this.setor = setor;
        this.cela = cela;
    }

    //CONSTRUTOR VAZIO
    public Pessoa() {
        this.ala = "";
        this.cela = "";
        this.idade = 0;
        this.setor = "";
        this.nome = "";
        this.sexo = "";
    }

    //GETS E SETS
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCela() {
        return cela;
    }

    public void setCela(String cela) {
        this.cela = cela;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", cod_pessoa="
                + ", rg=" + rg + ", sexo=" + sexo + ", ala=" + ala + ", setor=" + setor + ", cela=" + cela + '}';
    }
}
