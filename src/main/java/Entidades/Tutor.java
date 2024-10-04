package Entidades;

import java.util.ArrayList;

public class Tutor extends Pessoa{

    private int qtdeAnimalSobCustodio;
    private ArrayList<Historico> historicoDeAdocoes;
    private boolean status = true;

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

    public boolean getStatus() {
        return status;
    }

    public void changeStatus() {
        this.status = !status;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                super.toString() + '\'' +
                ", qtdeAnimalSobCustodio=" + qtdeAnimalSobCustodio + '\'' +
                ", status=" + status +
                '}';
    }
}
