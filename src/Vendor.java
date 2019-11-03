public class Vendor extends GenericType {

    private final Long CPF;
    private final String Name;
    private final Double Salary;

    public Vendor(String[] buffer) {
        this.CPF = Long.parseLong(buffer[1]);
        this.Name = buffer[2];
        this.Salary = Double.parseDouble(buffer[3]);
    }

    public Long getCPF() {
        return CPF;
    }

    public String getName() {
        return Name;
    }

    public Double getSalary() {
        return Salary;
    }

    @Override
    public void store(Storage storage) {
        storage.addVendor(this);
    }
}
