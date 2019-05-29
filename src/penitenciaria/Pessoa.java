package penitenciaria;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private int cod_pessoa;
    private String rg;
    private String sexo;
    private String ala;
    private String setor;
    private String cela;

    public Pessoa(String nome, int idade, int cod_pessoa, String sexo, String ala, String setor, String cela) {
        this.nome = nome;
        this.idade = idade;
        this.cod_pessoa = cod_pessoa;
        this.sexo = sexo;
        this.ala = ala;
        this.setor = setor;
        this.cela = cela;
    }

    public Pessoa(String nome, int idade, String rg, String sexo, String ala, String setor, String cela) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.sexo = sexo;
        this.ala = ala;
        this.setor = setor;
        this.cela = cela;
    }

    public Pessoa() {
        this.ala = "";
        this.cela = "";
        this.idade = 0;
        this.setor = "";
        this.nome = "";
        this.cod_pessoa = 0;
        this.sexo = "";

    }

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

    public int getCod_pessoa() {
        return cod_pessoa;
    }

    private void setCod_pessoa(int cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", cod_pessoa=" + cod_pessoa
                + ", rg=" + rg + ", sexo=" + sexo + ", ala=" + ala + ", setor=" + setor + ", cela=" + cela + '}';
    }

}
