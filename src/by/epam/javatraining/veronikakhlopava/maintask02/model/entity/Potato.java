package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

public class Potato extends RootVegetable {

    private static final double CALORIES_PER_HUNDRED_GRAMS = 77.0;

    private String age;

    public Potato() {
        super();
        setCaloriesPerHundredGrams(CALORIES_PER_HUNDRED_GRAMS);
    }

    public Potato(String age) {
        this.age = age;
    }


    public Potato(double weight, String age) {
        super(CALORIES_PER_HUNDRED_GRAMS, weight);
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Potato{" +
                "age='" + age + '\'' +
                "calories in salad" + getCalories() +
                super.toString() +
                '}';
    }
}
