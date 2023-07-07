import java.util.ArrayList;

public class Order {
    public String name;
    public int total;
    public boolean ready;
    ArrayList<Items> items = new ArrayList<Items>();

    public Order (Items itemAdded, String name, boolean ready){
this.name=name;
this.total=0;
this.ready=ready;

this.items.add(itemAdded);
this.total=this.total+   this.items.get(0).price;


    }
    
    public void addItem(Items itemAdded){
        this.items.add(itemAdded);
        this.total= this.total +   this.items.get(this.items.size()-1).price;
    }




}