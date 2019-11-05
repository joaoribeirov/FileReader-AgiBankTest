package br.com.joaovieira.filereader.model;

import br.com.joaovieira.filereader.data.Storage;

public class Vendor extends GenericType {

    private final String cpf;
    private final String name;
    private final Double salary;

    public Vendor(String[] buffer) {
        this.cpf = buffer[1];
        this.name = buffer[2];
        this.salary = Double.parseDouble(buffer[3]);
    }

    @Override
    public void store(Storage storage) {
        storage.addVendor(this);
    }

    public String getCpf() {
        return this.cpf;
    }
}
