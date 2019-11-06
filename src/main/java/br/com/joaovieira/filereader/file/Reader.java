package br.com.joaovieira.filereader.file;

import br.com.joaovieira.filereader.model.GenericType;
import br.com.joaovieira.filereader.data.Storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {
    public static void readFile(Path file, Properties properties) {
        try {
            Storage storage = new Storage();
            Stream<String> stream = Files.lines(file);

            lineInterpreter(stream, storage);

            Output.generateFile(file, storage, properties.getProperty("OUTPUT_FILE_PATH"));
            storage.finalize();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lineInterpreter(Stream<String> stream, Storage storage){
        stream.map(line -> line.split("ç"))
                .collect(Collectors.toList())
                .forEach(line -> GenericType.identify(line).store(storage));
    }
}