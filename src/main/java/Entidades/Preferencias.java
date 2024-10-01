package Entidades;

public class Preferencias {

    String especie;
    int idadeMinima;
    int idadeMaxima;
    String raca;
    String sex;

    public Preferencias(String especie, int idadeMinima, int idadeMaxima, String raca, String sex) {
        setEspecie(especie);
        setIdadeMinima(idadeMinima);
        setIdadeMaxima(idadeMaxima);
        setRaca(raca);
        setSex(sex);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
