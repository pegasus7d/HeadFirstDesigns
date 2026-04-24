public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.printStatus();  // NEW
        order.nextState();

        order.printStatus();  // PAID
        order.nextState();

        order.printStatus();  // SHIPPED
        order.nextState();

        order.printStatus();  // DELIVERED

        order.cancelOrder();  // Not allowed
    }
}
