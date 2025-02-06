package Entidades;

import java.util.ArrayList;

public class Usuario extends Pessoa{

    private ArrayList<Historico> historicoDeAdocoes;
    private Preferencias preferenciasDeAdocao;

    private boolean status = true;
    public Usuario(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone) {
        super(CPF, endereco, nome, dataDeNascimento, email, senha, telefone);
    }

    public ArrayList<Historico> getHistoricoDeAdocoes() {
        return historicoDeAdocoes;
    }

    public  void addAdocaoToHistorico(Historico historico){
        historicoDeAdocoes.add(historico);
    }

    public Preferencias getPreferenciasDeAdocao() {
        return preferenciasDeAdocao;
    }

    public void setPreferenciasDeAdocao(Preferencias preferenciasDeAdocao) {
        this.preferenciasDeAdocao = preferenciasDeAdocao;
    }

    public boolean getStatus() {
        return status;
    }

    public void changeStatus() {
        this.status = !status;
    }

    @Override
    public String toString() {
        return "Usuário{" +
                super.toString() + '\'' +
                ", historicoDeAdocoes=" + historicoDeAdocoes + '\'' +
                ", preferenciasDeAdocao=" + preferenciasDeAdocao + '\'' +
                ", status=" + status +
                '}';
    }
}
