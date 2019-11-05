package br.com.joaovieira.filereader.model;

import br.com.joaovieira.filereader.data.Storage;

public abstract class GenericType {

    public static GenericType identify(String[] lineData){
        String identifier = lineData[0];
        switch (identifier) {
            case "001":
                return new Vendor(lineData);
            case "002":
                return new Costumer(lineData);
            case "003":
                return new Sale(lineData);
        }
        return null;
    }

    public abstract void store(Storage storage);
}