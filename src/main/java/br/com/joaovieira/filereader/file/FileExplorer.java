package br.com.joaovieira.filereader.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileExplorer {

    public static List<Path> searchFilePaths() throws IOException {
        return Files.list(Paths.get("./data/in"))
                .filter(path -> path.toFile().isFile())
                .collect(Collectors.toList());
    }
}
