package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.calculator;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Salad;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Vegetable;
import org.apache.log4j.Logger;

public class Calculator {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(Calculator.class);
    }


    public static double calculateTotalWeight(Salad salad) {
        double totalWeight = 0;

        if (salad != null) {
            for (Vegetable vegetable : salad.getVegetables()) {
                totalWeight += vegetable.getWeight();

            }
            logger.debug("total weight of salad was calculated");
        }
        else {
            logger.info("Salad was not found");
        }
        return totalWeight;
    }

    public static double calculateCalories(Salad salad) {
        double calories = 0;

        if (salad != null) {
            for (Vegetable vegetable : salad.getVegetables()) {
                calories += vegetable.getCalories();

            }
            logger.debug("total weight of salad was calculated");
        }
        else {
            logger.debug("Salad was not found");
        }
        return calories;

    }

}
