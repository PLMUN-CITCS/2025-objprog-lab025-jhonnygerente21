class Item {
    
    private String name;
    private static int itemCount = 0; // Static variable to count objects

    
    public Item(String name) {
        this.name = name;
        itemCount++; // Increment count when object is created
    }

    
    public void displayItem() {
        System.out.println("Item: " + name);
    }

    
    public static int getItemCount() {
        return itemCount;
    }
}


public class ItemDemo {
    public static void main(String[] args) {
        // Create objects of Item class
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Display item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        
        System.out.println("Total objects created: " + Item.getItemCount());
    }
}
