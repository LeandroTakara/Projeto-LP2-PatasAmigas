package Entidades;

public class Animal {

    private int ID;
    private static int IDGenerator = 1;

    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private String sex;
    private String data_DeResgate;
    private String StatusDeAdocao = "Não adotado";
    private String historicoMedico;

    private Usuario pessoaEmPosse;

    public Animal(String nome, String especie, String raca, int idade, String sex, String data_DeResgate, String historicoMedico, Usuario pessoaEmPosse) {
        setID();
        setNome(nome);
        setEspecie(especie);
        setRaca(raca);
        setIdade(idade);
        setSex(sex);
        setData_DeResgate(data_DeResgate);
        setHistoricoMedico(historicoMedico);
        setPessoaEmPosse(pessoaEmPosse);
    }

    private void setID(){
        this.ID = IDGenerator++;
    }

    public int getID() {
        return ID;
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

    public Usuario getPessoaEmPosse() {
        return pessoaEmPosse;
    }

    public void setPessoaEmPosse(Usuario pessoaEmPosse) {
        this.pessoaEmPosse = pessoaEmPosse;
    }
}
