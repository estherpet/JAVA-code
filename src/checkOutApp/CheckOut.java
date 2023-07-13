package checkOutApp;

import java.util.ArrayList;
import java.util.List;

public class CheckOut {
    private String name;
    private String productPurchased;
    private  int quantity;
    private int amount;
    private  String cashierName;
    private String more;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductPurchased() {
        return productPurchased;
    }

    public void setProductPurchased(String productPurchased) {
        this.productPurchased = productPurchased;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    List<Product> products = new ArrayList<>();
    public int discount(double discountPercentage){
        int discount;
        discount = (int) (discountPercentage/ 100 * subTotal());
        return discount;
    }

    public int buy (int quantity, int price){
        Product product = new Product();
        product.setQuantity(quantity);
        product.setPrice(price);
        int value = price * quantity;
        product.setValue(value);
        products.add(product);
        return value;
    }
    public int productCount(){
        return products.size();
    }
    public int VAT(){
        int vat = (int) (subTotal() * 17.50 / 100);
        return vat;
    }
    public int billTotal(){
        int discountPercentage = 8;
         int billtotal;
        billtotal = subTotal()+ VAT() - discount(discountPercentage);
        return billtotal;
    }
    public int balance(int amountPaid){
if (amountPaid < 0) throw new IllegalArgumentException("invalid amount");
return amountPaid - billTotal();
    }
    public int subTotal() {
        int subtotal =0;
        for (Product product1: products){
            subtotal+= product1.getValue();
        }
        return subtotal;
    }
}
