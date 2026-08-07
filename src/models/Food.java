/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
// Ahmad Almori
// Muhammad Abdur Rahman Siddiqui  157260
/**
 *
 * @author KMNS
 */
public class Food extends Product {
    /*   : ويحتوي على expiryDate   */
    private String expiryDate;

    public Food(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }
//    public Food(int expiryDate){
//        this.expiryDate = expiryDate;
//    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Food{" + "expiryDate=" + expiryDate + '}';
    }
    
    public String allproduct() {
        return "  id=" + this.getId() + " , name=" + this.getName() + " , price=" + this.getPrice() + " , expiryDate=" + expiryDate + ' ';
    }
}
