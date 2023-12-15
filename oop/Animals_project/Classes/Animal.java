package Animals_project.Classes;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal implements Comparable<Animal> {
    int id;
    String name;
    Date birthdate;

    public Animal(int id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public ArrayList<String> getCommands() {
        return null;
    }

    public boolean isPet() {
        return true;
    }

    public void setCommands(ArrayList<String> commands) {
    }

    @Override
    public int compareTo(Animal o) {
        return this.getBirthdate().compareTo(o.getBirthdate());
    }

}