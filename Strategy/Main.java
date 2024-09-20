package Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9123-4567", "Ameya Kale"));
        paymentContext.pay(150);

        paymentContext.setPaymentStrategy(new PayPalPayment("ameya@paypal.com"));
        paymentContext.pay(300);

        paymentContext.setPaymentStrategy(new ApplePayPayment("ameya@apple.com"));
        paymentContext.pay(500);
    }
}
