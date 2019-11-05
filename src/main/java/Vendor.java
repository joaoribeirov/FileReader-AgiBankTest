public class Vendor extends GenericType {

    private final String cpf;
    private final String Name;
    private final Double Salary;

    public Vendor(String[] buffer) {
        this.cpf = buffer[1];
        this.Name = buffer[2];
        this.Salary = Double.parseDouble(buffer[3]);
    }

    @Override
    public void store(Storage storage) {
        storage.addVendor(this);
    }

    public String getCpf() {
        return this.cpf;
    }
}
