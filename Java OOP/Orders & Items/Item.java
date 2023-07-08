
public class Item {
    public String name;
    public int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Item s = (Item) o;
        boolean n = this.name.equals(s.name);
        boolean p = this.price == s.price;
        return (n && p);

    }

}