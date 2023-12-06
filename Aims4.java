
import AimsProject.DigitalVideoDisc;
import AimsProject.cart;

public class Aims4 {
    public static void main(String[] args){
        cart anOrder = new cart();//create a new cart
        DigitalVideoDisc4 dvd1 = new DigitalVideoDisc4("The Lion King","Animation",
                                  "Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc4(dvd1);

        DigitalVideoDisc4 dvd2 = new DigitalVideoDisc4("Star Wars", "Science Fiction",
                                "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc4(dvd2);

        DigitalVideoDisc4 dvd3 = new DigitalVideoDisc4("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc4(dvd3);

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
