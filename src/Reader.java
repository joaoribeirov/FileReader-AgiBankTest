import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public static void main(String[] args) {

        String fileName = "C:\\_dev\\Projects\\Tests\\FileReader\\files/lines.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            Storage.start();

            stream
                .map(line -> line.split("ç"))
                .collect(Collectors.toList())
                .forEach(line -> GenericType.identify(line).store());

            //Storage.highestSale();
            //Storage.getNumberOfSales();

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