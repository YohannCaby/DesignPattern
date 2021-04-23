package fr.ycaby.dp.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {
    AnimalFactory factory;
    @Test
    public void dogFactoryTest(){
        factory = new DogFactory();
        Assert.assertEquals(factory.createAnimal().screaming(),"Wouaff!");
    }
    @Test
    public void catFactory(){
        factory = new CatFactory();
        Assert.assertEquals(factory.createAnimal().screaming(),"Miaouuu!");
    }
    @Test
    public void birdFactory(){
        factory = new BirdFactory();
        Assert.assertEquals(factory.createAnimal().screaming(),"CuiCui!");
    }
}
