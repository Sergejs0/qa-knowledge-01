import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void workingWithOrders() {
        Order firstOrder = new Order();
        firstOrder.setTotalPrice(11.86);
        firstOrder.setAdress("Rigas iela. 34");
        firstOrder.setQuantity(7);

        Order secondOrder = new Order();
        secondOrder.setTotalPrice(15.65);
        secondOrder.setAdress("Grivas iela 15");
        secondOrder.setQuantity(3);

        System.out.println("Hello, World!!!");
        System.out.println("First order");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("Second Order");
        System.out.println(secondOrder.getTotalPrice());
    }
}
