package fr.ycaby.dp.factory;

public class CatFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Cat("Miaouuu!");
    }
}
