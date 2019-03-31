package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.finder;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Vegetable;
import org.apache.log4j.Logger;

import java.util.List;

public class Finder {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(Finder.class);
    }

    public Vegetable findMaxCalorieIngridient(List<Vegetable> list) {

        Vegetable vegetable = list.get(0);
        double maxCalorie = list.get(0).getCalories();

        for (Vegetable listVegetable : list) {
            if (listVegetable != null && listVegetable.getCalories() > maxCalorie) {
                maxCalorie = listVegetable.getCalories();
                vegetable = listVegetable;
            }
        }
        logger.debug("Max calorie ingridient in Salad is" + vegetable);
        return vegetable;

    }
}
