// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //================================= DAY01
        /*
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
        /*
        Product product01 = new Product(1, "Lenovo V14", 12000, "16 GB Ram"); //intance creation
        Product product02 = new Product(2, "Lenovo V15", 14000, "6 GB Ram");
        Product product03 = new Product(3, "Lenovo V16", 16000, "20 GB Ram");



        Product[] products ={product01, product02, product03};

        for (Product product: products){
            System.out.println(product.id);
            System.out.println(product.name);
            System.out.println(product.unitPrice);
            System.out.println(product.detail);
        }

        System.out.println(products.length);

        Category caregory01 = new Category();
        caregory01.id=1;
        caregory01.name = "Ev/Bahce";

        //Metod tutan class olusturma, cagirma ve parametre gönderme!
        ProductManger productManger = new ProductManger();
        productManger.addToCart(product01);
        productManger.addToCart(product02);
        productManger.addToCart(product03);

     */

        //DAY03
        /*
        Product product01 = new Product(1, "Lenovo V14", 12000, "16 GB Ram",10);

        Product product02 = new Product();
        product02.setId(2);
        product02.setName("HP");
        product02.setDetail("16 GB Ram");
        product02.setDiscount(10);
        product02.setUnitPrice(16000);
        System.out.println(product02.getUnitPriceAfterDiscount());

         */
        /*
        //Inheritance - Polimorfizm
        IndividualCustomer nizami = new IndividualCustomer();
        nizami.customerNumber = "11111";

        CorparateCustomer sony = new CorparateCustomer();
        sony.customerNumber = "22222";

        CustumerManager custumerManager = new CustumerManager();
        //custumerManager.add(nizami);
        //custumerManager.add(sony);

        Customer[] customers = {nizami, sony};
        custumerManager.addMultiple(customers);

         */
        //Inheritance2
        

    }
}