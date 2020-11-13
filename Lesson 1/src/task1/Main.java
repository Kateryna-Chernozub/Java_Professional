package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 500);
        Animal cat1 = new Animal("Burmese", 10, 15, 1000);
        Animal dog = new Animal("Labrador", 30, 17, 400);
        Animal dog1 = new Animal("Corgi", 25, 15, 2000);
        Animal bird = new Animal("King Penguin", 10, 15, 1000);
        Animal bird2 = new Animal("Nightingale", 1, 29, 900);

        Animal[] animals = {cat, cat1, dog, dog1, bird, bird2};

        Arrays.sort(animals); //якщо закоментувати рядок, то сортування не відбудеться

        for (Animal temp : animals) {
            System.out.println(temp);
        }

    }
}
