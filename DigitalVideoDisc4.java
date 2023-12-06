
public class DigitalVideoDisc4 extends Media implements Playable {
    //private String title;
    //private String category;
    //private String director;
    //private int length;
    //private float cost;
    //private static int DigitalVideoDisc = 0 ;
    
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getDirector(){
        return director;
    }
    public int getLength(){
        return length;
    }
    public double getCost(){
        return cost;
    }

    public DigitalVideoDisc3(String title) {
        super();
        this.title = title;
    }

    public DigitalVideoDisc3(String title, String category, float cost){
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc3(String title, String category, String director , float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc3(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String toString(){
    	StringBuffer printDisc = new StringBuffer();
        printDisc.append("DVD");
        printDisc.append(" - ");
        printDisc.append(title);
        printDisc.append(" - ");
        printDisc.append(category);
        printDisc.append(" - ");
        printDisc.append(director);
        printDisc.append(" - ");
        printDisc.append(length);
        printDisc.append(": ");
        printDisc.append(cost);
        return  printDisc.toString();
    }

    @Override
    public void play(){
        System.out.println("Playing DVD : " + this.getTitle());
        System.out.println("DVD length : " + this.getTitle());
    }
}
