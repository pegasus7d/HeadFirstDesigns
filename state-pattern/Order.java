public class Order {

    private OrderState state;

    public Order() {
        this.state = new NewState(); // initial state
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void cancelOrder() {
        state.cancel(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
