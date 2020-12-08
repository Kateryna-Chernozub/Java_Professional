package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Создать и заполнить файл случайными целыми числами.
 * Отсортировать содержимое файла по возрастанию
 */


public class WorkInFileTask2 {
    public static void main(String[] args) {

        Path randomNumPath = Paths.get("src", "homework", "homework1", "random.txt");
        Path outputPathForSortNum = Paths.get("src", "homework", "homework1", "sorted.txt");
        int amountOfNumbers = 10;
        int boundOfRandomizing = 100;

        WorkInFileTask2.fileWithRandomValues(amountOfNumbers, boundOfRandomizing, randomNumPath);
        WorkInFileTask2.getSortedNum(randomNumPath, outputPathForSortNum);
    }

    public static void fileWithRandomValues (int amountOfNumbers, int boundOfRandomizing, Path randomNumPath) {
        List<String> randomNum = getRandomStringListOfNum(amountOfNumbers, boundOfRandomizing);

        try {
            Files.write(randomNumPath,randomNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getRandomStringListOfNum(int amountOfNumbers, int boundOfRandomizing) {
        Random random = new Random();
        List<String> randomNum = new ArrayList<>(amountOfNumbers);

        for (int i = 0; i < amountOfNumbers; i++) {
            randomNum.add(String.valueOf(random.nextInt(boundOfRandomizing)));
        }
        return randomNum;
    }

    public static void getSortedNum (Path randomNumberPath, Path outputPathForSortedNum) {
        try {
            List<String> listOfNumbers = Files.readAllLines(randomNumberPath);
                listOfNumbers.sort(Comparator.comparing(Integer::valueOf));
                Files.write(outputPathForSortedNum, listOfNumbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
