public class TestOrders {
public static void main(String[] args) {
// Menu items
// Order variables -- order1, order2 etc.
// Application Simulations
// Use this example code to test various orders' updates
Items item1= new Items("Cofee", 10) ;
Items item2= new Items("Tea", 40) ;
Items item3= new Items("Cappuciano", 30) ;
Items item4= new Items("Latee", 20) ;
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