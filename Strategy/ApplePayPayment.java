package Strategy;

public class ApplePayPayment implements PaymentStrategy{
    private String appleID;

    ApplePayPayment(String appleID){
        this.appleID = appleID;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " amount paid using Apple Pay [" + appleID + "]");
    }
}
