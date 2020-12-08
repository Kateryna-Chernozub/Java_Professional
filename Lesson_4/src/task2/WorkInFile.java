package task2;

import java.io.*;

/**
 * Создайте файл, запишите в него произвольные данные и закройте файл.
 * Затем снова откройте этот файл,
 * прочитайте из него данные и выведете их на консоль.
 */

public class WorkInFile {
    public static void main(String[] args) throws IOException {
        String text = "This new text \nThis new text2 \nThis new text3";
        String fileName = "D:/IT/my_projects/Java_Professional/Lesson_4/WorkInFile.txt";

        FileWorker.write(fileName, text);

        String textFromFile = FileWorker.read(fileName);
        System.out.println(textFromFile);
    }
}


class FileWorker {
    public static void write (String fileName, String text) throws IOException {
        File file = new File(fileName);

        try {
            //check that if the file does not exist then we create it
            if (!file.exists()) {
                file.createNewFile();
            }
            //PrintWriter will provide the ability to write to the file
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            //Write text to file
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        //Use special object to build a string
        StringBuilder stringBuilder = new StringBuilder();

        exists(fileName);

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                //In the loop read the file line by line
                String s;
                while ((s = in.readLine()) != null) {
                    stringBuilder.append(s);
                    stringBuilder.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Returning the resulting text from the file
        return stringBuilder.toString();
    }

    private static void exists (String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}

