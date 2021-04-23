package fr.ycaby.dp.factory;

public class Bird implements Animal{
    String scream;
    public String getScream() {
        return scream;
    }

    public void setScream(String scream) {
        this.scream = scream;
    }

    public Bird() {
    }

    public Bird(String scream) {
        this.scream = scream;
    }

    @Override
    public String screaming() {
        return getScream();
    }
}
