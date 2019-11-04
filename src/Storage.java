import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Vendor> vendors;
    private List<Costumer> costumers;

    private Integer highestSale;
    private Integer worstVendor;

    public Storage() {
        vendors = new ArrayList<>();
        costumers = new ArrayList<>();
        highestSale = null;
        worstVendor = null;
    }

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
//        Integer num = getNumberOfSales();

/*        if (this.WorstVendor == null) vendors.size();
        else{
            System.out.println("Else do worst vendor");
        }*/
    }

    public void addCosutmer(Costumer costumer){
        costumers.add(costumer);
    }

/*    private Integer getNumberOfSales(){
        Map<Long, Long> totalSales = vendors.stream()
                .collect(Collectors.groupingBy(Vendor::getCPF, Collectors.counting()));
        return null;
    }
*/
}
