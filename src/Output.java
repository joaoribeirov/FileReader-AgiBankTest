import java.io.FileWriter;
import java.io.IOException;

public class Output {

    private final static String OUTPUT_FILE_PATH = "./dados/out/%s.txt";

    public static void generateFile(){
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write("BÇAIZERRRRRRRRRRR");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
