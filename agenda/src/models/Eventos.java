package models;

public class Eventos {
    private int id;
    private String nome;
    private String datainicial;
    private String datafinal;
    private String local;

    public Eventos() {
    }

    public Eventos(int id, String nome, String datainicial, String datafinal, String local) {
        this.id = id;
        this.nome = nome;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.local = local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}


