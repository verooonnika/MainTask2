package by.epam.javatraining.veronikakhlopava.maintask02.controller;

import by.epam.javatraining.veronikakhlopava.maintask02.model.entity.*;
import by.epam.javatraining.veronikakhlopava.maintask02.model.logic.calculator.Calculator;
import by.epam.javatraining.veronikakhlopava.maintask02.model.logic.finder.Finder;
import by.epam.javatraining.veronikakhlopava.maintask02.model.logic.sorter.Sorter;
import by.epam.javatraining.veronikakhlopava.maintask02.util.Creator;
import by.epam.javatraining.veronikakhlopava.maintask02.util.Initializer;
import by.epam.javatraining.veronikakhlopava.maintask02.view.View;

public class SaladController {

    public static void main(String[] args) {

        Salad vinegret = new Salad();

        Creator creator = Creator.getInstance();
        Initializer initializer = Initializer.getInstance();

        Chef chef = new Chef();

        Potato potato = creator.createPotato();
        initializer.customInit(potato, 400, "old");
        Carrot carrot = creator.createCarrot();
        initializer.customInit(carrot, 200, 50);
        chef.add(vinegret, potato);
        chef.add(vinegret, carrot);


        View view = new View();
        view.print(vinegret);

        Finder finder = new Finder();
        view.print(finder.findMaxCalorieIngridient(vinegret.getVegetables()));

        Sorter sorter = new Sorter();
        view.print(sorter.SortByCalories(vinegret.getVegetables()));

        view.print(Calculator.calculateCalories(vinegret));
        view.print(Calculator.calculateTotalWeight(vinegret));


    }
}
