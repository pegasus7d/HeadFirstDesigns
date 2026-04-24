public class PaytmAdapter implements PaymentProcessor{
    private PaytmGateway paytm;

    public PaytmAdapter(PaytmGateway paytm) {
        this.paytm = paytm;
    }

    @Override
    public void pay(int amount) {
        // Convert interface
        paytm.makePayment(amount);
    }
}
