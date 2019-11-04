import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public static void main(String[] args) {

        String fileName = "c://files/lines.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName), Charset.forName("UTF-8"))) {
            Storage storage = new Storage();

            stream
                .map(line -> line.split("ç"))
                .collect(Collectors.toList())
                .forEach(line -> {
                    GenericType.identify(line).store(storage);
                });

            //todo Generate output file

            //aplica funcao ex .map(x-> x*x)
            //filtra atraves de um predicado .filter(line -> line.split('ç'))
            //.forEach(System.out::println);
            //.collect(Collectors.toList()).stream()

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}