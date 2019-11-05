import java.util.*;
import java.util.stream.Collectors;

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
        //Integer num = vendor.getNumberOfSales();

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

    public static Integer totalCostumers(){
        return costumers.size();
    }

    public static Integer totalVendors(){
        return vendors.size();
    }

    /*public static  worstVendor(){
        return sales.stream()
                .mapToDouble(sale -> sale.getTotalValue())
                .min();
    }*/

    private static OptionalDouble highestSale(){
        return sales.stream()
                .mapToDouble(sale -> sale.getTotalValue())
                .min();
    }


    public static String getCpfWorstVendor(){
        return vendors.stream()
                .collect(Collectors.groupingBy(Vendor::getCpf, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList()).get(0).getKey();
    }
}
