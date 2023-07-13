package checkOutApp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static  final CheckOut checkOut = new CheckOut();
    private  static final Product product = new Product();
    private static final LocalDateTime dateOfPurchase = LocalDateTime.now();

    public static void main(String[] args) {
question();
    }
    private  static void question(){
     String name = input("What is the customer name");
     String item = input("What did the user buy");
     String quantity = input("How many pieces");
     String price = input("How much per unit?");
     String addMore = input("Add more items?");
     String cashierName = input("what is your name");
     discount();

    }
    private static void discount(){
        String discount = input("How much discount will he get");
        checkOut.discount(Double.parseDouble(discount));
    }
        private static String string(){
            return "CheckOut{" +
                    "name='" + checkOut.getName() + '\'' +
                    ", productPurchased='" +checkOut.getProductPurchased() + '\'' +
                    ", quantity=" +checkOut.getQuantity() +
                    ", amount=" + checkOut.getAmount() +
                    ", cashierName='" +checkOut.getCashierName()+ '\'' +
                    ", more='" +checkOut.getMore() + '\'' +
                    ", products=" +checkOut.getProducts()+
                    '}';
        }
        public static void buy(){
        product
        }



//        display("SEMICOLON STORE");
//        display("MAIN BRANCH");
//        display("LOCATION:312,HERBERT MACULAY WAY, SABO YABA,LAGOS");
//        display("TEL: 03293828343");
//        display(String.valueOf(dateOfPurchase));
//        display("CASHIER :");
//        display("CUSTOMER NAME:");

    public static void display(String message){
        System.out.println(message);

    }
    private static  String input(String prompt){
        display(prompt);
        return scanner.nextLine();
    }
}
