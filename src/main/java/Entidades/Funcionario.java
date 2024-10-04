package Entidades;

public class Funcionario extends Pessoa{

    private String dataDeContratacao;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone, String dataDeContratacao, String cargo, double salario, String departamento) {
        super(CPF, endereco, nome, dataDeNascimento, email, senha, telefone);
        setDataDeContratacao(dataDeContratacao);
        setCargo(cargo);
        setSalario(salario);
        setDepartamento(departamento);
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                super.toString() + '\'' +
                ", dataDeContratacao='" + dataDeContratacao + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario='" + salario + '\'' +
                ", departamento='" + departamento +
                '}';
    }
}
