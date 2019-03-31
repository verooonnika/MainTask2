package by.epam.javatraining.veronikakhlopava.maintask02.model.logic.calculator;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Carrot;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Chef;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Potato;
import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.Salad;
import by.epam.javatraining.veronikakhlopava.maintask02.util.Creator;
import by.epam.javatraining.veronikakhlopava.maintask02.util.Initializer;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();
    //Salad salad = new Salad();
    Salad salad;
    Chef chef = new Chef();

    @Test
    public void calculateTotalWeight() {
        chef.add(salad = new Salad(), new Potato(-37.8, "old"), new Carrot(96.7, 12));
        assertEquals(Calculator.calculateTotalWeight(salad), 96.7, 0.1);
        chef.add(salad = new Salad(), new Potato(37.8, "old"), new Carrot(96.7, 12));
        assertEquals(Calculator.calculateTotalWeight(salad), 134.5, 0.1);
        chef.add(salad = new Salad(), new Potato(0, "old"), new Carrot(0, 12));
        assertEquals(Calculator.calculateTotalWeight(salad), 0, 0.1);
    }

    @Test
    public void calculateCalories() {
        chef.add(salad = new Salad(), new Potato(37.8, "old"), new Carrot(96.7, 12));
        assertEquals(Calculator.calculateCalories(salad), 62.9, 0.1);
        /*chef.add(salad = new Salad(), new Potato(-37.8, "old"), new Carrot(96.7, 12));
        assertEquals(Calculator.calculateCalories(salad), 33.8, 0.1);*/
    }
}