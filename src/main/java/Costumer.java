public class Costumer extends GenericType {

    private final String cnpj;
    private final String name;
    private final String businessArea;

    public Costumer(String[] buffer) {
        this.cnpj = buffer[1];
        this.name = buffer[2];
        this.businessArea = buffer[3];
    }

    @Override
    public void store(Storage storage) {
        storage.addCosutmer(this);
    }
}
