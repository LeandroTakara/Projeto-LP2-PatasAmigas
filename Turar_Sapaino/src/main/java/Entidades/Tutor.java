package Entidades;

public class Tutor extends Pessoa{

    int qtdeAnimalSobCustodio;

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
}
