public class ProductSale {

    private final Double saleID;
    private final Product product;
    private final Long quantity;

    public ProductSale(String saleID, String[] product, String quantity) {
        this.saleID = Double.valueOf(saleID);
        this.product = new Product(product);
        this.quantity = Long.valueOf(quantity);
    }

    public ProductSale(Double saleID, String[] product) {
        this.saleID = Double.valueOf(saleID);
        this.product = new Product(product);
        this.quantity = Long.valueOf(product[1]);
    }
}
