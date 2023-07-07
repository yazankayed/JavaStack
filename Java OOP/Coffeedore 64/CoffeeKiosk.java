import java.util.ArrayList;

public class CoffeeKiosk {
    public ArrayList<Items> menu = new ArrayList<Items>();
    public ArrayList<Order> orders = new ArrayList<Order>();

    public void addMenuItem(String name, double price) {
        Items item1 = new Items(name, price);
        this.menu.add(item1);

    }

    public void displayMenu() {
        for (int i = 0; i < menu.size() - 1; i++)
            System.out.println(i + " " + menu.get(i).name + "--" + "$" + menu.get(i).price);
    }
}
