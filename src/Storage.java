import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

    private List<Vendor> vendors;
    private List<Costumer> costumers;

    private Integer HighestSale;
    private Integer WorstVendor;

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
    }*/
}
