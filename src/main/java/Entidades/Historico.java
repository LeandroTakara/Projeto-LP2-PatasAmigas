package Entidades;

public class Historico {

    Adotante adotante;
    Tutor tutor;
    String dataDeAdocao;

    public Historico(Adotante adotante, Tutor tutor, String dataDeAdocao) {
        setAdotante(adotante);
        setTutor(tutor);
        setDataAdocao(dataDeAdocao);
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        this.adotante = adotante;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getDataAdocao() {
        return dataDeAdocao;
    }

    public void setDataAdocao(String dataDeAdocao) {
        this.dataDeAdocao = dataDeAdocao;
    }
}
