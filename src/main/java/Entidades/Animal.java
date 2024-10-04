package Entidades;

public class Animal {

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sex;
    private String data_DeResgate;
    private String StatusDeAdocao;
    private String historicoMedico;

    public Animal(String nome, String especie, String raca, int idade, String sex, String data_DeResgate, String statusDeAdocao, String historicoMedico) {
        setNome(nome);
        setEspecie(especie);
        setRaca(raca);
        setIdade(idade);
        setSex(sex);
        setData_DeResgate(data_DeResgate);
        setStatusDeAdocao(statusDeAdocao);
        setHistoricoMedico(historicoMedico);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getData_DeResgate() {
        return data_DeResgate;
    }

    public void setData_DeResgate(String data_DeResgate) {
        this.data_DeResgate = data_DeResgate;
    }

    public String getStatusDeAdocao() {
        return StatusDeAdocao;
    }

    public void setStatusDeAdocao(String statusDeAdocao) {
        StatusDeAdocao = statusDeAdocao;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }
}
