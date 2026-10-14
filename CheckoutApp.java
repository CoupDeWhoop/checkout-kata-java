public class CheckoutApp {
    public static void main(String[] args) {
        var checkout = new DefaultCheckout();
        checkout.Scan("item1");
        int totalPrice = checkout.GetTotalPrice();
        System.out.println("Total Price: " + totalPrice);
    }
} 