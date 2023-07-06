import java.util.ArrayList;
public class TestOrders {
public static void main(String[] args) {
// Menu items
// Order variables -- order1, order2 etc.
// Application Simulations
// Use this example code to test various orders' updates
Item item1= new Item("Cofee", 10) ;
Item item2= new Item("Tea", 40) ;
Item item3= new Item("Cappuciano", 30) ;
Item item4= new Item("Latee", 20) ;
Order order1= new Order(item1,"Sam", false);
Order order2= new Order(item1,"Sam", false);
Order order3= new Order(item1,"Sam", false);
Order order4= new Order(item1,"Sam", false);


order1.addItem(item4);
order1.addItem(item4);
order1.addItem(item4);
System.out.printf("Name: %s\n", order1.name);
System.out.printf("Total: %s\n", order1.total);
System.out.printf("Ready: %s\n", order1.items.get(1).name);
}
}