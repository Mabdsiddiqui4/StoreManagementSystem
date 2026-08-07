package system;
// Ahmad Almori
// Muhammad Abdur Rahman Siddiqui  157260
import models.Product;
import models.Customer;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author KMNS
 */
/*   : ويستخدم ArrayList<Product> 
     ArrayList<Customer>
     HashMap<Integer, Product>   */
public class Store {

    public Store(ArrayList<Customer> customers, ArrayList<Product> productList, HashMap<Integer, Product> productMap) {
        this.customers = customers;
        this.productList = productList;
        this.productMap = productMap;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    private ArrayList<Customer> customers;
    private ArrayList<Product> productList;
    private HashMap<Integer, Product> productMap;

    public Store() {
        this.customers = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.productMap = new HashMap<>();

    }

    public void addProduct(Product Product) {
        productList.add(Product);
        
        productMap.put(Product.getId(), Product);
        
    }
    public void addCustomer (Customer Customer){
        customers.add(Customer);
        
        
    }

    public void showProducts (){
        for (int i = 0; i < productList.size(); i++) {
            Product currentProduct  = productList.get(i);
            System.out.println((i+1) + " = " + currentProduct.allproduct() );
        }
    }
    
    public Product findProduct(int id) {
        return productMap.get(id); 
    }
    
    @Override
    public String toString() {
        return "Store{" + "customers=" + customers + ", productList=" + productList + ", productMap=" + productMap + '}';
    }

}
