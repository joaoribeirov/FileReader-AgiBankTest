package br.com.joaovieira.filereader.file;

import br.com.joaovieira.filereader.model.GenericType;
import br.com.joaovieira.filereader.data.Storage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {
    public static void readFile(Path file) {
        try {
            Storage storage = new Storage();

            Stream<String> stream = Files.lines(file);

            stream
                .map(line -> line.split("ç"))
                .collect(Collectors.toList())
                .forEach(line -> GenericType.identify(line).store(storage));

            Output.generateFile(file, storage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}