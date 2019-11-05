public class Product {

    private final Long id;
    private final Double price;

    public Product(String[] lineData) {
        this.id = Long.valueOf(lineData[0]);
        this.price = Double.valueOf((lineData[2]));
    }

    public Double getValue(){
        return this.price;
    }
}
