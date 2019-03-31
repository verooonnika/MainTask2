package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Salad {

    private List<Vegetable> vegetables;

    public Salad() {
        vegetables = new ArrayList<>();
    }

    public Salad(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (Vegetable vegetable : vegetables) {
            sb.append(vegetable).append("\n");

        }
        return sb.toString();
    }

}
