package Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String creditCardNumber;
    private String creditCardHolder;

    CreditCardPayment(String creditCardNumber, String creditCardHolder){
        this.creditCardNumber = creditCardNumber;
        this.creditCardHolder = creditCardHolder;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " amount paid by Credit Card [" + creditCardNumber + "]");
    }
}
