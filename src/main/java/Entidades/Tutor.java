package Entidades;

import java.util.ArrayList;

public class Tutor extends Pessoa{

    int qtdeAnimalSobCustodio;
    ArrayList<Historico> historicoDeAdocoes;

    public Tutor(String CPF, String endereco, String nome, String dataDeNascimento, String email, String senha, String telefone, int qtdeAnimalSobCustodio) {
        super(CPF, endereco, nome, dataDeNascimento, email, senha, telefone);
        setQtdeAnimalSobCustodio(qtdeAnimalSobCustodio);
    }

    public int getQtdeAnimalSobCustodio() {
        return qtdeAnimalSobCustodio;
    }

    public void setQtdeAnimalSobCustodio(int qtdeAnimalSobCustodio) {
        this.qtdeAnimalSobCustodio = qtdeAnimalSobCustodio;
    }

    public ArrayList<Historico> getHistoricoDeAdocoes() {
        return historicoDeAdocoes;
    }

    public  void addAdocaoToHistorico(Historico historico){
        historicoDeAdocoes.add(historico);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                super.toString() + '\'' +
                "qtdeAnimalSobCustodio=" + qtdeAnimalSobCustodio +
                '}';
    }
}
