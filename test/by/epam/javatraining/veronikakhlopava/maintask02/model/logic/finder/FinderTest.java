package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.finder;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {

    private Finder finder = new Finder();
    private Chef chef = new Chef();
    private Salad salad = new Salad();

    @Test
    public void findMaxCalorieIngridientTest() {
        chef.add(salad, new Potato(56, "young"), new Carrot(130, 20));
        int expectedIndex = 1;
        int index = salad.getVegetables().indexOf(finder.findMaxCalorieIngridient(salad.getVegetables()));
        assertEquals(index, expectedIndex);

    }
}