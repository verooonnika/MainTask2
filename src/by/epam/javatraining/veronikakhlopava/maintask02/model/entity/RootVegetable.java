package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

public class RootVegetable extends Vegetable {

    private static final String TYPE_OF_VEGETABLE = "Root Vegetable";

    public RootVegetable() {
        setType(TYPE_OF_VEGETABLE);
    }

    public RootVegetable(double caloriesPerHundredGrams, double weight) {
        super(TYPE_OF_VEGETABLE, caloriesPerHundredGrams, weight);
    }
}
