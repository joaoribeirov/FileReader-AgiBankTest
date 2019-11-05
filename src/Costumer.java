public class Costumer extends GenericType {

    private final Long cnpj;
    private final String name;
    private final String businessArea;

    public Costumer(String[] buffer) {
        this.cnpj = Long.parseLong(buffer[1]);
        this.name = buffer[2];
        this.businessArea = buffer[3];
    }

    public Long getCnpj() {
        return cnpj;
    }

    public String getName() {
        return name;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    @Override
    public void store() {
        Storage.addCosutmer(this);
    }
}
