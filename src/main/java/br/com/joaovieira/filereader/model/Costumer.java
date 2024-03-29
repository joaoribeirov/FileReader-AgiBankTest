package br.com.joaovieira.filereader.model;

import br.com.joaovieira.filereader.data.Storage;

public class Costumer extends GenericType {

    private final String cnpj;
    private final String name;
    private final String businessArea;

    public Costumer(String[] buffer) {
        this.cnpj = buffer[1];
        this.name = buffer[2];
        this.businessArea = buffer[3];
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getName() {
        return name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    @Override
    public void store(Storage storage) {
        storage.addCosutmer(this);
    }
}
