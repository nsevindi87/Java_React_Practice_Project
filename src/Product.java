
public class Product {
    //Constructer Blog- yazilmasa da calisir ancak ekstra bir seyler yapilmak isteniyorsa yazilabilir.
    //Birden fazla varsa sadece biri kullanilir

    //FIELD
    int id;
    String name;
    double unitPrice;
    String detail;

    public Product(){
        System.out.println("Ben Calistim");
    }

    //Generate it
    public Product(int id, String name, double unitPrice, String detail) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
/* //CONSTRUCTERS
    public Product(){
        System.out.println("ben calistim");
    };

    public Product(int id, String name, double unitPrice, String detail){
        this(); //bu classtaki parametresiz olan contructeri calistir. Birbirini calistirabilir.
        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;
        this.detail=detail;
    };*/


}
