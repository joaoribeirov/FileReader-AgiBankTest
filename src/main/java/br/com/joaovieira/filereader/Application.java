package br.com.joaovieira.filereader;

import br.com.joaovieira.filereader.file.FileExplorer;
import br.com.joaovieira.filereader.file.Reader;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        try {
            FileExplorer.searchFilePaths().stream().forEach(file -> Reader.readFile(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
