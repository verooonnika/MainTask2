package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

import org.apache.log4j.Logger;

public class Vegetable {

    private static final Logger logger;
    static {
        logger = Logger.getLogger(Vegetable.class);
    }


    private String type;
    private double caloriesPerHundredGrams;
    private double weight;

    public Vegetable() {

    }

    public Vegetable(String type, double caloriesPerHundredGrams, double weight) {

        this.type = type;
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getCalories() {
        if (caloriesPerHundredGrams > 0) {
            return (caloriesPerHundredGrams / 100 * weight);
        } else {
            logger.debug("value of calories was assigned by default value");
        return 0;
        }
    }

    public double getWeight() {
        if (weight > 0) {
            return weight;
        } else {
            logger.debug("value of weight was assigned by default value");
        }
        return 0;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setCaloriesPerHundredGrams(double caloriesPerHundredGrams) {
        this.caloriesPerHundredGrams = caloriesPerHundredGrams;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        return "Vegetable{" +
                " type='" + type + '\'' +
                ", caloriesPerHundredGrams=" + caloriesPerHundredGrams +
                ", weight=" + weight +
                '}';
    }


}
