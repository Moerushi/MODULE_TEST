package Animals_project.Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Dog extends Pets {
    String type;
    ArrayList<String> commands;

    public Dog(int id, String name, Date birthdate, boolean isPet, String type, ArrayList<String> commands) {
        super(id, name, birthdate, true);
        this.type = "Dog";
        this.commands = commands;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public ArrayList<String> getCommands() {
        return commands;
    }

    @Override
    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return (this.id + " " + this.name + " " + isPet + " " + this.type + " " + new SimpleDateFormat("yyyy-MM-dd").format(this.birthdate) + " "
                + this.commands.
                toString()
                .replace("[", "")
                .replace("]", "")
                // .replace(", ", "/")
        );
    }
}