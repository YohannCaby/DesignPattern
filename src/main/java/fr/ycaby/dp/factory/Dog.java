package fr.ycaby.dp.factory;

public class Dog implements Animal{
    String scream;

    public String getScream() {
        return scream;
    }

    public void setScream(String scream) {
        this.scream = scream;
    }

    public Dog(){

    }

    public Dog(String scream) {
        this.scream = scream;
    }

    @Override
    public String screaming() {
        return getScream();
    }
}
