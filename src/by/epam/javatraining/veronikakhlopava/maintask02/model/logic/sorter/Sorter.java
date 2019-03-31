package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.sorter;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Salad;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Vegetable;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Sorter {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(Sorter.class);
    }

    public List<Vegetable> SortByCalories(List<Vegetable> list) {
        List<Vegetable> result = new ArrayList<>();
        logger.debug("Sorting by calories was started...");
        for (int i = 0; i < list.size(); i++) {

            result.add(list.get(i));
        }
        result.sort(new SorterByCalories());
        logger.debug("Salad ingridients was sorted by Calories");
        return result;

    }

}
