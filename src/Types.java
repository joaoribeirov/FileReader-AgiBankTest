public enum Types {
    VENDOR("001", new Vendor()),
    COSTUMER("002", new Costumer());

    private final String identifier;
    private final GenericType type;

    Types(String identifier,  GenericType type){
        this.identifier = identifier;
        this.type = type;
    }
}
