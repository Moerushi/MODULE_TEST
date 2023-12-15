package Animals_project;

import java.io.IOException;
import java.text.ParseException;

public class Programm {
    public static void main(String[] args) throws IOException, ParseException {
        Controller.fillAnimalsList();
        Controller.workWithMenu();
    }
}