package Entidades;

public class Historico {

    private int ID;
    private static int IDGenerator = 0;
    private Adotante adotante;
    private Tutor tutor;
    private Animal animal;
    private String dataDeAdocao;

    public Historico(Adotante adotante, Tutor tutor, Animal animal, String dataDeAdocao) {
        setID();
        setAdotante(adotante);
        setTutor(tutor);
        setAnimal(animal);
        setDataDeAdocao(dataDeAdocao);
    }

    private void setID(){
        this.ID = IDGenerator++;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getDataDeAdocao() {
        return dataDeAdocao;
    }

    public void setDataDeAdocao(String dataDeAdocao) {
        this.dataDeAdocao = dataDeAdocao;
    }
}
