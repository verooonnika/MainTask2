package by.epam.javatraining.veronikakhlopava.maintask02.util;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Carrot;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Potato;
import org.junit.Test;

import static org.junit.Assert.*;

public class InitializerTest {

    Creator creator = Creator.getInstance();
    Initializer initializer = Initializer.getInstance();


    @Test
    public void customInitPotato() {
        Potato potato = creator.createPotato();
        initializer.customInit(potato, 13, "old");
        assertEquals(potato.getWeight(), 13, 0.1);
        assertEquals(potato.getAge(), "old");
    }

    @Test
    public void customInitCarrot() {
        Carrot carrot = creator.createCarrot();
        initializer.customInit(carrot, 45, 12);
        assertEquals(carrot.getWeight(), 45, 0.1);
        assertEquals(carrot.getLength(), 12, 0.1);
    }
}