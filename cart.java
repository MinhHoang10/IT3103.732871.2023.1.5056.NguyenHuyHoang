package AimsProject;

import java.util.ArrayList;

public class cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    //private DigitalVideoDisc itemsOrder = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    ArrayList<DigitalVideoDisc> itemsOrder = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered;
    public int getQtyOrder(){
        return qtyOrdered;
    }

    // Add DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrder.add(disc);
            qtyOrdered++;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    //print list DVD ordered
    public void displayCart(){
        System.out.println("------- Cart Display -------");
        for (DigitalVideoDisc disc : itemsOrder){
            System.out.printf("%-20s %-15s %-20s %-5d %-5.2f \n",disc.getTitle(),disc.getCategory(),
                            disc.getDirector(), disc.getLength(), disc.getCost());
        }
    }

    // Calculate totalCost DVD ordered
    public double totalCost(){
        double total = 0 ;
        for (DigitalVideoDisc disc : itemsOrder) {
            total +=(double) disc.getCost();
        }
        return total;
    }

    //Remove DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        itemsOrder.remove(disc);
        qtyOrdered--;
        System.out.printf("The disc %s has been removed\n", disc.getTitle());
    }
}
