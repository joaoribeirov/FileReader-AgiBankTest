package br.com.joaovieira.filereader.model;

import br.com.joaovieira.filereader.data.Storage;
import br.com.joaovieira.filereader.file.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModelsTest {
    private Storage storage;

    @BeforeEach
    void Setup(){
        storage = new Storage();
    }

    @Test
    void testVendorsLineStorage() {
        String[] line = {"001Á59779231048ÁGuilhermeÁ3489.98"};
        Reader.lineInterpreter(Arrays.stream(line), storage);

        Vendor vendor = storage.getVendors().get(0);
        assertEquals(new String("59779231048"), vendor.getCpf());
        assertEquals(new String("Guilherme"), vendor.getName());
        assertEquals(new Double(3489.98), vendor.getSalary());
    }

    @Test
    void testCostumerLineStorage() {
        String[] line = {"002Á93864899028ÁMauricioÁRural"};
        Reader.lineInterpreter(Arrays.stream(line), storage);

        Costumer costumer = storage.getCostumers().get(0);
        assertEquals(new String("93864899028"), costumer.getCnpj());
        assertEquals(new String("Mauricio"), costumer.getName());
        assertEquals(new String("Rural"), costumer.getBusinessArea());
    }

    @Test
    void testSaleLineStorage() {
        String[] line = {"003Á4Á[45-90-2]ÁJoao"};
        Reader.lineInterpreter(Arrays.stream(line), storage);

        Sale sale = storage.getSales().get(0);
        ProductSale productSale = sale.getProducts().get(0);
        Product product = productSale.getProduct();

        assertEquals(new Integer(4), sale.getId());
        assertEquals(new String("Joao"), sale.getSalesman());

        assertEquals(new Integer(4), productSale.getSaleID());
        assertEquals(new Integer(90), productSale.getQuantity());
        assertEquals(new Double(180), productSale.getTotalValue());

        assertEquals(new Integer(45), product.getId());
        assertEquals(new Double(2), product.getValue());
    }
}
