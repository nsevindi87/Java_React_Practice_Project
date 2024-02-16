// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        ================================= DAY01
        //VARIABLES
        String newValue = "Hello World";
        int newNumber = 13;
        double dollarValue = 33.3;
        double dollarNewValue = 34.4;
        boolean isEqual = true;
        System.out.println(newValue);

        //IF CONDITION
        if(dollarValue>dollarNewValue){
            System.out.println("Yükseldi");
        }else{
            System.out.println("düstü");
        }

        //ARRAYS
        String[] values ={
                "Value01",
                "Value02",
                "Value03"
        };

        //FOREACH
        for(String value: values){
            System.out.println(value);
        }

        for(int i =0; i<values.length; i++){
            System.out.println(values[i]);
        }
         */

        //================================= DAY02

        Product product01 = new Product(); //intance creation
        product01.id =1;
        product01.name ="Lenovo V14";
        product01.unitPrice =12000;
        product01.detail="16 GB Ram";

        Product product02 = new Product();
        product02.id =2;
        product02.name ="Lenovo V15";
        product02.unitPrice =15000;
        product02.detail="16 GB Ram";

        Product product03 = new Product();
        product03.id =3;
        product03.name ="Lenovo V16";
        product03.unitPrice =14000;
        product03.detail="8 GB Ram";


        Product[] products ={product01, product02, product03};

        for (Product product: products){
            System.out.println(product.name);
        }

        System.out.println(products.length);

    }
}