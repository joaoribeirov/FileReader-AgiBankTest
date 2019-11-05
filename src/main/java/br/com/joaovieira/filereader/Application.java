package br.com.joaovieira.filereader;

import br.com.joaovieira.filereader.file.FileExplorer;
import br.com.joaovieira.filereader.file.Reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        try {
            Properties properties = initProperties();

            while (true){
                FileExplorer.searchFilePaths(properties).stream()
                        .forEach(file -> Reader.readFile(file, properties));
                Thread.sleep(3000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Properties initProperties() {
        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            String appConfigPath = rootPath + "application.properties";
            String catalogConfigPath = rootPath + "catalog";

            Properties appProps = new Properties();
            appProps.load(new FileInputStream(appConfigPath));
            return appProps;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
