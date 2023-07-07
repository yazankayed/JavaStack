import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    ArrayList<Items> items = new ArrayList<Items>();

    public Order(String name) {
        this.name = name;
        this.total = 0;

    }

    public void addItem(Items itemAdded) {

        this.items.add(itemAdded);
        this.total = this.total + this.items.get(this.items.size() - 1).price;
    }

}