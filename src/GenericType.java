public abstract class GenericType {

    private Types type;

    public GenericType(Types type){
        switch (type) {
            case VENDOR: return new Vendor(); break;
            case COSTUMER:
                break;
        }
    }

    public Types getType() {
        return type;
    }
}
