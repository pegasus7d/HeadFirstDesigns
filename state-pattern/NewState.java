public class NewState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new PaidState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is NEW");
    }
}
