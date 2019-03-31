package by.epam.javatraining.veronikakhlopava.maintask02.util;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Carrot;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Potato;

import java.util.Random;

public class Initializer {

    private static Initializer instance;
    private Creator creator = new Creator();
    private Random random = new Random();

    public static Initializer getInstance() {
        if (instance == null) {
            instance = new Initializer();
        }
        return instance;
    }

    public void customInit(Potato potato, double weight, String age) {

        potato.setWeight(weight);
        potato.setAge(age);
    }

    public void customInit(Carrot carrot, double weight, double length) {

        carrot.setWeight(weight);
        carrot.setLength(length);
    }


}
