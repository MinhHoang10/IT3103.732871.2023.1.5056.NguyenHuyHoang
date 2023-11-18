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


    
    //Them danh sach DVD vao gio hang
    public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (int i = 0 ; i < dvdList.length ; i++){
            if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrder.add(dvdList[i]);
            qtyOrdered++;
        } else {
            System.out.println("The cart is almost full");
            return false;
        }
        System.out.println("The disc has been added");
        return true;
        }
    }
    
    //Them so luong DVD ngau nhien
    public boolean addDigitalVideoDisc(DigitalVideoDisc...dvdList){
        for (int i = 0 ; i < dvdList.length ; i++){
            if(qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsOrder.add(dvdList[i]);
            qtyOrdered++;
        } else {
            System.out.println("The cart is almost full");
            return false;
        }
        System.out.println("The disc has been added");
        return true;
        }
    }

    

    public void addDigitalVideoDisc (int qty,DigitalVideoDisc [] dvdList){
        
        if (qtyOrdered + qty < MAX_NUMBER_ORDERED){
            for ( int i = 1 ; i <= qty ; i ++ ) { 
            itemsOrder.add(dvdList[i]);
            qtyOrdered ++;
            //System.out.println("This disc has been added");
        }
        }  else {
            System.out.println("The cart is almost full");
        }
    
    }

    //Them 2 dvd vao gio hang
    public void addDigitalVideoDisc( DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if ( qtyOrdered + 2 < MAX_NUMBER_ORDERED){
            itemsOrder.add(dvd1);
            qtyOrdered++;
            itemsOrder.add(dvd2);
            qtyOrdered++;
            System.out.println("This 2 disc has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }
}
