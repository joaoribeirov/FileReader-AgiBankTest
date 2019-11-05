import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Vendor> vendors;
    private static List<Costumer> costumers;
    private static List<Sale> sales;

    private static Integer highestSale;
    private static Integer worstVendor;

    public static void start() {
        vendors = new ArrayList<>();
        costumers = new ArrayList<>();
        sales = new ArrayList<>();
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

    public static void addVendor(Vendor vendor){
        vendors.add(vendor);
        System.out.println(vendor.toString());
//        Integer num = getNumberOfSales();

/*
        if (this.WorstVendor == null) vendors.size();
        else{
            System.out.println("Else do worst vendor");
        }
*/
    }

    public static void addCosutmer(Costumer costumer){
        costumers.add(costumer);
        System.out.println(costumer.toString());
    }

    public static void addSale(Sale sale){
        sales.add(sale);
        System.out.println(sales.toString());
    }

/*
    private Integer getNumberOfSales(){
        Map<Long, Long> totalSales = vendors.stream()
                .collect(Collectors.groupingBy(Vendor::getCPF, Collectors.counting()));
        return null;
    }
*/
}
