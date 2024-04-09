package Animals;

import Animals.Animal;
import Animals.Bowl;

public class Cat extends Animal {
    private boolean satiety;
    private int foodAmount = 10;
    public Cat(String name) {
        super(name, 200, 0);
        satiety = false;
    }
    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= foodAmount) {
            bowl.empty(foodAmount);
            System.out.println(name + " покушал из миски.");
            satiety = true;
        } else {
            System.out.println("В миске недостаточно еды для кота " + name);
        }
    }
    public boolean isSatiety() {
        return satiety;
    }
}
