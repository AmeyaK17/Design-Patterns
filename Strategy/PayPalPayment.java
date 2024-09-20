package Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    PayPalPayment(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " amount paid by PayPal [" + email + "]");
    }
}
