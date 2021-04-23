package fr.ycaby.dp.factory;

public class BirdFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Bird("CuiCui!");
    }
}
