package oop24;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Cooker cooker = new Cooker("厨师");
        customer.order(cooker);

    }
}
