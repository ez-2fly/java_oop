package Warriors;

import Warriors.BaseWarrior;

import java.util.ArrayList;

public class Peasant extends BaseWarrior {

    public Peasant(String name, Place position) {
        super(name, position);
        this.armor = 2;
        this.health = 50;
        this.damage = 15;
        this.initiative = 0;
    }

    @Override
    public String toString() {
        return this.getClass() + ": " + this.name;
    }

    @Override
    public void step(ArrayList<BaseWarrior> enemies) {

    }
}
