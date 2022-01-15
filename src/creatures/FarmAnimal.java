package creatures;

import creatures.Animal;
import creatures.Edible;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species);
    }


    @Override
    public void beEaten() {
        System.out.println("Animal is being eaten.");
    }
}
