import java.util.List;

public class Logger {

    private List<Vendor> vendors;
    private List<Costumer> costumers;

    public List<Vendor> getVendors() {
        return vendors;
    }

    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
    }

    public List<Costumer> getCostumers() {
        return costumers;
    }

    public void setCostumers(List<Costumer> costumers) {
        this.costumers = costumers;
    }

    public void addVendor(Vendor vendor){
        vendors.add(vendor);
    }

    public void addCosutmer(Costumer costumer){
        costumers.add(costumer);
    }
}
