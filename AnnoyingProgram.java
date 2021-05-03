import java.io.File;
import java.io.IOException;

public class AnnoyingProgram {
    static void CreateFile(String filename) {
        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int i = 0;
        String filename = "file" + String.valueOf(i);
        while (true) {
            CreateFile(filename);
            i ++;
            filename = "file" + String.valueOf(i);
        }
    }
}