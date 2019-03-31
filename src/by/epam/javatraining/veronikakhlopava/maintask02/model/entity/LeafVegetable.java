package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

public class LeafVegetable extends Vegetable {

    private static final String TYPE_OF_VEGETABLE = "Leaf Vegetable";


    public LeafVegetable() {
        setType(TYPE_OF_VEGETABLE);
    }

    public LeafVegetable(String type, double caloriesPerHundredGrams, double weight) {
        super(TYPE_OF_VEGETABLE, caloriesPerHundredGrams, weight);
    }

}
