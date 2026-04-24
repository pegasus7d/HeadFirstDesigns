public class ShippedState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel, already shipped.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is SHIPPED");
    }
}
