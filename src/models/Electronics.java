package models;
// Ahmad Almori
// Muhammad Abdur Rahman Siddiqui  157260
/**
 *
 * @author KMNS
 */
public class  Electronics extends Product {
    private int warrantyYears;
    private final int date = 0;

    public int getDate() {
        return date;
    }

    public Electronics( int id, String name, double price, int warrantyYears) {
        super(id, name, price);
        this.warrantyYears = warrantyYears;
    }
    
    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public String toString() {
        return "Electronics{" + "warrantyYears=" + warrantyYears + '}';
    }
    public String allproduct() {
        return "  id=" + this.getId() + " , name=" + this.getName() + " , price=" + this.getPrice() + " , warrantyYears=" + warrantyYears + ' ';
    }
}
