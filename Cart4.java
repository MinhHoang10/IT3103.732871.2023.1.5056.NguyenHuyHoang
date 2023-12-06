import java.util.ArrayList;

public class Cart4 {
    public static final int MAX_NUMBER_ORDERED = 20;
    
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    

    public void displayCart() {
        System.out.println("***********************CART***********************");
        double total = 0;
        for (DigitalVideoDisc4 disc : itemsOrder) {
            System.out.printf("%-20s %-15s %-20s %-5d %-5.2f \n", disc.getTitle(), disc.getCategory(),
                    disc.getDirector(), disc.getLength(), disc.getCost());
            total += disc.getCost();
        }
        System.out.printf("Total cost: %.2f\n", total);
    }

    public double totalCost() {
        double total = 0;
        for (Media m : itemsOrdered) {
            total += (double) m.getCost();
        }
        return total;
    }

    public boolean addMedia(Media m) {
            if (itemsOrdered.size() >= MAX_NUMBER_ORDERED) {
                return false;
            } else {
                itemsOrdered.add(m);
                return true;
            }
    }

    public boolean removeMedia(Media m) {
            if (itemsOrdered.contains(m)) {
                itemsOrdered.remove(m);
                System.out.println("media is removed successfully!");
                return true;
            } else {
                System.out.println("media is removed unsuccessfully");
                return false;
            }
    }

}
