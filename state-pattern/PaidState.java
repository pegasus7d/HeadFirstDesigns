public class PaidState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Refund initiated.");
        order.setState(new NewState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order is PAID");
    }
}
