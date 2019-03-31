package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.sorter;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Salad;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Vegetable;

import java.util.Comparator;

public class SorterByCalories implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        if (vegetable1.getCalories() > vegetable2.getCalories()) {
            return -1;
        } else if (vegetable1.getCalories() == vegetable2.getCalories()) {
            return 0;
        } else {
            return 1;
        }

    }

}
