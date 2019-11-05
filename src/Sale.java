import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sale extends GenericType{

    private final Long id;
    private final List<Product> products;
    private final String salesman;

    public Sale(String[] lineData) {
        this.id = Long.valueOf(lineData[0]);
        this.products = new ArrayList<>();
        this.salesman = lineData[2];

        Arrays.stream(lineData)
                .map(product -> product.split(","))
                .collect(Collectors.toList())
                .forEach(product -> products.add(new Product(product)));
    }

    public Long getId() {
        return id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getSalesman() {
        return salesman;
    }


    @Override
    public void store() {
        Storage.addSale(this);
    }
}
