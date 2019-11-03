public class Vendor extends GenericType {

    private final String CPF;
    private final String Name;
    private final String Salary;

    public Vendor(String[] buffer) {
        this.CPF = buffer[1];
        this.Name = buffer[2];
        this.Salary = buffer[3];
    }

    public String getCPF() {
        return CPF;
    }

    public String getName() {
        return Name;
    }

    public String getSalary() {
        return Salary;
    }

    @Override
    public void store(Logger logger) {
        logger.addVendor(this);
    }
}
