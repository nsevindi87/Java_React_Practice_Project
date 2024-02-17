
public class Product {
    //Constructer Blog- yazilmasa da calisir ancak ekstra bir seyler yapilmak isteniyorsa yazilabilir.
    //Birden fazla varsa sadece biri kullanilir

 /*   //FIELD
    int id;
    String name;
    double unitPrice;
    String detail;


 //CONSTRUCTERS
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

    //DAY03
    //FIELD
    //encapsulation
    private int id; //private sadece bu classta erisilebildigi anlamina gelir.
    private String name;
    private double unitPrice;
    private String detail;
    private double discount;

    public Product(){
        System.out.println("ben calistim");
    };

    //Generate
    public Product(int id, String name, double unitPrice, String detail, double discount) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
        this.discount = discount;
    }

    //GETTER SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice-(this.unitPrice*this.discount/100);
    }


}
