package by.epam.javatraining.veronikakhlopava.maintask02.model.entity;

public class Chef {

    public void add(Salad salad, Vegetable ...vegetable) {
        for (int i = 0; i < vegetable.length; i++) {
            salad.getVegetables().add(vegetable[i]);
        }
    }


}
