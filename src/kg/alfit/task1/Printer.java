package kg.alfit.task1;

import java.util.List;

import static java.lang.System.out;

// код можно менять только в особо отмеченном месте этого файла,
// так же возможно вам понадобится добавить что-то в
// блок import и поменять имя пакета
// в остальных местах этого файла код менять не разрешается.

public final class Printer {
    private static  void printHeader() {
        out.printf("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |%n", "--------------");
        out.printf("%10.10s | %3.3s | %-10.10s | %-10.10s |%n", "Name", "Age", "Breed", "Color");
        out.printf("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |%n", "--------------");
    }

    private static  void printCat(Cat cat) {
        out.printf("%10.10s | %3.3s | %-10.10s | %-10.10s |%n", cat.getName(), cat.getAge(), cat.getBreed(), cat.getColor());
    }

    public static void print(List<Cat> cats) {
        printHeader();
        cats.forEach(Printer::printCat);
        out.println();
    }
}

