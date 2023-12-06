package OopLab4;
//Nguyen Huy Hoang 20215056
import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    void addAuthor(String authorName){
        int n = authors.size();
        int check = 0 ;
        for(int i = 0 ; i <= n ; i ++){
            if(authors.get(i) == authorName){
                check = 1 ;
                break;
            }
        }
        if (check == 1) System.out.println("This author name already existed ");
        if ( check == 0 ) authors.add(authorName);
    }

    void removeAuthor(String authorName){
        int n = authors.size();
		int check = 0;
		for (int i = 0; i<= n; i++) {
			if (authors.get(i)== authorName) {
				check = i;
				break;
			}
		}
		if (check == 0) System.out.println("This author name doesn't exist!");
		else authors.remove(check);
    }
}
