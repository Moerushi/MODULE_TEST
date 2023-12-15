package Animals_project.Classes;

import java.util.Date;

public abstract class Pets extends Animal {
    boolean isPet;

    public Pets(int id, String name, Date birthdate, boolean isPet) {
        super(id, name, birthdate);
        this.isPet = isPet;
    }

    @Override
    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }
}