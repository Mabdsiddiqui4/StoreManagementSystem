package system;
// Ahmad Almori
// Muhammad Abdur Rahman Siddiqui  157260
import java.util.Scanner;
import models.Customer;
import models.Electronics;
import models.Food;
import models.Product;
// Ahmad Almori
/**
 *
 * @author KMNS Ahmad Almori
 */
public class Menu {

    public void displayMenu() {
        Store myStore = new Store();
        Scanner in = new Scanner(System.in);
        DataManager.printHeader();
        int out = 2;
        while (out == 2) {

            System.out.println(DataManager.line);
            System.out.println("1- Add Product ");
            System.out.println("2- Add Customer ");
            System.out.println("3- Show Products ");
            System.out.println("4- Search Product By ID ");
            System.out.println("5- Exit");
            System.out.print("The number : ");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Select Product Type:");
                    System.out.println("1. General Product");
                    System.out.println("2. Electronics");
                    System.out.println("3. Food");
                    System.out.print("Your choice: ");
                    int type = in.nextInt();
                    
                    
                    
                    
                    System.out.print("Id of the product :");
                    int id = in.nextInt();
                    System.out.print("name of the product :");
                    String name = in.next();
                    System.out.print("price of the product :");
                    double price = in.nextDouble();
                    
                    Product newProduct = null;
                    
                    if (type == 2) {
                        System.out.print("Enter warranty years: ");
                        int warranty = in.nextInt();
                        newProduct = new Electronics(id, name, price, warranty);
                    } else if (type == 3) {
                        System.out.print("Enter expiration date (e.g., 2026-12-31): ");
                        String expDate = in.next();
                        newProduct = new Food(id, name, price, expDate);
                    } else {
                            
                        
                    newProduct = new Product(id, name, price);
                    }
                    
                   
                    myStore.addProduct(newProduct);
                    break;
                case 2:
                    System.out.print("Id of the Customer :");
                    int idc = in.nextInt();
                    System.out.print("name of the Customer :");
                    String namec = in.next();
                    System.out.print("phone of the Customer :");
                    String phone = in.next();
                    
                    Customer newCustomer = new Customer(idc, namec, phone);
                    myStore.addCustomer(newCustomer);
                    break;
                case 3:
                    myStore.showProducts();
                    break;
                case 4:
                    System.out.print("put the ID : ");
                    int Id = in.nextInt();
                    Product found = myStore.findProduct(Id);
                    if (found != null ) {
                    System.out.println("the product = " + found.allproduct());
                    }else {
                        System.out.println("not found");
                    }
                        
                    break;
                case 5:
                    System.out.println("thanks you for useing my java app");
                    out = 0;
                    break;
                default:
                    System.out.print("choes 1 - 5 ");
            }
        }
    }
}
