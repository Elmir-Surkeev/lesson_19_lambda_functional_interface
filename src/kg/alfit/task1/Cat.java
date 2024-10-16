package kg.alfit.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// код можно менять только в особо отмеченном месте этого файла,
// так же возможно вам понадобится добавить что-то в
// блок import и поменять имя пакета
// в остальных местах этого файла код менять не разрешается.

public class Cat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;
    private final int age;
    private final Breed breed;
    private final Color color;

    private Cat() {
        name = names.get(r.nextInt(names.size()));
        age = r.nextInt(10) + 1;
        breed = Breed.values()[r.nextInt(Breed.values().length)];
        color = Color.values()[r.nextInt(Color.values().length)];
    }

    public static List<Cat> makeCats(int amount) {
        return Stream.generate(Cat::new)
                .limit(amount)
                .collect(Collectors.toList());
                //.toList();
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }


    enum Color {
        TABBY, SILVER, GRAY, PEACH, GINGER, TORTIE
    }

    enum Breed {
        SPHINX, BRITAIN, SCOTTISH, VULGARIS, ORIENTAL
    }

    /*********/
//
    // Ваш код может находится здесь
    // остальную часть этого файла вы менять не можете


    public int byBreed(Cat a, Cat b){
        return a.breed.toString().toUpperCase().compareTo(b.breed.toString().toUpperCase());
    }
    public int byName(Cat a, Cat b){
        return a.name.compareTo(b.name);
    }
    public int byAge(Cat a, Cat b){
        return Integer.compare(a.age, b.age);
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %d | Breed: %s | Color: %s", name, age, breed, color);
    }
    /*********/
}

