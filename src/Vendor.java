public class Vendor extends GenericType {

    static String CPF;
    static String Name;
    static String Salary;

    public Vendor() {
        super(Types.VENDOR);
    }

    public static String getCPF() {
        return CPF;
    }

    public static void setCPF(String CPF) {
        Vendor.CPF = CPF;
    }

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }

    public static String getSalary() {
        return Salary;
    }

    public static void setSalary(String salary) {
        Salary = salary;
    }
}
