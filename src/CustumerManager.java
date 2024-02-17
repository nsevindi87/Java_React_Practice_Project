public class CustumerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " Kaydedildi");
    }

    //Bulk Insert
    public void addMultiple (Customer[] customers){
        for(Customer customer: customers){
            add(customer);
        }
    }
}
