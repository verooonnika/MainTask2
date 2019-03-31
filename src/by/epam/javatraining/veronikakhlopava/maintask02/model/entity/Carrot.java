package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

public class Carrot extends RootVegetable {

    private static final double CALORIES_PER_HUNDRED_GRAMS = 35.0;
    private double length;

    public Carrot() {
        super();
        setCaloriesPerHundredGrams(CALORIES_PER_HUNDRED_GRAMS);

    }

    public Carrot(double length) {
        this.length = length;
    }

    public Carrot(double weight, double length) {
        super(CALORIES_PER_HUNDRED_GRAMS, weight);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Carrot{" +
                "length=" + length +
                "calories in salad" + getCalories() +
                super.toString() +
                '}';
    }
}
