package Entidades;

import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import Util.Encriptador;


public abstract class Pessoa {
    private int ID;
    private static int IDGenerator = 0;
    private String CPF;
    private String dataDeNascimento;
    private String email;
    private String endereco;
    private String nome;
    private String senha;
    private String telefone;

    public Pessoa(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone){
        setID();
        setCPF(CPF);
        setEndereco(endereco);
        setNome(nome);
        setDataDeNascimento(dataDeNascimento);
        setEmail(email);
        setSenha(senha);
        setTelefone(telefone);
    }

    private void setID(){
        this.ID = IDGenerator++;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        try {
            this.senha = Encriptador.encriptar(senha);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("[ERRO] Não foi possível encriptar a senha");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", CPF='" + CPF + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(CPF, pessoa.CPF) || (Objects.equals(email, pessoa.email) && Objects.equals(senha, pessoa.senha));
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, senha);
    }
}
