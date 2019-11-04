public abstract class GenericType {

    public static GenericType identify(String[] lineData){
        String identifier = lineData[0];
        switch (identifier) {
            case "001":
                return new Vendor(lineData);
            case "002":
                return new Costumer();
        }
        return null;
    }

    public abstract void store(Storage storage);
}