package br.com.joaovieira.filereader.file;

import br.com.joaovieira.filereader.data.Storage;
import org.apache.commons.io.FilenameUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Output {

    private final static String OUTPUT_FILE_PATH = "./data/out/%s.txt";

    public static void generateFile(Path file, Storage storage){
        try {
            String outputFileName = String.format(OUTPUT_FILE_PATH,
                    FilenameUtils.getBaseName(file.toString()));

            FileWriter fileWriter = new FileWriter(outputFileName);
            fileWriter.write(lineConstructor("Total Costumers: " + storage.totalCostumers()));
            fileWriter.write(lineConstructor("Total Vendors: " + storage.totalVendors()));
            fileWriter.write(lineConstructor("ID of the highest sale: " + storage.getHighestSale()));
            fileWriter.write(lineConstructor("CPF of the worst vendor: " + storage.getCpfWorstVendor()));

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while building output file - " + file);
            e.printStackTrace();
        }
    }

    private static String lineConstructor(String msg){
        return new String(msg + System.lineSeparator());
    }

}
