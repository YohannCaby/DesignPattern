package fr.ycaby.dp.factory;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog("Wouaff!");
    }
}
