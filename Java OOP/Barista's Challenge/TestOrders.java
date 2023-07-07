public class TestOrders {
    public static void main(String[] args) {
    
        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Saeed");
        Order order4 = new Order("Riyad");
        Order order5 = new Order("Ameer");

        order1.addItem(new Items("mocha", 4.0));
        order1.addItem(new Items("latte", 3.0));
        order2.addItem(new Items("drip coffee", 5.0));
        order2.addItem(new Items("cappuccino", 2.5));
        order3.addItem(new Items("orange juice", 2.0));
        order3.addItem(new Items("apple juice", 3.0));
        order4.addItem(new Items("tea", 5.0));
        order4.addItem(new Items("green tea", 3.5));
        order5.addItem(new Items("farphacinho", 3.0));
        order5.addItem(new Items("water", 2.0));

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    
        order4.setReady(true);
        order5.setReady(true);

        System.out.println(order3.getName() + ", " + order3.getStatusMessage());
        System.out.println(order4.getName() + ", " + order4.getStatusMessage());
        System.out.println(order5.getName() + ", " + order5.getStatusMessage());

    }
}