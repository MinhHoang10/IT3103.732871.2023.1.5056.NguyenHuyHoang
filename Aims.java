package AimsProject;
import AimsProject.DigitalVideoDisc;
import AimsProject.cart;

public class Aims {
    public static void main(String[] args){
        cart anOrder = new cart();//create a new cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation",
                                  "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                                "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println();
        anOrder.displayCart(); // Cart Display DVD details



        //print total cost of the items in the cart
        System.out.println("Total Cost is : ");
        System.out.println(anOrder.totalCost());

        //Remove DVD from cart
        System.out.println();
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.displayCart();
    }
}
