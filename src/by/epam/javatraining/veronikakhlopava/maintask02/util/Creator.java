package by.epam.javatraining.veronikakhlopava.maintask02.util;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Carrot;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Potato;

public class Creator {

    private static Creator instance;

    public Creator() {

    }

    public static Creator getInstance() {
        if (instance == null) {
            instance = new Creator();
        }
        return instance;
    }

    public Potato createPotato() {
        return new Potato();
    }

    public Carrot createCarrot() {
        return new Carrot();
    }

}
