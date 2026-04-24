public class DeliveredState implements OrderState {

    @Override
    public void next(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Cannot cancel, already delivered.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is DELIVERED");
    }
}
