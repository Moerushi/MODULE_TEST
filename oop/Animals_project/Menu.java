package Animals_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //Метод вывода меню и навигации
    public static int showMenu() {
        System.out.println();
        System.out.println("В данный момент в базе питомника " + Counter.animalsQuantity + " животных");
        System.out.println("""
                Выберите необходимое действие:
                1. Внести новое животное
                2. Вывести список команд животного по ID
                3. Обучить животное новым командам
                4. Вывести всю информацию о всех животных
                5. Вывести список животных по дате рождения
                6. Закончить работу""");
        try {
            Scanner sc = new Scanner(System.in);
            int point = sc.nextInt();
            if (point < 1 || point > 6) {
                throw new InputMismatchException();
            }
            return point;
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести цифровое значение от 1 до 8, повторите ввод");
            return showMenu();
        }

    }
}