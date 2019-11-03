public class Factory {

    public static void logData(String[] line) {
        GenericType lineType = GenericType.identify(line);
        if (!(lineType == null)){

        }else{
            System.out.println("Tipo nao reconhecido");
        }


//        Types types = new Types(line[0]);
    }

/*    public GenericType identify(String type){
        Vendor vendor = new Vendor();
        vendor.type;
    }*/
}
