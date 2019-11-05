package br.com.joaovieira.filereader.model;

public class ProductSale {

    private final Double saleID;
    private final Product product;
    private final Double quantity;

    public ProductSale(Double saleID, String[] product) {
        this.saleID = new Double(saleID);
        this.product = new Product(product);
        this.quantity = new Double(product[1]);
    }

    public Double getTotalValue(){
        return this.product.getValue() * this.quantity;
    }
}
