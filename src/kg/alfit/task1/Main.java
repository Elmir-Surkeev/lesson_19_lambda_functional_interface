package kg.alfit.task1;

import kg.alfit.task1.Cat.Breed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var cats = Cat.makeCats(10);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы

//        Сортировка по породе, реализовано
        out.println("Сортировка по породе");
        cats.sort((a, b)-> a.byBreed(a, b));
        Printer.print(cats);

        //Сортировка по имени, реализовано
        out.println("Сортировка по имени");
        cats.sort((a, b) -> b.byName(a, b));
        Printer.print(cats);

        //Сортировка по возрасту, реализовано
        out.println("Сортировка по возрасту");
        cats.sort((a, b) -> b.byAge(a, b));
        Printer.print(cats);


        //Удаление по цвету(TAABY), реализовано
        out.println("Удаление по имени");
        cats.removeIf((a) -> (a.getColor() == Cat.Color.TABBY));
        Printer.print(cats);

        //Удаление по имени > 5 символов, реализовано
        out.println("Удаление по количеству символов");
        cats.removeIf(a-> (a.getName().length() > 5));
        Printer.print(cats);

        //kg.alfit.task1.Printer.print(cats);
    }
}