import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fileWriter();
        fileReader();
    }


    private static void fileWriter() {
        String[] massive = {"A a", "B b", "C c", "D d", "E e", "F f", "J j", "H h", "I i", "G g", "K k",
                "L l", "M m", "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u", "V v",
                "W w", "X x", "Y y", "Z z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


        try (FileWriter fileWriter = new FileWriter("myText.txt");) {

            for (String alphavite : massive) {
                fileWriter.write(alphavite + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileReader() {
        int number = 0;
        try {
            FileReader fileReader = new FileReader("myText.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                number++;
                System.out.println(number + ": " + scanner.nextLine());

            }
        } catch (IOException e) {
            System.out.println("No such file");
        }
    }


}