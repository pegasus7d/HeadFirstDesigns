public class Main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor =
                new PaytmAdapter(new PaytmGateway());

        paymentProcessor.pay(1000);
    }
}
