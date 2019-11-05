public class Product {

    private final Double id;
    private final Double price;

    public Product(String[] lineData) {
        this.id = Double.valueOf(lineData[0]);
        this.price = Double.valueOf((lineData[2]));
    }

    public Double getValue(){
        return this.price;
    }
}
