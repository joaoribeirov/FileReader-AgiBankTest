import com.sun.javafx.image.IntPixelGetter;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private List<Vendor> vendors;
    private List<Costumer> costumers;
    private List<Sale> sales;

    private Integer highestSale;
    private Integer worstVendor;

    public Storage() {
        vendors = new ArrayList<>();
        costumers = new ArrayList<>();
        sales = new ArrayList<>();
        highestSale = null;
        worstVendor = null;
    }

    public void addVendor(Vendor vendor){
        vendors.add(vendor);
        System.out.println(vendor.toString());
    }

    public void addCosutmer(Costumer costumer){
        costumers.add(costumer);
        System.out.println(costumer.toString());
    }

    public void addSale(Sale sale){
        sales.add(sale);
        System.out.println(sales.toString());
    }

    public Integer totalCostumers(){
        return costumers.size();
    }

    public Integer totalVendors(){
        return vendors.size();
    }

    public Integer getHighestSale(){
        return (int) sales.stream()
                .mapToDouble(sale -> sale.getTotalValue())
                .min().getAsDouble();
    }


    public String getCpfWorstVendor(){
        return vendors.stream()
                .collect(Collectors.groupingBy(Vendor::getCpf, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList()).get(0).getKey();
    }
}
