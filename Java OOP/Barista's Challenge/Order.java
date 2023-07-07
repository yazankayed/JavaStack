import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Items> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Items>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Items>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Items> getItems() {
        return this.items;
    }

    public void addItem(Items item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready == true){
            return "Your order is ready";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " - " + this.items.get(i).getPrice() + "$ ");
        }
        System.out.println("Total: " + getOrderTotal() + "$ ");
    }

    public double getOrderTotal(){
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }
}