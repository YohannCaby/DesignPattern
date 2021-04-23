package fr.ycaby.dp.factory;

public class Cat implements Animal {
    String scream;

    public String getScream() {
        return scream;
    }

    public void setScream(String scream) {
        this.scream = scream;
    }

    public Cat() {
    }

    public Cat(String scream) {
        this.scream = scream;
    }

    @Override
    public String screaming() {
        return getScream();
    }
}
