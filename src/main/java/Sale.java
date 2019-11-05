import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sale extends GenericType{

    private final Double id;
    private final List<ProductSale> products;
    private final String salesman;

    public Sale(String[] lineData) {
        this.id = Double.valueOf(lineData[1]);
        this.products = new ArrayList<>();
        this.salesman = lineData[3];

        String[] splitedLine = lineData[2].replace("[", "").replace("]", "").split(",");

        Arrays.stream(splitedLine)
                .forEach(product -> products.add(new ProductSale(this.id, product.split("-"))));
    }

    public List<ProductSale> getProducts() {
        return products;
    }

    public Double getTotalValue(){
        return products.stream()
                .mapToDouble(v -> v.getTotalValue())
                .sum();
    }

    @Override
    public void store(Storage storage) {
        storage.addSale(this);
    }
}
