import java.util.Arrays;

public abstract class GenericType {

    private Types type;

    public static GenericType identify(String[] lineData){
        String identifier = lineData[0];
//        String buffer = Arrays.(lineData, 1)
        switch (identifier) {
            case "001":
                return new Vendor(lineData);
            case "002":
                return new Costumer();
        }
        return null;
    }

    public abstract void store(Logger logger);
/*
    public Types getType() {
        return type;
    }*/
}