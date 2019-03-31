package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.sorter;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Carrot;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Chef;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Potato;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Salad;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {
    private Sorter sorter = new Sorter();
    private Chef chef = new Chef();
    private Salad salad = new Salad();

    private Salad fillActualSalad() {
        chef.add(salad, new Potato(100, "old"),
                new Carrot(100, 12),
                new Potato(200, "young"));
        return salad;

    }

    @Test
    public void sortByCaloriesTest() {
        Salad expectedSalad = new Salad();
        chef.add(expectedSalad, new Potato(200, "young"),
                new Potato(100, "old"),
                new Carrot(100, 12));
        assertEquals(sorter.SortByCalories(fillActualSalad().getVegetables()), expectedSalad);

    }
}