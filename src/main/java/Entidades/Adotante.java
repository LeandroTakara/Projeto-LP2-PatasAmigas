package Entidades;

import java.util.ArrayList;

public class Adotante extends Pessoa{

    ArrayList<Historico> historicoDeAdocoes;
    Preferencias preferenciasDeAdocao;
    public Adotante(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone) {
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
}
