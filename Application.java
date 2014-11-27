import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(System.getProperty("user.dir") + "/input.txt");
        BufferedReader bufferReader = new BufferedReader(file);
        new Expedition(bufferReader).expedite();
    }
}
