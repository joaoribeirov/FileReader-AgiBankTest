package br.com.joaovieira.filereader.data;

import br.com.joaovieira.filereader.model.Costumer;
import br.com.joaovieira.filereader.model.Sale;
import br.com.joaovieira.filereader.model.Vendor;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class to storage all data read in the file
 */
public class Storage {

    private List<Vendor> vendors;
    private List<Costumer> costumers;
    private List<Sale> sales;

    private Sale highestSale;

    public Storage() {
        vendors = new ArrayList<>();
        costumers = new ArrayList<>();
        sales = new ArrayList<>();
        highestSale = null;
    }

    public void addVendor(Vendor vendor){
        vendors.add(vendor);
    }

    public String getWorstVendorName() {
        return sales.stream()
                .collect(Collectors.groupingBy(Sale::getSalesman,
                        Collectors.minBy(Comparator.comparing(Sale::getTotalValue))))
                .entrySet().iterator().next().getKey();
    }

    public void addCosutmer(Costumer costumer){
        costumers.add(costumer);
    }

    public void addSale(Sale sale){
        sales.add(sale);
        checkHighestSale(sale);
    }

    private void checkHighestSale(Sale sale) {
        if (highestSale == null || highestSale.getTotalValue() < sale.getTotalValue())
            highestSale = sale;
    }

    public Integer totalCostumers(){
        return costumers.size();
    }

    public Integer totalVendors(){
        return vendors.size();
    }

    /**
     * @return
     */
    public Integer getHighestSale() {
        return highestSale.getId();
    }

    public List<Vendor> getVendors() {
        return vendors;
    }

    public List<Costumer> getCostumers() {
        return costumers;
    }

    public List<Sale> getSales() {
        return sales;
    }
}
